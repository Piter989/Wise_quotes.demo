package utils;

import java.net.*;
import java.net.http.*;	

public class QuoteGenerator
{
	public static String getQuote()
	{   
		try
		{
		String content = RequestHelper.getContent("https://theysaidso.com/quote-of-the-day/");
		content = getPreciseContent(content, "Inspiring Quote of the day");
	
		return getQuote(content);
		}
		catch (Exception e)
		{
			return "No quote";
		}
		
	}
	
	public static String getAuthor()
	{
		try
		{
		
		String content = RequestHelper.getContent("https://theysaidso.com/quote-of-the-day/");
		content = getPreciseContent(content, "Inspiring Quote of the day");
		 
		return getAuthor(content);
		}
		catch (Exception e)
		{
			return "No Author";
		}
		
	
	}
	private static String getQuote (String content)
	{
		int indexOfSpan = content.indexOf("<span itemprop=\"text\">");
		int indexOfSpanClosed = content.indexOf("</span>",indexOfSpan);
		int spanLength = "<span itemprop=\"text\">".length();
		return content.substring(indexOfSpan + spanLength,indexOfSpanClosed);
		
	}
	private static String getAuthor (String content)
	{
		int indexOfSpan = content.indexOf("<span itemprop=\"name\">");
		int indexOfSpanClosed = content.indexOf("</span>",indexOfSpan);
		int spanLength = "<span itemprop=\"name\">".length();
		return content.substring(indexOfSpan + spanLength,indexOfSpanClosed);
	}
	
	
	private static String getPreciseContent(String content,String discriminator)
		{	
			int indexOfTitle = content.indexOf("title=\"" + discriminator + "\"");
			content = content.substring(indexOfTitle);				
			int indexOfLead = content.indexOf("<p class=\"lead\">");
			content = content.substring(indexOfLead);
			return content;
		}
			
}		
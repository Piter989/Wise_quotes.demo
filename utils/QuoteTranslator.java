package pl.honestit.demo.utils;

import java.net.*;
import java.net.http.*;

public class QuoteTranslator
{
	public static String translate (String quote)
	{
		try
		{
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse response = client.send(
											HttpRequest.newBuilder()
												.uri(URI.create("https://www.tlumaczangielskopolski.pl/wp-content/themes/translatica/inc/translate/translator.php?from=en&to=pl&text="+URLEncoder.encode(quote,"UTF-8")))
												.GET()
												.build(),
												HttpResponse.BodyHandlers.ofString());
		String content = (String) response.body();
		int indexOfBracketStart = content.indexOf("[");
		int indexOfBracketStop = content.lastIndexOf("]");
		String trnslation = content.substring(indexOfBracketStart+2,indexOfBracketStop-1);

												
		return trnslation;
		
		}
		catch (Exception e)
		{
			return "No trnalator";
		}
		
	}
	
	
}
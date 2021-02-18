package utils;

import pl.honestit.demo.utils.QuoteTranslator;

import java.util.Scanner;




public class QuotesApp
{
	
private static String frameBorder= "*";	
	
	
	public static void main (String[] args)
	{	
		System.out.print("\n\n~~Zapraszamy do udziału!!~~\n\n");
		String quote = QuoteGenerator.getQuote();
		String author= QuoteGenerator.getAuthor();
		String translateQuote= QuoteTranslator.translate(quote);	
		
		int quoteLength = quote.length()+6;
		
	
		System.out.println("Cytat na dzisiaj");
		printFrameBorder(quoteLength);
		printFrameEmptyLine(quoteLength);
		printFrameQuoteLine(quote);
		printFrameAuthorLine(author,quoteLength);
		printFrameEmptyLine(quoteLength);
		printFrameBorder(quoteLength);

	
		System.out.println("Po polsku");
		System.out.println();
		
		quoteLength = translateQuote.length()+6;
		printFrameBorder(quoteLength);
		printFrameEmptyLine(quoteLength);
		printFrameQuoteLine(translateQuote);
		printFrameAuthorLine(author,quoteLength);
		printFrameEmptyLine(quoteLength);
		printFrameBorder(quoteLength);
			
		System.out.println();
		
		promptEnd("Wpisz tekst aby wyłączyć program  ");
		
	}
	
	public static void printFrameAuthorLine(String author, int length)
	{
		System.out.print(frameBorder + "  ");
		int linePadding = length - ( 2 * 3 ) - 4 - author.length();
		for(int i =0;i<linePadding;i++)
		{
			System.out.print(" ");
		}
		System.out.print("~~~ "+author);
		System.out.print("  " + frameBorder);
		System.out.println();
	}
	
	public static void printFrameQuoteLine (String quote)
	{
		System.out.println(frameBorder+"  "+quote+"  "+frameBorder);
		
	}
	
	public static void printFrameEmptyLine(int length)
	{
		for(int i =0;i<length;i++)
		{
			if(i==0|| i==length-1)
			{
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	
	}
	
	
	public static void printFrameBorder (int length)
	{
		for(int i =0;i<length;i++)
		{
			System.out.print(frameBorder);
		}
		System.out.println();
		
	
	}
	private static Scanner scanner = new Scanner(System.in);
	
	public static void promptEnd (String promptText)
	{
		System.out.print(promptText);
		scanner.next();
	}
	
	
}
package pl.honestit.demo;

import java.util.Scanner;

public class Prompt {

    private static Scanner scanner = new Scanner(System.in);

    public static int promptInt(String promptText) {
        System.out.print(promptText);
        int value = scanner.nextInt();
        return value;
    }

    public static long promptLong(String promptText) {
        System.out.print(promptText);
        long value = scanner.nextLong();
        return value;
    }

    public static float promptFloat(String promptText) {
        System.out.print(promptText);
        float value = scanner.nextFloat();
        return value;
    }

    public static double promptDouble(String promptText) {
        System.out.print(promptText);
        double value = scanner.nextDouble();
        return value;
    }
	
	public static void promptEnd (String promptText)
	{
		System.out.print(promptText);
		scanner.next();
	}
	
	public static char promptChar(String promptText) 
	{
		System.out.print(promptText);
        String word = scanner.next();
        char value = word.charAt(0);
        return value;
	}
}

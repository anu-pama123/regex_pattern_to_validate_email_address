package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailAddressValidateBuilder
{
    public static boolean checkPattern(String input, String patternNum)
    {
        Pattern pattern = Pattern.compile(patternNum);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String input = "anu123.";
        String patternNum = "^[a-zA-Z0-9_-.]{3,}$";
        outputChecker(checkPattern(input, patternNum));
    }
    private static void outputChecker(boolean checkPattern)
    {
        if(checkPattern==true)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("InValid");
        }
    }
}

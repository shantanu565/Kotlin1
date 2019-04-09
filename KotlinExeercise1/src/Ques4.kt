import java.util.*

// Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String.

fun main(){
    val sc=Scanner(System.`in`)
    println("Enter your string")
    var s1=sc.nextLine()

    var totalChars: Int = s1.length
    var upperCaseLetters: Int = 0
    var lowerCaseLetters:Int = 0;
    var digits:Int = 0;
    var others:Int = 0;

    for (i in s1.length)
    {
        char ch = inputString.charAt(i);

        //If ch is in uppercase, then incrementing upperCaseLetters

        if(Character.isUpperCase(ch))
        {
            upperCaseLetters++;
        }

        //If ch is in lowercase, then incrementing lowerCaseLetters

        else if(Character.isLowerCase(ch))
        {
            lowerCaseLetters++;
        }

        //If ch is a digit, then incrementing digits

        else if (Character.isDigit(ch))
        {
            digits++;
        }

        //If ch is a special character then incrementing others

        else
        {
            others++;
        }
    }

    //Calculating percentage of uppercase letters, lowercase letters, digits and other characters

    double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;

    double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;

    double digitsPercentage = (digits * 100.0) / totalChars;

    double otherCharPercentage = (others * 100.0) / totalChars;

    DecimalFormat formatter = new DecimalFormat("##.##");

    //Printing percentage of uppercase letters, lowercase letters, digits and other characters

    System.out.println("In '"+inputString+"' : ");

    System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");

    System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");

    System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");

    System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");

    System.out.println("-----------------------------");
}
}
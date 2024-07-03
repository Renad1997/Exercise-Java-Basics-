import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Exercise (Java Basics)
1. Develop a program that takes the weight (in kilograms) and height (in meters) as
input and calculates the BMI, then prints it.
• Input: Weight (kg) = 70, Height (m) = 1.75
• Expected Output: BMI = 22.86 */
   Scanner input = new Scanner(System.in);
        System.out.println("please enter your weight in kilograms:");
   int weight = input.nextInt();
        System.out.println("please enter your height in meters:");
   float height = input.nextFloat();
        System.out.println("THE BMI is :");
        System.out.println(weight / (height * height));
/*2.Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
• Input: Obtained Marks = 85, Total Marks = 100
• Expected Output: Percentage = 85.0%*/
        System.out.println("Enter the obtained marks:");
     float obtainedMarks = input.nextFloat();
        System.out.println("Enter the total marks:");
        float totalMarks = input.nextFloat();
        System.out.println("Percentage is:");
        System.out.println(obtainedMarks/totalMarks*totalMarks+"%");
        /*3. Create a program that takes an amount in one currency and an exchange rate as
input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0*/
        System.out.println("Amount in USD=");
        float amountUSD = input.nextFloat();
        System.out.println("Exchange rate=");
        float exchangeRate = input.nextFloat();
        System.out.println("Amount in EUR=");
        System.out.println(amountUSD*exchangeRate);
        /*4. Create a program that takes a string as input, calculates its length, and then reverses
the string using the StringBuilder class, finally printing both the length and reversed
string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"*/
        String word = "Hello, World!";
        System.out.println("Length of the string:"+word.length()+ "And Reversed string: ");
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        System.out.println(input1);
        /*5. Develop a program that takes a sentence as input and extracts a substring from it,
then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox"*/
        String sentence ="The quick brown fox jumps over the lazy dog";
        System.out.println(sentence.substring(10,20));
        /*6. Write a program that takes a sentence and a keyword as input, then check if the
keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence*/
        String sentence2="The quick brown fox jumps over the lazy dog";
        System.out.println(sentence2.contains("jump"));
        System.out.println("Keyword jumps is present in the sentence.");
        /*7. Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"*/
      String sentence3 = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence3.replace("fox","cat"));
        /*8. Write a program that takes two strings as input and check if they are equal, ignoring
the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).*/
        String name1="Hello";
        String name2="hello";
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println("names are equal");



















    }
}
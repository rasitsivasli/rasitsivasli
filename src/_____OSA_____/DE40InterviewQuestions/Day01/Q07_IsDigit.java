package _____OSA_____.DE40InterviewQuestions.Day01;

import java.util.Scanner;

public class Q07_IsDigit {
    /* Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J4\/4 1$ 34$¥
    output : 16

    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();
        sum(str);

    }

    private static void sum(String str) {

        int sum = 0;
        for (char s : str.toCharArray()) {
            if (Character.isDigit(s)) {
                sum += Character.getNumericValue(s);
            }
        } System.out.println("sum = " + sum);
    }


}

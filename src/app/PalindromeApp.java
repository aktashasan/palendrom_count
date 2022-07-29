package app;

import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a text: ");
            var s = scanner.next();
            var p = "";
            var sb = new StringBuilder(s);
            sb.reverse();

            if (s.equals(sb.toString())) {
                System.out.println(s + " palendrom kelimedir.");
            } else
                System.out.println(s + " palendrom değildir.");
            System.out.println(sb);

        }
    }
}

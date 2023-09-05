package ch03_pjt_04;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Select Language! 1. Korea 2. English");

        int choice = scanner.nextInt();

        if (choice == 2) {
            System.out.println("Hello");
        } else if (choice == 1) {
            System.out.println("안녕하세요!");
        } else {
            System.out.println("Unsupported language.");
        }
    }
}
package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your full name:");
            String fullName = scanner.nextLine();

        String[] nameSections = fullName.split(" ");

        if (fullName.contains(",")) {
            if (nameSections.length == 3){
                System.out.println("First Name: " + nameSections[0]);
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: " + nameSections[1].replace(",", " "));

                System.out.println("Suffix: " + nameSections[2]);
            } else if (nameSections.length == 4) {
                System.out.println("First Name:" + nameSections[0]);
                if (nameSections[1].length() == 2){
                    System.out.println("Middle Initial: " + nameSections[1]);
                } else {
                    System.out.println("Middle Name: " + nameSections[1]);
                }
                System.out.println("Last Name: " + nameSections[2].replace(",", " "));
                System.out.println("Suffix: " + nameSections[3]);
            }
        } else {
            if (nameSections.length == 2) {
                System.out.println("First Name: " + nameSections[0]);
                System.out.println("Middle Name: (none)");
                System.out.println("Last Name: " + nameSections[1]);
            } else if (nameSections.length == 3){
                System.out.println("First Name: " + nameSections[0]);
                if (nameSections[1].length() == 2){
                    System.out.println("Middle Initial: " + nameSections[1]);
                } else {
                    System.out.println("Middle Name: " + nameSections[1]);
                }
                System.out.println("Last Name:" + nameSections[2]);
            }
        }

    }
}

package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your full name:");
            String fullName = scanner.nextLine();

        String[] nameSections = fullName.split("\\s");

        if (nameSections.length == 2){
            System.out.println("First Name:" + nameSections[0]);
            System.out.println("Last Name:" + nameSections[1]);
        } else if (nameSections.length == 3){
            System.out.println("First Name:" + nameSections[0]);
            System.out.println("Middle Name:" + nameSections[1]);
            System.out.println("Last Name:" + nameSections[2]);
        }

    }
}

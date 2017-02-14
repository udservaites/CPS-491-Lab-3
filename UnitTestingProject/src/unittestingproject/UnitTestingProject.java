/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingproject;

import java.util.Scanner;

/**
 *
 * @author Rebbecca
 */
public class UnitTestingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter your password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        if (findUpperCase(password) && findLowerCase(password) && findDigits(password) && findSpecialCharacter(password) && !findSpaces(password)) {
            System.out.println("Success!");
        } else {
            System.out.println("You fail");
        }
    }

    static boolean findUpperCase(String password) {

        char passArray[] = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(passArray[i])) {
                return true;
            }

        }
        return false;
    }

    static boolean findLowerCase(String tosearch) {

        char passArray[] = tosearch.toCharArray();
        for (int i = 0; i < tosearch.length(); i++) {
            if (Character.isLowerCase(passArray[i])) {
                return true;
            }

        }
        return false;
    }

    static boolean goodLength(String password) {
        return password.length() >= 8;
    }

    static boolean findDigits(String tosearch) {

        char passArray[] = tosearch.toCharArray();
        for (int i = 0; i < tosearch.length(); i++) {
            if (Character.isDigit(passArray[i])) {
                return true;
            }

        }
        return false;
    }

    static boolean findSpecialCharacter(String tosearch) {

        char passArray[] = tosearch.toCharArray();
        for (int i = 0; i < tosearch.length(); i++) {
            if (passArray[i] == '/' || passArray[i] == '>' || passArray[i] == '<' || passArray[i] == '=' || passArray[i] == '+' || passArray[i] == '-' || passArray[i] == '_'
                    || passArray[i] == ')' || passArray[i] == '(' || passArray[i] == '*' || passArray[i] == '&' || passArray[i] == '^' || passArray[i] == '%' || passArray[i] == '$'
                    || passArray[i] == '$' || passArray[i] == '#' || passArray[i] == '@' || passArray[i] == '!' || passArray[i] == ':' || passArray[i] == ';' || passArray[i] == '['
                    || passArray[i] == ']' || passArray[i] == '}' || passArray[i] == '{' || passArray[i] == '?') {
                return true;
            }

        }
        return false;
    }

    static boolean findSpaces(String password) {
        char passArray[] = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (passArray[i] == ' ') {
                return true;
            }
        }
        return false;
    }
}

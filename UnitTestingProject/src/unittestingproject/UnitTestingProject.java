/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingproject;

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
    }

    boolean findUpperCase(String password) {

        char passArray[] = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(passArray[i])) {
                return true;
            }

        }
        return false;
    }

}

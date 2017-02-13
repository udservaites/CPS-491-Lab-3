/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingproject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rebbecca
 */
public class UnitTestingProjectTest {

    public UnitTestingProjectTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
    UnitTestingProject utp = new UnitTestingProject();

    @Test
    public void testUpperCase1() {

        boolean hasIt = utp.findUpperCase("aaaaaaaaaaa");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Upper Case 1: Fail");
        } else {
            System.out.println("Test Upper Case 1: Pass");
        }

    }

    @Test
    public void testUpperCase2() {

        boolean hasIt = utp.findUpperCase("aaaaaaaaaaA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Upper Case 2: Fail");
        } else {
            System.out.println("Test Upper Case 2: Pass");
        }

    }

    @Test
    public void testUpperCase3() {

        boolean hasIt = utp.findUpperCase("aaaaaaaaaaAaaaaa");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Upper Case 3: Fail");
        } else {
            System.out.println("Test Upper Case 3: Pass");
        }

    }

    @Test
    public void testUpperCase4() {

        boolean hasIt = utp.findUpperCase("");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Upper Case 4: Fail");
        } else {
            System.out.println("Test Upper Case 4: Pass");
        }

    }

    @Test
    public void testUpperCase5() {

        boolean hasIt = utp.findUpperCase("AAAAAAAAAAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Upper Case 5: Fail");
        } else {
            System.out.println("Test Upper Case 5: Pass");
        }

    }

    /**
     * Test of main method, of class UnitTestingProject.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnitTestingProject.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

}

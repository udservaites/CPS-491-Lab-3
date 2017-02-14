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
    
    @Test
    public void testUpperCase6() {

        boolean hasIt = utp.findLowerCase("");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 1: Fail");
        } else {
            System.out.println("Test Lower Case 1: Pass");
        }

    }

    @Test
    public void testUpperCase7() {

        boolean hasIt = utp.findLowerCase("AAAAAAAAAAAAA");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 2: Fail");
        } else {
            System.out.println("Test Lower Case 2: Pass");
        }

    }
    
    @Test
    public void testUpperCase8() {

        boolean hasIt = utp.findLowerCase("AAAAAAaAAAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }

    
    @Test
    public void testLength() {

        boolean hasIt = utp.goodLength("AAAAAAaAAAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Length: Fail");
        } else {
            System.out.println("Test Length: Pass");
        }

    }
    
    @Test
    public void testLength2() {

        boolean hasIt = utp.goodLength("A");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Length: Fail");
        } else {
            System.out.println("Test Length: Pass");
        }

    }
    @Test
    public void testLength3() {

        boolean hasIt = utp.goodLength("");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Length: Fail");
        } else {
            System.out.println("Test Length: Pass");
        }

    }
    
    @Test
    public void testLowercase() {

        boolean hasIt = utp.findLowerCase("AAAAAAaAAAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testLowercase1() {

        boolean hasIt = utp.findLowerCase("AAAAAA");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testLowercase2() {

        boolean hasIt = utp.findLowerCase(" ");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testLowercase3() {

        boolean hasIt = utp.findLowerCase("aaaaaaaaaaaaaaa");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testSpecialCharacter1() {

        boolean hasIt = utp.findSpecialCharacter("aaaa)AAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testSpecialCharacter2() {

        boolean hasIt = utp.findSpecialCharacter("aaaa)AAAAA");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    
     @Test
    public void testSpecialCharacter3() {

        boolean hasIt = utp.findSpecialCharacter("aaaa aaaaaAAA");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
     @Test
    public void testSpecialCharacter4() {

        boolean hasIt = utp.findSpecialCharacter("");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
     @Test
    public void testSpecialCharacter5() {

        boolean hasIt = utp.findSpecialCharacter("aaa~jjjjjj");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
     @Test
    public void testSpaces1() {

        boolean hasIt = utp.findSpaces("aaaa)AAAAA");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testSpaces2() {

        boolean hasIt = utp.findSpaces("");
        assertEquals(false, hasIt);
        if (hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testSpaces3() {

        boolean hasIt = utp.findSpaces("llll kkkk");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
        }

    }
    
    @Test
    public void testSpaces4() {

        boolean hasIt = utp.findSpaces(" kkkk kkkk kkk");
        assertEquals(true, hasIt);
        if (!hasIt) {
            System.out.println("Test Lower Case 3: Fail");
        } else {
            System.out.println("Test Lower Case 3: Pass");
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

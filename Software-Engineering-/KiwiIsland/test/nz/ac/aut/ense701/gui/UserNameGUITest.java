/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author he_zh
 */
public class UserNameGUITest {
    
    public UserNameGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformed method, of class UserNameGUI.
     */
    

    /**
     * Test of isempty method, of class UserNameGUI.
     */
    @Test
    public void testIsempty() {
        System.out.println("isempty");
        UserNameGUI instance = new UserNameGUI();
        boolean expResult = false;
        boolean result = instance.isempty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerName method, of class UserNameGUI.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        UserNameGUI instance = new UserNameGUI();
        String expResult = "getPlayerName";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

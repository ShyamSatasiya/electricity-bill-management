/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.awt.event.ActionEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class loginpageTest {
    
    public loginpageTest() {
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
     * Test of ActionPerformed method, of class loginpage.
     */
    @Test
    public void testActionPerformed_1args_1() {
        System.out.println("ActionPerformed");
        ActionEvent ev = null;
        loginpage instance = new loginpage();
        instance.ActionPerformed(ev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class loginpage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] s = null;
        loginpage.main(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class loginpage.
     */
    @Test
    public void testActionPerformed_1args_2() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        loginpage instance = new loginpage();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

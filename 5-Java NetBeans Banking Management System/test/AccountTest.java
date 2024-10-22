/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static java.lang.Thread.sleep;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aqua_
 */
public class AccountTest {

    private JTextField inputTest;
    
    public AccountTest() {
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
     * Test of randomAcc method, of class Account.
     
    @Test
    public void testRandomAcc() {
        System.out.println("randomAcc");
        Account instance = new Account();
        instance.randomAcc();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of randomMICR method, of class Account.
     */
    @Test
    public void testRandomMICR() {
        System.out.println("randomMICR");
        Account instance = new Account();
        instance.randomMICR();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of randomPin method, of class Account.
     */
    @Test
    public void testRandomPin() {
        System.out.println("randomPin");
        Account instance = new Account();
        instance.randomPin();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Bal method, of class Account.
     */
    @Test
    public void testBal() {
        System.out.println("Bal");
        Account instance = new Account();
        instance.Bal();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Account.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Account.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}

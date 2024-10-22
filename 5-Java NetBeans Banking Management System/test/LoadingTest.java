/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class LoadingTest {
    
    public LoadingTest() {
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
     * Test of setUpLoading method, of class Loading.
     */
    @Test
    public void testSetUpLoading() {
        System.out.println("setUpLoading");
        Loading instance = new Loading();
        instance.setUpLoading();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of run method, of class Loading.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Loading instance = new Loading();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Loading.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loading.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

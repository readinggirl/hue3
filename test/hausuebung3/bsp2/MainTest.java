/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung3.bsp2;

import hausuebung3.bsp1.Main;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Teresa
 */
public class MainTest {

    public MainTest() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class Main.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Main instance = new Main();
        instance.sort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Main.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Main instance = new Main();
        instance.get();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

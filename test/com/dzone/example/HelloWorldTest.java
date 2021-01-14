/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dzone.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author ACER
 */
public class HelloWorldTest {

    public HelloWorldTest() {
    }

    HelloWorld helloWorldInstance;

    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUp()");
        helloWorldInstance = new HelloWorld();
    }

    @After
    public void tearDown() {
        System.out.println("* HelloWorldTest: Before method tearDown()");
        helloWorldInstance = null;
    }

    /**
     * Test of formMessge method, of class HelloWorld.
     */
    @Test
    public void testFormMessge() {
//        System.out.println("formMessge");
//        HelloWorld instance = new HelloWorld();
//        String expResult = "";
//        String result = instance.formMessge();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        String expResult = "Hello World";
        String result = helloWorldInstance.formMessge();
        System.out.println("* HelloWorldTest: test method 1 testFormMessge()");
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class HelloWorld.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        HelloWorld.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}

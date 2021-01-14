/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dzone.example;

/**
 *
 * @author ACER
 */
public class HelloWorld {

    private String hello;
    private String world;

    public HelloWorld() {
        hello = "Hello";
        world = "World";
    }

    public String formMessge() {
        String message;
        message = hello + " " + world;
        return message;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.formMessge());
    }

}

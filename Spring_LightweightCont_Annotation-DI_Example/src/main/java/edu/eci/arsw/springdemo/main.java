/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arsw.springdemo;

import edu.eci.arsw.springdemo.GrammarChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author josea
 */
public class main {
    public static void main(String[] args) {
	 ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        GrammarChecker gc = ac.getBean(GrammarChecker.class);
        String textToCheck = "This is an example ";
        String result = gc.check(textToCheck);
        System.out.println("Result: " + result);
    }
    
}

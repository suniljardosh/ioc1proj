package com.springcodeioc.ioc1proj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    public static void main(String[] args)
    {
    	System.out.println("Hello IoC Project");
    	
    	ApplicationContext myAppContext = new ClassPathXmlApplicationContext("config.xml");
    	
    	student s1 = (student) myAppContext.getBean("student1");
    	student s2 = (student) myAppContext.getBean("student2");
    	
    	System.out.println(s1.toString());
    	System.out.println(s2.toString());
    	
    }
}

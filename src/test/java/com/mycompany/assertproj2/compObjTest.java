/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assertproj2;

import com.mycompany.assertproj2.service.compObjservice;
import com.mycompany.assertproj2.service.Impl.compObjImpl;
import static org.testng.Assert.*;
import com.mycompany.assertproj2.config.AppConfig;
import com.mycompany.assertproj2.service.compObjservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Sibakhulu
 */
public class compObjTest {
     private static compObjservice compobjser;
    public compObjTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test 
    public void testconcatenate(){
        compObjImpl unit= new compObjImpl ();
          String result= "one"+ "two";
       junit.framework.Assert.assertEquals("onetwo", result);
        
    }
     @Test
     public boolean Testtrue(){
     return true;
     }
     @Test
      public boolean Testfalse(){
     return false;
     }
   
    @BeforeClass
    public static void setUpClass() throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    compobjser = (compObjservice)ctx.getBean("comparing obj");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
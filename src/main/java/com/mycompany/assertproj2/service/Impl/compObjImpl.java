/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assertproj2.service.Impl;

import com.mycompany.assertproj2.service.compObjservice;
/**
 *
 * @author Sibakhulu
 */
public class compObjImpl  implements compObjservice{
 
 @Override
 public void concatenate(String one, String two) {
     System.out.println("Concatenating two words:");
   
}
 @Override
    public boolean Testtrue() {
     return true;
    }
 @Override
 public boolean Testfalse(){
 return false;
 }


}
    


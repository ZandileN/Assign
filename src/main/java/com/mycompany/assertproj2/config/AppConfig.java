/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assertproj2.config;

import com.mycompany.assertproj2.service.compObjservice;
import com.mycompany.assertproj2.service.Impl.compObjImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Sibakhulu
 */
@Configuration
public class AppConfig {
@Bean(name="comparing obj")
public compObjservice getService(){
return new compObjImpl();
}

}

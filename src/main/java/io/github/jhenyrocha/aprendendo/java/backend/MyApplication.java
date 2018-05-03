/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jhenyrocha.aprendendo.java.backend;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author erocjhe
 */
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
    
    public MyApplication(){
        
        packages("io.github.jhenyrocha.aprendendo.java.backend.controllers");
        
    }
    
}

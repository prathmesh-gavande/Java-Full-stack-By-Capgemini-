package com.autoWiringWithAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.autoWiringWithAnnotation.entity"})
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}

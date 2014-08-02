package com.ecaycho.spring01;

import com.ecaycho.spring01.model.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args) {
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        Persona p = (Persona) ctx.getBean("persona");
        
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
 
        
    }
}

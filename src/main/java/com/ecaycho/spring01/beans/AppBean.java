package com.ecaycho.spring01.beans;

import com.ecaycho.spring01.model.Musico;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBean {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        //AppBean.valoresConstructor(ctx);
        AppBean.referenciaConstructor(ctx);
    }
    
    public static void referenciaConstructor(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("slash");
        
        System.out.println("Marca del Instrumento: " + m.getInstrumento().getMarca());
        System.out.println("Numero de canciones: " + m.getCancionesConocidas());
    }
    
    public static void valoresConstructor(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico");
        System.out.println("Nombres completos del musico: " + m.getNombre() + " " + m.getApellido());
        System.out.println("Numero de canciones: " + m.getCancionesConocidas());
        
    }
    
     
}


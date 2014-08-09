package com.ecaycho.spring01.beans;

import com.ecaycho.spring01.model.Instrumento;
import com.ecaycho.spring01.model.Musico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBean {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
        //AppBean.valoresConstructor(ctx);
        //AppBean.referenciaConstructor(ctx);
        //AppBean.valoresMetodos(ctx);
        //AppBean.referenciaMetodos(ctx);
        //AppBean.beanInternaMetodos(ctx);
        //AppBean.coleccionMetodos(ctx);
        //AppBean.beanInyeccionByName(ctx);
        //AppBean.beanInyeccionByTipo(ctx);
        //AppBean.beanInyeccionByConstructor(ctx);
        AppBean.beanInyeccionByDefault(ctx);
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

    public static void valoresMetodos(ApplicationContext ctx) {

        Musico m = (Musico) ctx.getBean("paul");
        System.out.println("Nombres completos del musico: " + m.getNombre() + " " + m.getApellido());

    }

    public static void referenciaMetodos(ApplicationContext ctx) {

        Musico m = (Musico) ctx.getBean("paul");
        System.out.println("Nombres completos del musico: " + m.getNombre() + " " + m.getApellido());
        System.out.println("Numero de canciones: " + m.getCancionesConocidas());
        System.out.println("Numero de canciones: " + m.getInstrumento().getMarca());
    }

    public static void beanInternaMetodos(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_07");
        System.out.println("Nombres completos del musico: " + m.getNombre() + " " + m.getApellido());
        System.out.println("Numero de canciones: " + m.getInstrumento().getMarca());
    }

    public static void coleccionMetodos(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_08");
        List<Instrumento> instrumentos = m.getInstrumentos();
        
        for(Instrumento instrumento : instrumentos){
            System.out.println(instrumento.getNombre());
            System.out.println(instrumento.getMarca());
        }
    }
    
    //Autowire by Name
    public static void beanInyeccionByName(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_10");
        System.out.println("Nombre de Instrumento autowire byName " + m.getInstrumento().getNombre());
        System.out.println("Marca de Instrumento autowire byName " +m.getInstrumento().getMarca());
    }
    
    //Autowire by Tipo
    public static void beanInyeccionByTipo(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_11");
        System.out.println("Marca de Instrumento autowire byTipo (Primary TRUE)" +m.getInstrumento().getMarca());
    }
    
    //Autowire by Constructor
    public static void beanInyeccionByConstructor(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_12");
        System.out.println("Marca de Instrumento autowire byConstructor: " +m.getInstrumento().getMarca());
    }
    
    //Autowire by Default (autodetected)
    public static void beanInyeccionByDefault(ApplicationContext ctx) {
        Musico m = (Musico) ctx.getBean("musico_13");
        System.out.println("Marca de Instrumento autowire byDefault: " +m.getInstrumento().getMarca());
    }
}

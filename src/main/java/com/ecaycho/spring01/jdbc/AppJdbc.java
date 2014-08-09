/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecaycho.spring01.jdbc;

import com.ecaycho.spring01.jdbc.dao.ProgramaDAO;
import com.ecaycho.spring01.jdbc.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppJdbc {
    public static void main(String[] args) {
                ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_db.xml");
                
                AppJdbc.listarPrograma(ctx);

    }
    
     public static void listarPrograma(ApplicationContext ctx) {
     ProgramaDAO  pdao = (ProgramaDAO) ctx.getBean("programaDAO");
     
     List<Programa> programas = pdao.todo();
     
     System.out.println("Lista de cursos de la BD: **********");
     
     for(Programa programa:programas ){
         System.out.println(programa.getId()+" - "+programa.getNombre());
     }
     
    }
}

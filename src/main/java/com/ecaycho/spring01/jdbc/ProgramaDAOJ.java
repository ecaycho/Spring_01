/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecaycho.spring01.jdbc;


import com.ecaycho.spring01.jdbc.dao.ProgramaDAO;
import com.ecaycho.spring01.jdbc.dao.ProgramaRM;
import com.ecaycho.spring01.jdbc.model.Programa;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author ecaycho
 */
public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

    public List<Programa> todo() {
        String sql = "select * from programa";
        return this.getJdbcTemplate().query(sql,new ProgramaRM());
        
    }

    public Programa encontrar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void guardar(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizar(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

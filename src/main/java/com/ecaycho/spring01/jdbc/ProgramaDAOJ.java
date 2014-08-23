/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecaycho.spring01.jdbc;


import com.ecaycho.spring01.jdbc.dao.ProgramaDAO;
import com.ecaycho.spring01.jdbc.dao.ProgramaRM;
import com.ecaycho.spring01.jdbc.model.Programa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
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
        
        String sql="select * from programa where id = ?";
        
        Programa programa = this.getJdbcTemplate().queryForObject(sql,
        new Object[]{id}, new RowMapper<Programa>() {
            public Programa mapRow(ResultSet rs, int i) throws SQLException {
                
                Programa programa = new Programa();
                programa.setId(Long.parseLong(rs.getString("id")));
                programa.setNombre(rs.getString("nombre"));
                programa.setDescripcion(rs.getString("descripcion"));
                
                return programa;
            }
        });
        System.out.println("selectById("+id+") --> "+programa);
        return programa;
    }

    public void guardar(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizar(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Programa programa) {
        String sql="delete from programa where id=?";
        this.getJdbcTemplate().update(sql, new Object[]{programa.getId()});
    }
    
}

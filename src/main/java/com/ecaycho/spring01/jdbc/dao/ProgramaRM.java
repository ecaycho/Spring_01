package com.ecaycho.spring01.jdbc.dao;

import com.ecaycho.spring01.jdbc.model.Programa;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author ecaycho
 */
public class ProgramaRM implements RowMapper<Programa>{

    public Programa mapRow(ResultSet rs, int i) throws SQLException {
        
        Programa p = new Programa();
        p.setId(rs.getLong(1));
        p.setNombre(rs.getString(2));
        p.setDescripcion(rs.getString(3));
        
        return p;
        
    }
    
}

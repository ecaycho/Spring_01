/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecaycho.spring01.jdbc.dao;

import com.ecaycho.spring01.jdbc.model.Programa;
import java.util.List;

/**
 *
 * @author ecaycho
 */
public interface ProgramaDAO {
    List<Programa> todo();
    Programa encontrar(Long id);
    void guardar(Programa programa);
    void actualizar(Programa programa);
    void eliminar(Programa programa);
}

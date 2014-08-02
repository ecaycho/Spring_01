package com.ecaycho.spring01.model;

import java.util.List;

public class Musico extends Persona{
    
    private int cancionesConocidas;
    private Instrumento instrumento;
    private List<Instrumento> instrumentos;

    public int getCancionesConocidas() {
        return cancionesConocidas;
    }

    public void setCancionesConocidas(int cancionesConocidas) {
        this.cancionesConocidas = cancionesConocidas;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public Musico(int cancionesConocidas) {
        this.cancionesConocidas = cancionesConocidas;
    }
    
    
}

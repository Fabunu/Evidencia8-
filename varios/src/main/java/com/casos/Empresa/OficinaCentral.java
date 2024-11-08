package com.casos.Empresa;

public class OficinaCentral extends Oficina {
    private String nombreDirector;

    public OficinaCentral(String ubicacion, String tipo, Empresa empresa, String nombreDirector) {
        super(ubicacion, tipo, empresa);
        this.nombreDirector = nombreDirector;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
}
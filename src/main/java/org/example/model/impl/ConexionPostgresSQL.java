package org.example.model.impl;

import org.example.model.Iconexion;

public class ConexionPostgresSQL implements Iconexion {

    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionPostgresSQL(){
        this.host = "localhost";
        this.puerto = "1433";
        this.usuario = "postgres";
        this.password = "123456";
    }
    @Override
    public void conectar() {
        System.out.println("Se conecto a la DB PostgresSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de la DB PostgresSQL");
    }
}

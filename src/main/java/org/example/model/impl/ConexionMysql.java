package org.example.model.impl;

import org.example.model.Iconexion;

public class ConexionMysql implements Iconexion {

    private String host;
    private String puerto;
    private String usuario;
    private String password;

    public ConexionMysql(){
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.password = "123456";
    }
    @Override
    public void conectar() {
        System.out.println("Se conecto a la DB Mysql");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de la DB Mysql");
    }
}

package org.example;

import org.example.model.Iconexion;

public class Main {
    public static void main(String[] args) {
        ConexionFabrica fabrica = new ConexionFabrica();

        Iconexion con = fabrica.getConexion("MYSQL");
        con.conectar();
        con.desconectar();


        Iconexion con2 = fabrica.getConexion("POSTGRES");
        con2.conectar();
        con2.desconectar();
        System.out.println("Hello world!");
    }
}
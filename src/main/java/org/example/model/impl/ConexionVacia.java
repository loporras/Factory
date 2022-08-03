package org.example.model.impl;

import org.example.model.Iconexion;

public class ConexionVacia implements Iconexion {


    public ConexionVacia(){

    }
    @Override
    public void conectar() {
        System.out.println("No se especifico Proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especifico Proveedor");
    }
}

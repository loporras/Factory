package org.example;

import org.example.model.Iconexion;
import org.example.model.impl.ConexionMysql;
import org.example.model.impl.ConexionPostgresSQL;
import org.example.model.impl.ConexionVacia;

public class ConexionFabrica {

    public Iconexion getConexion(String motor){

        if (motor==null){
            return new ConexionVacia();
        }
        else if (motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMysql();
        }
        else if (motor.equalsIgnoreCase("POSTGRES")){
            return new ConexionPostgresSQL();
        }
        return new ConexionVacia();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.*;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    private double promedioTarifas;
    private ArrayList<Matricula> matriculas;
    
    public void establecerMatriculas(ArrayList<Matricula> n){
        matriculas = n;
    }
    
    public ArrayList<Matricula> obtenerTransportes(){
        return matriculas;
    }
    
    public void establecerPromedioTarifas(){
        double suma = 0;
        for (int i = 0; i < obtenerTransportes().size(); i++) {
            suma = suma + obtenerTransportes().get(i).obtenerTarifa();
        }
        promedioTarifas = suma / obtenerTransportes().size();
        
    }
    
    public double obtenerPromedioTarifas(){
        return promedioTarifas;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("LISTADO MATRICULAS\n"
                + "--------------------------\n");
        
        for (int i = 0; i < matriculas.size(); i++) {
            cadena = String.format("%s%s\n", cadena, matriculas.get(i));
        }
        
        cadena = String.format("%s"
                + "--------------------------\n"
                + "Promedio Matriculas: %.2f\n",
                cadena,
                promedioTarifas);
        return cadena;
    }
}

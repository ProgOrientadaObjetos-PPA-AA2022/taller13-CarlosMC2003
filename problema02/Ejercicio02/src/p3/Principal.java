/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.*;
import p2.*;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> lista = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        
        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mescuela);
        lista.add(mjardin);
        lista.add(mmaternal);
        lista.add(mmaternal2);
        
        TipoMatricula tiposMa = new TipoMatricula();
        tiposMa.establecerMatriculas(lista);
        tiposMa.establecerPromedioTarifas();
        
        System.out.printf("%s\n", tiposMa);
    }
}

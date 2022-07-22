/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionesTelevisor {
    private ArrayList<Televisor> televisores;
    private double precioTotal;
    private double televisorMasCaro;
    private String listaMarcas;
    
    public void establecerTelevisor(ArrayList<Televisor> lista) {
        televisores = lista;
    }
    
    public ArrayList<Televisor> obtenerTelevisor() {
        return televisores;
    }
    
    public void establecertotalPrecioTvs() {
        double suma = 0;
        
        for (Televisor e : obtenerTelevisor()) {
            suma = suma + e.obtenerPrecio();
        }
        
        precioTotal = suma;
    }
     
    public double obtenertotalPrecioTvs() {
        return precioTotal;
    }
     
    public void establecerTelevisorMasCaro(){
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > 0) {
                s = televisores.get(i).obtenerPrecio();
            }
        }
        
        televisorMasCaro = s;
    }
    
    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }
    
    public void establecerListaMarcasVendidas(){
        listaMarcas = "";
        for (int i = 0; i < televisores.size(); i++) {
            listaMarcas = String.format("%s%s\n", 
                    listaMarcas, televisores.get(i).obtenerMarca());
        }
    }
    
    public String obtenerListaMarcasVendidas() {
        return listaMarcas;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        
        cadena = String.format("LISTADO DE MARCAS TVS\n"
                + "%s"
                + "---------------------\n"
                + "TOTAL A PAGAR: %.2f\n}"
                + "TELEVISOR MAS CARO: %.2f\n", listaMarcas,
                precioTotal, televisorMasCaro );
        
        return cadena;
    }
}

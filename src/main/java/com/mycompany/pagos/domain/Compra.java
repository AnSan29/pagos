/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagos.domain;



/**
 *
 * @author Coder
 */
public class Compra extends Transaccion {
    
    
    public Compra(double monto){
        // llama al constructor de la clase padre (Transaccion)
        super(monto);
    }
    
    public void agregarItem(String item, double precio){
        System.out.println("Agregando item " + item + " -$" + precio);
    }

    
    public double obtenerMontoTotal() {
        return super.getMonto(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagos.domain;

/**
 * Encapsulacion
 * @author Coder
 */
public abstract class Transaccion {
    private double monto;
    
    
    // constructor
    public Transaccion(double monto){
        if(monto <= 0){
            throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        }
        this.monto = monto;
    }
    
    // metodo protegido:
    protected double getMonto(){
        return monto;
    }
}

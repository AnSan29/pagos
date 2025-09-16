/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagos.domain;

/**
 * Abstaccion
 * @author Coder
 */
public interface MetodoPago {
    
    void autorizar(double monto);
    
    void capturar(double monto);
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagos.service;

import com.mycompany.pagos.domain.MetodoPago;

/**
 *
 * @author Coder
 */
public class PagoConTarjeta implements MetodoPago {
    
   
    @Override
    public void autorizar(double monto) {
        // logica para la autorizacion
        System.out.println("Autorizando pago con tarjeta por el monto de : $"+monto);
    }
    
    @Override
    public void capturar(double monto){
        // Lógica específica para capturar pago con tarjeta
        System.out.println("Capturando pago con tarjeta.");
    }
    
    
    
}

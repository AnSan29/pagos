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
public class PagoConCrypto implements MetodoPago {
    
    public void autorizar(double monto){
        System.out.println("Autorizando pago con crypto por el monto de: $" + monto);
    }
    
    public void capturar(double monto){
        System.out.println("Capturando pago con crypto.");
    }
    
}

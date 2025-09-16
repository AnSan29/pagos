/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pagos;

import com.mycompany.pagos.domain.Compra;
import com.mycompany.pagos.domain.MetodoPago;
import com.mycompany.pagos.service.PagoConTarjeta;
import com.mycompany.pagos.service.PagoConCrypto;

/**
 *
 * @author Coder
 */
public class Pagos {

    public static void main(String[] args) {
        
        
        // crear transaccion de compra con su monto
        Compra miCompra = new Compra(150.75);
        // obtener el monto de la compra
        double montoCompra = miCompra.obtenerMontoTotal();
        
        // instancia para pago con tarjeta
        MetodoPago pagoTarjeta = new PagoConTarjeta();
        
        System.out.println("Procesando pago con tarjeta...");
        // Llamar a los métodos de la interfaz
        pagoTarjeta.autorizar(montoCompra);
        pagoTarjeta.capturar(montoCompra);
        
        // instancia para pago con crypto
        MetodoPago pagoCrypto = new PagoConCrypto();
        System.out.println("Procesando pago con Cryptomoneda...");
        // Llamar a los métodos de la interfaz
        pagoCrypto.autorizar(montoCompra);
        pagoCrypto.capturar(montoCompra);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard;

import java.util.Date;

/**
 *
 * @author Ivnn
 */
public class tarjeta {
    
    private int codigo, clave, monto;
    private Date vigencia;
    private String trabajador;

    public tarjeta() {
    }

    public tarjeta(int codigo, int clave, int monto, Date vigencia, String trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    void setTrabajador(trabajador trabajador1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

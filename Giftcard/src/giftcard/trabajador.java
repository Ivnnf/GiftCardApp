/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard;

/**
 *
 * @author Ivnn
 */
public class trabajador {
    
    private int run;
    private char dv;
    private String nombre,apellido;

    public trabajador() {
    }

    public trabajador(int run, char dv, String nombre, String apellido) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
}

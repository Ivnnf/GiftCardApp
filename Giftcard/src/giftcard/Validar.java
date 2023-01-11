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
public class Validar {

    public boolean validarClave(int run, int clave) {
        
        String rut1 = String.valueOf(run);
        String clave1 = String.valueOf(clave);
        
        if(rut1.substring(0,4).equals(clave1)) 
        {
            return true;
        }
        {
            return false;
        }
        
    }
        public boolean ValidarVigencia (Date vigencia)
           
   {
       Date FechaActual = new Date(); 
       
       if (vigencia.after(FechaActual))
       {
           return true; 
       }
       
       else
       {
            return false; 
       }
       
    }

   
}

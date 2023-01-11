/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giftcard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ivnn
 */
public class Giftcard {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        boolean flagValido;
        Validar val = new Validar();

        trabajador trabajador1 = new trabajador();
        tarjeta tarjeta1 = new tarjeta();

        int opcion;
        Scanner teclado = new Scanner(System.in);
        
        
        
        //MENU

        do {
            System.out.println("---------------MENU---------------------");
            System.out.println("1-. Ingresar Datos Del Trabajador");
            System.out.println("2-. Ingresar datos de la tarjeta ");
            System.out.println("3-. Ingresar datos de la compra");
            System.out.println("Salir");

            opcion = teclado.nextInt();

        //OPCIONES DE MENU    
            
            switch (opcion) {
                
                //OPCION 1
                case 1:
                    //SOLICITUD DEL RUT
                    System.out.println("Ingrese su run solo numeros ej: 17243855");
                    int run = teclado.nextInt();
                    trabajador1.setRun(run);
                    //SOLICITUD DEL DIGITO VERIFICADOR
                    System.out.println("Ingrese su Digito Verificador ");
                    char dv = teclado.next().charAt(0);
                    trabajador1.setDv(dv);
                    //SOLICITUD DEL NOMBRE
                    System.out.println("Ingrese su nombre ");
                    String nombre = teclado.next();
                    trabajador1.setNombre(nombre);
                    //SOLICITUD DEL APELLIDO
                    System.out.println("Ingrese su apellido ");
                    String apellido = teclado.next();
                    trabajador1.setApellido(apellido);

                    System.out.println("Datos guardados exitosamente ");

                    break;
                    
                 //OPCION 2
                case 2:

                    
                    
                    //SOLICITUD DEL CODIGO DE LA GIFTCARD
                    System.out.println("Ingrese código de 6 dígitos de la GiftCard: ");
                    int codigo = teclado.nextInt();
                    tarjeta1.setCodigo(codigo);
                    //SOLICITUD DEL MONTO DE LA GIFTCARD
                    System.out.println("Ingrese monto que tendrá la Giftcard: ");
                    int monto = teclado.nextInt();
                    tarjeta1.setMonto(monto);

                    Date fechaDate = null;
                    //SOLICITUD DEL MONTO DE LA GIFTCARD
                    System.out.println("Ingrese fecha de vigencia de la GiftCard; ");
                    String vigencia = teclado.next();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    fechaDate = formato.parse(vigencia);
                    tarjeta1.setVigencia(fechaDate);

                    System.out.println("Datos guardados con éxito");

                    break;
                    
                case 3:
                    
                    //OPCION 3
                    
                     do
                        //SOLICITUD DE LA CLAVE DE LA GIFTCARD
                    {
                       System.out.println("Ingrese la clave de la Giftcard ");
                       int clave = teclado.nextInt();
                      

                        flagValido = val.validarClave(trabajador1.getRun(), clave);

                        if (flagValido == false) {
                            System.out.println("La clave es inválida ");
                        } else {
                            
                            tarjeta1.setClave(clave);
                        }

                    } while (flagValido == false);
                    
                     
                  do
                      //SOLICITUD DE LA FECHA DE LA GIFTCARD
                  {
                      
                      System.out.println("Ingrese la fecha de la Giftcard");
                      String valvigencia = teclado.next();
                      
                      
                      SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
                      fechaDate = formato2.parse(valvigencia);                        

                            flagValido = val.ValidarVigencia(fechaDate);
                            if (flagValido == false) 
                            {
                                System.out.println("La Giftcard ha caducado");
                            } else {
                                System.out.println("");
                            }

                      
                  }while (flagValido == false);
                

                    //Validación monto compra - giftcard
                    
                    do
                        //SOLICITUD DEL MONTO DE LA COMPRA
                    {
                        System.out.println("Ingrese monto de la compra: ");
                        int montocompra = teclado.nextInt();

                                                                      
                        if (montocompra > tarjeta1.getMonto())
                        {
                            System.out.println("El monto excede el máximo");
                        }
                        
                        else //Saldo
                        {
                            System.out.println("El nuevo saldo de su tarjeta es: $"+ (tarjeta1.getMonto()- montocompra));
                        }  
                    }while (flagValido == false);
                   
                    
                    
                    
                    break;
                case 4:
                    
                    //OPCION 4
                    //SALIR DEL PROGRAMA
                    System.out.println("Saliendo.............");
                default:
                    System.out.println("Opción inválida.");

                    break;

            }

        } while (opcion != 4);

    }

}

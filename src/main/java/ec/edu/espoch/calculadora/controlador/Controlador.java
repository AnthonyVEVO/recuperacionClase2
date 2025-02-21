/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.calculadora.controlador;

import ec.edu.espoch.calculadora.modelo.Operaciones;
import ec.edu.espoch.calculadora.modelo.Suma;
import ec.edu.espoch.calculadora.vista.Principal;

/**
 *
 * @author SO-LAB1-PC7
 */
public class Controlador {
   private Principal objPrincipal; 
   private Suma objSumar;
    private Operaciones objOperaciones;

     public Controlador(Principal objPrincipal) {
     this.objPrincipal= objPrincipal;
     this.objSumar= new Suma();
      
      
    }
    
    
    
    public void prosesoSumar(){
        
        try {
            int num1;
            int num2;
  
            String result;
            
            //para convertir un entero a String utlizar el interger.parseint
            
            num1=Integer.parseInt(objPrincipal.getNumeroUno());
            num2=Integer.parseInt(objPrincipal.getNumeroDos());
            
            objSumar.setNum1(num1);
            objSumar.setNum2(num2);
            objOperaciones.agregarVector(objSumar);
            
           /* result=String.valueOf(objSumar.sumar(num1, num2));
            objPrincipal.respuesta(result);*/
            
        } catch (Exception e) {
            objPrincipal.respuesta("Error dato incorrecto");
        }
    
    }

 
}

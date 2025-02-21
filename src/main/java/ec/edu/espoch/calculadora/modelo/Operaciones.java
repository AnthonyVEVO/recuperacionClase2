/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.calculadora.modelo;

/**
 *
 * @author SO-LAB1-PC7
 */
public class Operaciones {
     Suma[] vSumar= new Suma[5];
     
      private int sumar(int a , int b){
        return a + b;
    }
    
    public int agregarVector(Suma objSumar){
       
        for (int i = 0; i < 5; i++) {
            int result =0;
            
            if (vSumar[i]!= null) {
                vSumar[i] = new Suma();
                
                result =sumar(objSumar.getNum1(),objSumar.getNum2());
                vSumar[i].setNum1(objSumar.getNum1());
                vSumar[i].setNum2(objSumar.getNum2());
                vSumar[i].setResult(result);
            }
            return result;
        }
         return 0;
        
         
    }
}

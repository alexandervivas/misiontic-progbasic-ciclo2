/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.mintic.progbasic;

/**
 *
 * @author alexandervivas
 */
public class Sesion4 {
    
    public static void main(String[] args) {
        
        String alumno = "alumno";
        String profe = "profe";
        String secretario = "secretario";
        String otraCosa = "esta otra";
        
        if(alumno.equals("alumno")) {
            System.out.println("Bien!");
        } else {
            System.out.println("Mal...");
        }
        
        if(profe.equals("profe")) {
            System.out.println("Bien otra vez");
        } else if(secretario.equals("profe")) {
            System.out.println("Ahora sí");
        }
        
        // ya se puede poner engorroso tener tantos if en ciertos casos
        if(otraCosa.equals("otra cosa")) {
            System.out.println("sí es otra cosa");
        } else if(otraCosa.equals("esta otra")) {
            System.out.println("no, es esta otra");
        } else {
            System.out.println("Nada, no sé");
        }
        
        switch(otraCosa) {
            case "otra cosa": {
                System.out.println("sí es otra cosa switch");
            }
            break;
            case "esta otra": {
                System.out.println("no, es esta otra switch");
            }
            break;
            default: {
                System.out.println("Nada, no sé");
            }
        }
        
        // serie fibonacci
        /*
        int a = 0;
        int b = 1;
        int c = a + b;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);*/
        
        // for, while
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = a + b;
        // for(inicializacion de variable de control ; condicion de parada ; incremento)
        /*for(int i = 0; i < 10; i++) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }*/
        
        // serie de fibonacci de todos los numeros menores a 100
        /*while(c < 100) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }*/
        
        // primeros 12 numeros de la serie de fibonacci
        int i = 0;
        while(i < 10) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
            i++;// si no se hace esto, se cae en un loop infinito
        }
        
    }
    
}

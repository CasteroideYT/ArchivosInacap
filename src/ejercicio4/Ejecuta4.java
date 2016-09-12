package ejercicio4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejecuta4 {
     public static void main(String[] args) throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int errores = 0;
        
        do{
            if (errores >0){
                System.out.print("Tienes que ingresar un numero de tres digitos ");
        }
            System.out.print("Ingresa valor: --> ");
            numero = Integer.parseInt(bf.readLine());
            errores++;
        }while(numero < 100 || numero > 999);
        
        // Pasamos el int a String\\
        String numeroReves = Integer.toString(numero);
        //Convertimos el String en StringBuffer para utilizar el metodo reverse()\\
        StringBuilder builder=new StringBuilder(numeroReves);
        //Invierte el StringBuffer\\
        builder = builder.reverse(); 
        //Convertimos el StringBuffer en String\\
        String nuevaCadena = builder.toString(); 
        //Mostramos la nueva cadena\\
        System.out.println(nuevaCadena);
    
    
   
    }
}

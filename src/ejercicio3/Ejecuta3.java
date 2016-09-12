package ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejecuta3 {
    public static void main(String[] args) throws Exception {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa valor: --> ");
        int numero = Integer.parseInt(bf.readLine());
        int contador = 0;
        for (int i=1; i<(numero+1); i++){  
            if (numero%i==0){
                contador++;
            }
        }
        System.out.print(numero);
        if (contador!=2){
            System.out.print( " No es primo" );
        }
        else{
            System.out.print( " Es primo" );
        }
    }
}
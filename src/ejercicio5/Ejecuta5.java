
package ejercicio5;

public class Ejecuta5 {
    public static void main(String[]args){
        Arreglos arr=new Arreglos();
        int numeros[]=new int[100];
        int pares[]=new int[100];
        int impares[]=new int[100];
        //Ingreso de datos a arreglo\\
        arr.ingresarDatos(numeros);
        arr.ordenaDatos(numeros,pares,impares);
        //Mostramos los datos \\
        System.out.println("Los pares fueron:");
        arr.muestraDatos(pares);
        System.out.println("\n Los impares fueron:");
        arr.muestraDatos(impares);    
    }
}

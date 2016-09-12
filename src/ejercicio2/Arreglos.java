package ejercicio2;

public class Arreglos {
    public void ingresarDatos(int a[]) throws Exception{
        for(int i=0;i<a.length;i++){
            a[i] = (int) (Math.random()*99)+1;
            System.out.println("El numero "+ i +" es: "+a[i]);
        }
   }
    public void ordenaDatos(int a[]){
        for(int i=0;i<a.length-1;i++){
                int min=i;
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[min])      {
                    min=j;}
                }
                    if(i!=min){
                        int aux =a[i];
                        a[i]=a[min];
                        a[min] = aux;
                    }
        }
    }
    public void muestraDatos(int a[]){
        System.out.println("Los datos son:");
        for(int i=0;i<a.length;i++){
            System.out.print("["+ a[i]+"]");   
        }
    }
    public void bienvenida(){
        System.out.println("Este programa lanzara numero aleatorios entre el 1 y el 99");
    }
}


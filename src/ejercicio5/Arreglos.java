package ejercicio5;

public class Arreglos {
        public void ingresarDatos(int a[]){
        for(int i=0;i<a.length;i++){
            a[i] = (int) (Math.random()*999)+1;
        }
        
   }
    public void ordenaDatos(int num[],int par[],int impar[]){
        int i= 0; int p= 0;
        for(int c=0; c<num.length;c++){
            if(num[c]%2==0){
                par[p]=num[c];
                p++;
            }else{
                impar[i]=num[c];
                i++;
            }
        }
    }
    public void muestraDatos(int a[]){
        int c=0;
        while(a[c]!=0){
            System.out.print("["+ a[c]+"]");
            c++;
        }
        if (c!=0){
            System.out.println("Totales: "+c);
        }else{
            System.out.println("No hay datos");
        }
    }
}

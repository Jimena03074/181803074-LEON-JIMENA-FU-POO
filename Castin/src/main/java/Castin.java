
import java.util.Scanner;

public class Castin {
     public static void main (String args[]){
        
        Scanner leer =  new Scanner(System.in);
        
        //Castin Explisito
        short a=1;
        int b=15;
        
        a=(short)b;
        System.out.println(a);
        
        //castin Implicito
        float c=4.5f;
        double d=5.6;
        
        d=c;
        System.out.println(d);
        
        //¿Que pasa con los decimales cuando casteo de flotante a double a entero?
        double pi= 3.1416;
        int duda=(int)pi;
        System.out.println("imprime el valor de duda   "+duda);
        
        //castin string 
        
        String valor ="15";
        int n=Integer.parseInt(valor);
        n=n+duda;
        System.out.println(n); 
     }
}

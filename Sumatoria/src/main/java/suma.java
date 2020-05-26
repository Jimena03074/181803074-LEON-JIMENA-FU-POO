
import java.util.Scanner;


public class suma {

    public static void main(String[] args) {
        int numero,i ,suma=0, numero2;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos: ");
        numero=teclado.nextInt();
   
        for(i=1;i<=numero;i++)
        {
            System.out.print("Ingrese el numero (" + i + ") : ");
            numero2 = teclado.nextInt();
            suma = suma + numero2;
        }
        System.out.print("La suma total de los numeros es : " + suma);
    }   
}


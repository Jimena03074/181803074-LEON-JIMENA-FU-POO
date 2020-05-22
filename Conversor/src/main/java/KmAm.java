
import java.util.Scanner;

public class KmAm {
   
    public static void main (String args[]){
        
        Scanner leer =  new Scanner(System.in);
        double km=0;
        double met=0;         

        System.out.print("ingrese los kilometros que desea convertir a metros: ");
        km = leer.nextDouble();
        
            met = km*1000;
            System.out.println("tus metros son: " + met + " m" );
    }   
}

    


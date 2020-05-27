import java.util.Scanner;

public class MenoQue {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        int numero5=0;
        
        System.out.print("Ingrese valores que sean menor al anterior ");
        System.out.print("Ingrese tu primer numero de cinco: ");
        numero1 = leer.nextInt();
        System.out.print("Ingrese tu segundo numero de cinco: ");
        numero2=leer.nextInt();
                
         if( numero2>=numero1){
            }else {
             System.out.print("Ingrese tu tercer numero de cinco: ");
             numero3 = leer.nextInt();
              if( numero3>=numero2){
                } else {
                System.out.print("Ingrese tu cuarto numero de cinco: ");
                numero4 = leer.nextInt();
                 if( numero4>=numero2){
                } else {
                 System.out.print("Ingrese tu quinto numero de cinco: ");
                 numero5 = leer.nextInt();
             
                }
             }
        }
    }
}


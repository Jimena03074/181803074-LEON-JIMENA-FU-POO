
import java.util.Scanner;

public class Horoscopo {
   
    public static void main (String args[]){
        
        Scanner leer = new Scanner(System.in);
        int dia=0;
        int mes=0;
        
        System.out.println("este programa te dice que signo eres ");
        System.out.println("ingresa el numero que corresponda a tu mes de nacimiento: ");
        System.out.println(" 1)  enero ");
        System.out.println(" 2)  febrero");
        System.out.println(" 3)  marzo");
        System.out.println(" 4)  abril");
        System.out.println(" 5)  mayo");
        System.out.println(" 6)  junio");
        System.out.println(" 7)  julio");
        System.out.println(" 8)  agosto");
        System.out.println(" 9)  septiembre");
        System.out.println(" 10) octubre");
        System.out.println(" 11) noviembre");
        System.out.println(" 12) diciembre");
        mes = leer.nextInt();
        
        System.out.println("ingresa tu dia de nacimiento: ");
        dia = leer.nextInt();
        
        //capricornio del 22 de diciembre al 20 de enero
        if(dia>=22 && dia<=31 && mes==12 || dia>=1 && dia<=20 && mes==1){
         System.out.println("Tu signo es Capricornio");
         
        //Acuario del 21 de enero al 19 de febrero
        }else if (dia>=21 && dia<=31 && mes==1 || dia>=1 && dia<=29 && mes==2){
        System.out.println("Tu signo es Acuario");
         
        //Pisis  del 20 de febrero al 20 de marzo
        }else if (dia>=20 && dia<=29 && mes==2 || dia>=1 && dia<=20 && mes==3){
         System.out.println("Tu signo es Pisis");
         
        //Aries del 21 de marzo al 20 de abril
        }else if (dia>=21 && dia<=31 && mes==3 || dia>=1 && dia<=20 && mes==4){
         System.out.println("Tu signo es Aries");
         
        //Tauro  del 21 de abril al 21 de mayo
        }else if (dia>=21 && dia<=30 && mes==4 || dia>=1 && dia<=21 && mes==5){
        System.out.println("Tu signo es Capricornio");
        
        //Geminis del 22 de mayo al 21 de junio
        }else if (dia>=22 && dia<=31 && mes==5 || dia>=1 && dia<=21 && mes==6){
        System.out.println("Tu signo es Geminis");
        
        //Cancer del 22 de junio al 23 de julio 
        }else if (dia>=22 && dia<=30 && mes==6 || dia>=1 && dia<=23 && mes==7){
        System.out.println("Tu signo es Capricornio");
         
        //Leo del 24 de julio al 23 de agosto 
         }else if (dia>=24 && dia<=31 && mes==7 || dia>=1 && dia<=23 && mes==8){
         System.out.println("Tu signo es Capricornio");
         
         //Virgo del 24 de agosto al 23 de septiembre 
         }else if (dia>=24 && dia<=31 && mes==8 || dia>=1 && dia<=23 && mes==9){
         System.out.println("Tu signo es virgo");
         
         //Libra del 24 de septiembre al al 23 de octubre 
         }else if (dia>=24 && dia<=30 && mes==9 || dia>=1 && dia<=23 && mes==10){
         System.out.println("Tu signo es Libra");
         
         //Eescorpion del 24 de octubre al 22 de noviembre
         }else if (dia>=24 && dia<=31 && mes==10 || dia>=1 && dia<=22 && mes==11){
         System.out.println("Tu signo es Escorpion");
         
         //Sagitario del 23 de noviembre al 21 de diciembre 
         }else if (dia>=23 && dia<=30 && mes==11 || dia>=1 && dia<=19 && mes==12){
         System.out.println("Tu signo es Sagitario");
        
        }
        
        
    }
   
}
        
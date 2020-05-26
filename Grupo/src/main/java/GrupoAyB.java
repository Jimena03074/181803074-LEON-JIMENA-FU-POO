
import java.util.Scanner;

public class GrupoAyB {
    public static Scanner entrada=new Scanner(System.in);
    
    public static void main(String[] args) {
        String genero = new String();
        String nombre = new String();
        String grupo = new String();
        String yes = new String();
        //String firstChar = "M";
        System.out.println("¿Cómo te llamas? ");
        nombre = entrada.nextLine();
        System.out.println("¿Cuál es tu Genero M=(hombre) o F=(mujer)?");
        genero = entrada.nextLine();
        System.out.println("¿Tu nombre comienza con la letra de la A a la M?"+" S=si o N=no" );
        yes=entrada.nextLine();
        
        
        if (("S".equals(yes) && "F".equals(genero)) || ("M".equals(genero) && "N".equals(yes))){
            grupo = "A";
        }else{
            grupo = "B";
        }

        System.out.println("Tu Nombre es: " + nombre);
        System.out.println("Tu Genero es: " + genero);
        System.out.println("Te corresponde el Grupo: " + grupo);
    }
    
}
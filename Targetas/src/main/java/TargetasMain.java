
public class TargetasMain {
    public static void main (String args[]){
        Targetas morada=new Targetas();
        morada.tipo="morada";
        morada.puntos1=9;
    
        
        Targetas estudiante=new Targetas();
        estudiante.tipo="estudiante";
        estudiante.puntos2=3;  
        
        Targetas buhoEspecial=new Targetas();
        buhoEspecial.tipo="Buho Especial";
        buhoEspecial.puntos3=12;
        
        Targetas docente=new Targetas();
        docente.tipo="Docente";
        docente.puntos4=2; 
        
        Targetas buhoOro=new Targetas();
        buhoOro.tipo="Buho lanco oro";
        buhoOro.puntos5=15; 
        
        System.out.println(morada.toString());
        System.out.println(estudiante.toString());
        System.out.println(buhoEspecial.toString());
        System.out.println(docente.toString());
        System.out.println(buhoOro.toString());
        
    }
    
}

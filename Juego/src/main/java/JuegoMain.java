public class JuegoMain {
  public static void main (String args[]){
      Ak bronce=new Ak();
      bronce.tipo="bronce";
      bronce.cargador=5;
      bronce.precision=75;
      bronce.velocidadCarga=5;
      bronce.precio=1000;
      bronce.dañio=10;
      
      
      
      Ak plata=new Ak();
      plata.tipo="plata";
      plata.cargador=8;
      plata.precision=70;
      plata.velocidadCarga=70;
      plata.precio=2300;
      plata.dañio=11;
      
      
      
      Ak oro=new Ak();
      oro.tipo="oro";
      oro.cargador=10;
      oro.precision=85;
      oro.velocidadCarga=4.3;
      oro.precio=2500;
      oro.dañio=13;
      
      System.out.println(plata.toString());
      
      Ak diamante=new Ak();
      diamante.tipo="oro";
      diamante.cargador=10;
      diamante.precision=85;
      diamante.velocidadCarga=4.3;
      diamante.precio=2500;
      diamante.dañio=13;
      
      
      System.out.println(bronce.toString());
      System.out.println(plata.toString());
      System.out.println(plata.toString());
      System.out.println(plata.toString());
  }  
}


//CLASEE LA PLANTILLA PARA CREAR OBJETOS
public class Ak {
    //ATRIBUTOS QUE SON LOS DATOS O CARACTERISTICAS DEL OBJETO
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int dañio;
    
    //METODOS SON LAS ACCIONES /INTERACCIONES DEL OBJETO
    public void dispara(){
        System.out.println("Te estoy disparando con un dano de"+dañio);
    }
    public void apuntar(){}
    public void dañio(){}

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precicion=" + precision + ", velocidadCarga=" + velocidadCarga + ", precio=" + precio + ", da\u00f1io=" + dañio + '}';
    }
    
}

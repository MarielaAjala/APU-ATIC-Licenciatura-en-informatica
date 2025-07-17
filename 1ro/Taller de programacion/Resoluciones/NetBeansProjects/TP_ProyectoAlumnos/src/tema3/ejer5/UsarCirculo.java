package tema3.ejer5;
import PaqueteLectura.Lector;
public class UsarCirculo {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese radio del circulo, color de relleno y color de linea: ");
        Circulo c = new Circulo (Lector.leerDouble(),Lector.leerString(),Lector.leerString());
        System.out.println("Perimetro: "+c.calcularPerimetro());
        System.out.println("Area: "+c.calcularArea());
    }
}

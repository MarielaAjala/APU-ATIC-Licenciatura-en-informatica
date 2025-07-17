package tema4.ejer2;

public class UsarEmpleado {

    public static void main(String[] args) {
        Jugador j = new Jugador(10,2,"Jugador Juan Perez",100000,1);
        Entrenador e = new Entrenador(1,"Entrenador Juan Perez",500000,5);
        System.out.println("Jugador = "+j.toString());
        System.out.println("Entrenador = "+e.toString());
        System.out.println("Sueldo a cobrar x jugador = "+j.calcularSueldoACobrar());
        System.out.println("Sueldo a cobrarx entrenador = "+e.calcularSueldoACobrar());
    }
    
}

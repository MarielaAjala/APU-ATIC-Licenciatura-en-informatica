package tema3.ejer4;
import PaqueteLectura.GeneradorAleatorio;
public class UsarHotel {

    public static void main(String[] args) {
        // TODO code application logic here
        GeneradorAleatorio.iniciar();
        int i,cantHabitaciones = GeneradorAleatorio.generarInt(51),cantOcupantes;
        while(cantHabitaciones==0){cantHabitaciones = GeneradorAleatorio.generarInt(51);}
        cantOcupantes = GeneradorAleatorio.generarInt(cantHabitaciones/2);
        while(cantOcupantes==0){cantOcupantes = GeneradorAleatorio.generarInt(cantHabitaciones/2);}
        System.out.println("Cantidad de habitaciones del hotel: "+cantHabitaciones);
        System.out.println("Cantidad de ocupantes en el hotel: "+cantOcupantes);
        Hotel h = new Hotel (cantHabitaciones);
        Habitacion [] habitaciones = h.getHabitaciones();
        for (i =0; i<cantOcupantes; i++){
            habitaciones[i*2].setOcupante(new Cliente(GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarInt(70000000),GeneradorAleatorio.generarInt(90)));
        }
        System.out.println("Hotel con su ocupacion y tarifas iniciales: ");
        System.out.println(h.toString());
        h.aumentarCostoHabitaciones(2000);
        System.out.println("Hotel con sus tarifas aumentadas en $2.000: ");
        System.out.println(h.toString());
    }
}

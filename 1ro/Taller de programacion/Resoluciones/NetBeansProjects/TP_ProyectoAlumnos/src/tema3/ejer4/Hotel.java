
package tema3.ejer4;
import PaqueteLectura.GeneradorAleatorio;
public class Hotel {
    private Habitacion [] habitaciones;
    private int cantHabitaciones;

    public Hotel(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
        GeneradorAleatorio.iniciar();
        int i;
        habitaciones = new Habitacion [cantHabitaciones];
        for (i = 0;i < this.cantHabitaciones; i++){
            double costo = GeneradorAleatorio.generarDouble(8001);
            while(costo<2000.0){costo = GeneradorAleatorio.generarDouble(8001);}
            this.habitaciones[i] = new Habitacion(costo);
            this.habitaciones[i].setOcupante(null);
        }
    }
    
    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    
    public void aumentarCostoHabitaciones(double aumento){
        GeneradorAleatorio.iniciar();
        int i;
        for (i = 0;i < this.cantHabitaciones; i++){
            this.habitaciones[i].setCosto(this.habitaciones[i].getCosto()+aumento);
        }
    }

    @Override
    public String toString() {
        //System.out.println("Entre al toString de Hotel.");
        String aux = "Hotel: \n";
        int i;
        for (i = 0;i < this.cantHabitaciones; i++){
            //System.out.println("Entre al bucle del toString de Hotel, iteracion "+i);
            aux += "( Habitacion "+(i+1)+", "+habitaciones[i].toString()+")\n";
            //System.out.println("Aux = "+aux);
        }
        return aux;
    }
}

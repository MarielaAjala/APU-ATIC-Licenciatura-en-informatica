/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejer2;

/**
 *
 * @author marie
 */
public class Jugador extends Empleado{
    private int cantPartidosJugados, cantGolesAnotados;

    public Jugador(int cantPartidosJugados, int cantGolesAnotados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setCantPartidosJugados (cantPartidosJugados);
        this.setCantGolesAnotados (cantGolesAnotados);
    }

    public int getCantPartidosJugados() {
        return this.cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getCantGolesAnotados() {
        return this.cantGolesAnotados;
    }

    public void setCantGolesAnotados(int cantGolesAnotados) {
        this.cantGolesAnotados = cantGolesAnotados;
    }

    public double calcularEfectividad() {
        return (double) this.getCantGolesAnotados() / this.getCantPartidosJugados();
    }
    
    public double calcularSueldoACobrar(){
        double aux = super.calcularSueldoACobrar();
        if(this.calcularEfectividad()>0.5) return aux + this.getSueldoBasico();
        return aux;
    }
}

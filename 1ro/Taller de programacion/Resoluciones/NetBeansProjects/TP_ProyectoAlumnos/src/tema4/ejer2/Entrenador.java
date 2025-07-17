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
public class Entrenador extends Empleado{
    private int cantCampeonatosGanados;

    public Entrenador(int cantCampeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.setCantCampeonatosGanados (cantCampeonatosGanados);
    }

    public int getCantCampeonatosGanados() {
        return this.cantCampeonatosGanados;
    }

    public void setCantCampeonatosGanados(int cantCampeonatosGanados) {
        this.cantCampeonatosGanados = cantCampeonatosGanados;
    }

    @Override
    public double calcularEfectividad() {
        return (double) this.getCantCampeonatosGanados() / this.getAntiguedad();
    }
    
    public double calcularSueldoACobrar(){
        double aux = super.calcularSueldoACobrar();
        double cant = this.getCantCampeonatosGanados();
        if((cant>=1)&&(cant<=4)) return aux + 5000;
        else if ((cant>=5)&&(cant<=10)) return aux + 30000;
        else if (cant>10) return aux + 50000;
        return aux;
    }
}

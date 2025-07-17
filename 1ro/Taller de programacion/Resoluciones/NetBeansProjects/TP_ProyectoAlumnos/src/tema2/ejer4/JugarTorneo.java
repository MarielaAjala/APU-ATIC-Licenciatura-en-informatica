package tema2.ejer4;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
import tema2.Partido;

public class JugarTorneo {

    public static void main(String[] args) {
        int dimF = 20, cant = 0, i, wonByRiver = 0, scoredByBoca = 0;
        Partido[] partidos = new Partido[dimF];

        Partido p;
        String nombreNulo = "ZZZ", nombre;
        GeneradorAleatorio.iniciar();
        System.out.println("Ingrese nombre de equipo visitante, fin de ingreso visitante ZZZ: ");
        nombre = Lector.leerString().toUpperCase();
        while ((cant < dimF) && (!nombre.equals(nombreNulo))) {
            p = new Partido();
            p.setVisitante(nombre);
            System.out.println("Ingrese nombre de equipo local, goles de local y de visitante: ");
            p.setLocal(Lector.leerString().toUpperCase());
            p.setGolesLocal(Lector.leerInt());
            p.setGolesVisitante(Lector.leerInt());
            partidos[cant] = p;
            cant++;
            System.out.println();
            System.out.println("Ingrese nombre de otro equipo visitante: ");
            nombre = Lector.leerString().toUpperCase();
        }
        for (i = 0; i < cant; i++) {
            if (partidos[i].getGanador().equals("RIVER")) {
                wonByRiver++;
            }
            if (partidos[i].getLocal().equals("BOCA")) {
                scoredByBoca += partidos[i].getGolesLocal();
            }
            System.out.println();
        }
        System.out.println("Cantidad de partidos ganados por River: " + wonByRiver);
        System.out.println("Cantidad de goles marcados por Boca de local: " + scoredByBoca);
    }
}
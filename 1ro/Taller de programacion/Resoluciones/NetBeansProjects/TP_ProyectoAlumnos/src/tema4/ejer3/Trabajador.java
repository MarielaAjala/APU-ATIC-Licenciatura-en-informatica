/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejer3;

/**
 *
 * @author marie
 */
public class Trabajador extends Persona {
    private String tarea;

    public Trabajador(String unaTarea, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.setTarea (unaTarea);
    }

    public Trabajador() {
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String unaTarea) {
        this.tarea = unaTarea;
    }

    @Override
    public String toString() {
        String aux;
        aux = super.toString();
        return aux+" Soy " + tarea + '.';
    }

    
    
    
}

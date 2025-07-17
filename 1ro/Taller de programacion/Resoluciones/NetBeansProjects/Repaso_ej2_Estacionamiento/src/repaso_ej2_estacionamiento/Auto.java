
package repaso_ej2_estacionamiento;

public class Auto {
    private String nombrePropietario, patente;

    public Auto(String nombrePropietario, String patente) {
        this.nombrePropietario = nombrePropietario;
        this.patente = patente;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}

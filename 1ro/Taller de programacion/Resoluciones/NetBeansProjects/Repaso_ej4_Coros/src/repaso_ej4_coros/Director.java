
package repaso_ej4_coros;

public class Director extends Persona{
    private int antiguedad;

    public Director(int antiguedad, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.setAntiguedad (antiguedad) ;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
}

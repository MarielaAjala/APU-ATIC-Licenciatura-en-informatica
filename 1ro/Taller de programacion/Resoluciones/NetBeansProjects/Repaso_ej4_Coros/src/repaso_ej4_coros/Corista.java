package repaso_ej4_coros;

public class Corista extends Persona{
    private int tonoFundamental;

    public Corista(int tonoFundamental, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.setTonoFundamental (tonoFundamental) ;
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }

    public void setTonoFundamental(int tonoFundamental) {
        this.tonoFundamental = tonoFundamental;
    }
}

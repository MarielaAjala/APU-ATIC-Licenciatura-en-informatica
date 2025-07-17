package repaso_ej3_recitales;

public class Fecha {
    private String ciudad, dia;

    public Fecha(String ciudad, String dia) {
        this.setCiudad(ciudad) ;
        this.setDia (dia) ;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
}

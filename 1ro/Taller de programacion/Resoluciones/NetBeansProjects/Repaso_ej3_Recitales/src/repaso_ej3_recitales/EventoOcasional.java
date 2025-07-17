package repaso_ej3_recitales;

public class EventoOcasional extends Recital{
    private String motivo; //"a beneficio", "show de TV", o "show privado"
    private String nombreContratante;
    private String diaDeEvento;

    public EventoOcasional(String motivo, String nombreContratante, String diaDeEvento, String nombreDeBanda, int cantTemas) {
        super(nombreDeBanda, cantTemas);
        this.motivo = motivo;
        this.nombreContratante = nombreContratante;
        this.diaDeEvento = diaDeEvento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNombreContratante() {
        return nombreContratante;
    }

    public void setNombreContratante(String nombreContratante) {
        this.nombreContratante = nombreContratante;
    }

    public String getDiaDeEvento() {
        return diaDeEvento;
    }

    public void setDiaDeEvento(String diaDeEvento) {
        this.diaDeEvento = diaDeEvento;
    }
    
    public void actuar(){
        System.out.println("EVENTO = ");
        if(this.getMotivo().equalsIgnoreCase("a beneficio")){
            System.out.println("Recuerde colaborar con "+this.getNombreContratante());
        }
        else if (this.getMotivo().equalsIgnoreCase("show de tv")){
            System.out.println("Saludos amigos televidentes");
        }
        else System.out.println("Un feliz cumpleaños para "+this.getNombreContratante());
        super.listarTemas();
    }
    
    public double calcularCosto(){
        double suma = 0;
        if(this.getMotivo().equalsIgnoreCase("a beneficio")){
            return suma;
        }
        else if (this.getMotivo().equalsIgnoreCase("show de tv")){
            return suma += 50000;
        }
        else return suma += 150000;
    }
}

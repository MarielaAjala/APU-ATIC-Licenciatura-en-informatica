package repaso_ej3_recitales;

public class Gira extends Recital{
    private String nombre;
    private int cantFechas,cantFechasAgregadas,actual;
    private Fecha [] fechas;
     
    public Gira(String nombre, int cantFechas,String nombreDeBanda, int cantTemas) {
        super(nombreDeBanda,cantTemas);
        this.setNombre (nombre) ;
        this.setCantFechas (cantFechas) ;
        this.inicializarFechas();
    }
    
    public int getCantFechasAgregadas() {
        return cantFechasAgregadas;
    }

    public void setCantFechasAgregadas(int cantFechasAgregadas) {
        this.cantFechasAgregadas = cantFechasAgregadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantFechas() {
        return cantFechas;
    }

    public void setCantFechas(int cantFechas) {
        this.cantFechas = cantFechas;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
    private void inicializarFechas(){
        this.setFechas(new Fecha[this.getCantFechas()]);
        this.setActual(0);
        this.setCantFechasAgregadas(0);
    }

    public Fecha[] getFechas() {
        //¿Esta bien que retorne lA estructura?
        return fechas;
    }

    private void setFechas(Fecha[] fechas) {
        //¿Esta bien que retorne que exista este setter?
        this.fechas = fechas;
    }
    
    public void agregarFecha (Fecha unaFecha){
        if(this.getCantFechasAgregadas()< this.getCantFechas()){
            this.getFechas()[this.getCantFechasAgregadas()] = unaFecha;
            this.setCantFechasAgregadas(this.getCantFechasAgregadas()+1);
        }
        else System.out.println("No se pueden agregar mas fechas.");
    }
    
    public void actuar(){
        if(this.getFechas()!=null){
            System.out.println("GIRA = ");
            System.out.println("Buenas noches "+this.getFechas()[this.getActual()].getCiudad());
            super.listarTemas();
            this.setActual(this.getActual()+1);
        }else System.out.println("No hay fechas pactadas!");
        
    }
    
    public double calcularCosto(){
        return 30000 * this.getCantFechasAgregadas();
    }

}

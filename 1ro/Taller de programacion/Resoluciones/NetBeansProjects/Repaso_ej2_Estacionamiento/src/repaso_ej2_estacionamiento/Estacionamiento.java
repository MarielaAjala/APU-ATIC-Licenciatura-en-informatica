package repaso_ej2_estacionamiento;

public class Estacionamiento {
    private String nombre,direccion,horaApertura,horaCierre;
    private Auto [][] plazasPorPiso;
    private int cantPisos,cantPlazas;

    public Estacionamiento(String nombre, String direccion) {
        this.setNombre (nombre) ;
        this.setDireccion (direccion) ;
        this.setHoraApertura("8:00");
        this.setHoraCierre("21:00");
        this.setCantPisos(5);
        this.setCantPlazas(10);
        this.setPlazasPorPiso(new Auto [this.getCantPisos()][this.getCantPlazas()]);
        this.inicializarPlazasPorPiso();
    }
    
    public Estacionamiento(String nombre, String direccion, String horaApertura, String horaCierre, int cantPisos, int cantPlazasPorPiso) {
        this.setNombre (nombre) ;
        this.setDireccion (direccion) ;
        this.setHoraApertura(horaApertura);
        this.setHoraCierre(horaCierre);
        this.setCantPisos(cantPisos);
        this.setCantPlazas(cantPlazasPorPiso);
        this.setPlazasPorPiso(new Auto [this.getCantPisos()][this.getCantPlazas()]);
        this.inicializarPlazasPorPiso();
    }

    private void inicializarPlazasPorPiso(){
        int i,j;
        for(i = 0; i < this.getCantPisos(); i++){
            for (j = 0; j < this.getCantPlazas(); j++){
                this.plazasPorPiso[i][j] = null;
                //java lo hace automaticamente, es cuestion de buen manejo
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    private void setPlazasPorPiso(Auto[][] plazasPorPiso) {
        this.plazasPorPiso = plazasPorPiso;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    private void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getCantPlazas() {
        return cantPlazas;
    }

    private void setCantPlazas(int cantPlazas) {
        this.cantPlazas = cantPlazas;
    }
    
    public void ocuparPlaza (Auto unAuto,int piso,int plaza){
    //OJOOO > El metodo da por sentado que el lugar existe y esta libre!!
    //Punto c del ej - PISOS Y PLAZAS VAN DE 1..N, X ESO DESCUENTO 1 ACA
        this.plazasPorPiso[piso-1][plaza-1] = unAuto;
    }
    
    public String encontrarPatente (String unaPatente){
        String aux="";
        int i=0,j;
        boolean encontre = false;
        while((i < this.getCantPisos())&&(!encontre)){
            j=0;
            while((j < this.getCantPlazas())&&(!encontre)){
                if((this.plazasPorPiso[i][j]!=null)&&(this.plazasPorPiso[i][j].getPatente().equalsIgnoreCase(unaPatente))){
                    aux += "Piso "+(i+1)+", plaza "+(j+1);
                    encontre = true;
                }
                j++;
            }
            i++;
        }
        if (encontre) return aux;
        else return "Auto inexistente";
    }

    public String getReporteOcupacional(){
        int i,j;
        String aux="";
        for(i = 0; i < this.getCantPisos(); i++){
            aux += "Piso "+i;
            for (j = 0; j < this.getCantPlazas(); j++){
                aux += " Plaza ";
                if(this.plazasPorPiso[i][j] == null){
                    aux += j+":libre ";
                }
                else {
                    aux += j+this.plazasPorPiso[i][j].toString();
                }
            aux += "\n";   
            }
        }
        return aux;
    }
    
//    public int cuantosOcupanPlazaY(int y){
//        int suma =0;
//        int i,j;
//        for(i = 0; i < this.getCantPisos(); i++)
//            if(this.getPlazasPorPiso()[i][y] != null)suma++;
//        return suma;
//    }
    
    public int cuantosOcupanPlazaY(int y){ //REFORMADO!!
        int suma =0;
        int lugar=y-1;
        if (y<this.getCantPlazas()){
            int i,j;
            for(i = 0; i < this.getCantPisos(); i++)
                if(this.plazasPorPiso[i][lugar] != null)suma++;
        }
        return suma;
    }
    
    @Override
    public String toString() {
        return "Estacionamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", horaApertura=" + horaApertura + ", horaCierre=" + horaCierre + ", cantPisos=" + cantPisos + ", cantPlazas=" + cantPlazas + '}';
    }
    
}

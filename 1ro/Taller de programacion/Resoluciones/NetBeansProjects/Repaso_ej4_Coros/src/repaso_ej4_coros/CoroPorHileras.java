package repaso_ej4_coros;

public class CoroPorHileras extends Coro {
    private int dimensionHilera,cantidadHileras,ingresados;
    private Corista [][] coristas;

//    public CoroPorHileras(int dimensionHilera, int cantidadHileras, String nombre) {
//        super(nombre);
//        this.setDimensionHilera (dimensionHilera) ;
//        this.setCantidadHileras (cantidadHileras) ;
//        this.setIngresados (0);
//        this.inicializarCoristas();
//    } Saque el constructor super(nombre) !!!!!

    public CoroPorHileras(int dimensionHilera, int cantidadHileras, String nombre, Director director) {
        super(nombre, director);
        this.setDimensionHilera (dimensionHilera) ;
        this.setCantidadHileras (cantidadHileras) ;
        this.setIngresados (0);
        this.inicializarCoristas();   
    }
    private void inicializarCoristas(){
        this.coristas = new Corista [this.getCantidadHileras()][this.getDimensionHilera()];
        for (int i = 0; i < this.getCantidadHileras(); i++){
            for (int j = 0; j < this.getDimensionHilera(); j++){
                this.coristas[i][j] = null;
            }
        }
    }
    public int getDimensionHilera() {
        return dimensionHilera;
    }

    private void setDimensionHilera(int dimensionHilera) {
        this.dimensionHilera = dimensionHilera;
    }

    public int getCantidadHileras() {
        return cantidadHileras;
    }

    private void setCantidadHileras(int cantidadHileras) {
        this.cantidadHileras = cantidadHileras;
    }

    public int getIngresados() {
        return ingresados;
    }

    private void setIngresados(int ingresados) {
        this.ingresados = ingresados;
    }
    
    private int getCapacidadMaxima(){
        return this.getCantidadHileras() * this.getDimensionHilera();
    }
    
    public boolean estaLleno(){
        return this.getCapacidadMaxima() == this.getIngresados();
    }
    
    public void agregarCorista(Corista unCorista){
        int fila,columna;
//        System.out.println("Se esta ingresando un corista en coro por hileras ");
        if((this.coristas!=null)&&(!this.estaLleno())){
            fila = this.getIngresados()/this.getDimensionHilera();
            columna = this.getIngresados()%this.getDimensionHilera();
            this.coristas[fila][columna] = unCorista;
            this.setIngresados(this.getIngresados()+1);
            System.out.println();
        }
        else System.out.println("No se puede agregar el corista ingresado!");
    }
    
    private boolean cumpleVertical(int hileras){
        int i=0;
        boolean cumple=true;
        while ((cumple)&&((i+1) < hileras)){
            if(this.coristas[i][0].getTonoFundamental() < this.coristas[i+1][0].getTonoFundamental()){
                cumple=false;
            }
            i++;
        }
        return cumple;
    }
    
    private boolean chequearHileraCompleta(int hilera){
        boolean ok=true;
        int j=0,dimensionHilera=this.getDimensionHilera();
        while((j+1<dimensionHilera)&& ok){
            if(this.coristas[hilera][j].getTonoFundamental() != this.coristas[hilera][j+1].getTonoFundamental()){
                ok = false;
            }
            j++;
        }
        return ok;
    }
    
    private boolean chequearHileraIncompleta(int hilera, int cantOcupantesHilera){
        boolean ok=true;
        int j=0;
        while((j+1<cantOcupantesHilera)&& ok){
            if(this.coristas[hilera][j].getTonoFundamental() != this.coristas[hilera][j+1].getTonoFundamental()){
                ok = false;
            }
            j++;
        }
        return ok;
    }
    
    private boolean cumpleHorizontal(int hileras){
        int i=0,cantUltimaHilera=this.getIngresados()%this.getDimensionHilera();
        boolean cumple=true;
        while (cumple&&(i<(hileras-1))){
            cumple=this.chequearHileraCompleta(i);
            i++;
        }
        if (cumple){
            cumple=this.chequearHileraIncompleta(hileras-1, cantUltimaHilera);
        }
        return cumple;
    }
    
    public boolean estaBienFormado(){
        int hileras=this.getCantidadHileras();
        boolean cumpleVertical=this.cumpleVertical(hileras);
        if(cumpleVertical){
            return this.cumpleHorizontal(hileras);
        }
        else{
            return (cumpleVertical);
        } 
    }
    
    public String toString(){
        String aux="Coro por hileras: "+super.toString()+"Lista de coristas: \n";
        int j, cant=0, hileras=this.getIngresados()/this.getDimensionHilera();
        for (int i = 0; i <= hileras; i++){
            aux+="Hilera "+i+": \n";
            j=0;
            while ((j < this.getDimensionHilera())&&(cant<this.getIngresados())){
                aux+=this.coristas[i][j].toString()+"\n";
                j++;
                cant++;
            }
        }
        return aux;
    }
}

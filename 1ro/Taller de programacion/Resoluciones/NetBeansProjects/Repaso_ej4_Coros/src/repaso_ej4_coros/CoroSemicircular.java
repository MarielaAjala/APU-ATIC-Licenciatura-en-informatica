package repaso_ej4_coros;

public class CoroSemicircular extends Coro {
    private int dimension,ingresados;
    private Corista [] coristas;

    public CoroSemicircular(String nombre, Director director, int dimension) {
        super(nombre, director);
        this.setIngresados(0);
        this.setDimension(dimension);
        this.inicializarCoristas(new Corista[this.getDimension()]);
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getIngresados() {
        return this.ingresados;
    }

    public void setIngresados(int ingresados) {
        this.ingresados = ingresados;
    }

    private void inicializarCoristas(Corista[] coristas) {
        this.coristas = coristas;
        for (int i=0;i<this.getDimension();i++){
            this.coristas[i]=null;
        }
    }
      
    public boolean estaLleno(){
        return this.getDimension() == this.getIngresados();
    }
    
    public void agregarCorista(Corista unCorista){
//        System.out.println("Se esta ingresando un corista en coro semicircular ");
        if(!this.estaLleno()){
            this.coristas[this.getIngresados()] = unCorista;
            this.setIngresados(this.getIngresados()+1);
//            System.out.println("Cantidad de ingresados = "+this.getIngresados());
        }
        else System.out.println("No se puede agregar el corista ingresado!");
    }

    public boolean estaBienFormado(){
        boolean cumple=true;
        int i =0;
        while (( cumple )&&((i+1) < this.getIngresados())){
            if(this.coristas[i].getTonoFundamental() < this.coristas[i+1].getTonoFundamental()){
                cumple = false;
            }
            i++;
        }
        return cumple;
    }
    public String toString(){
        String aux="Coro semicircular: "+super.toString()+"Lista de coristas: \n";
        for (int i=0;i<this.getIngresados();i++){
            aux+=coristas[i].toString()+"\n";
        }
        return aux;
    }
}

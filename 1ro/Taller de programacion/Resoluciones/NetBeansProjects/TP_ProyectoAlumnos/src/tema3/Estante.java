package tema3;

public class Estante {
    //En caso que quisiera definir la cantidad de libros deberia recibir el parametro dimF
    //Y por ende crear un constructor con ese parametro
    private int dimL,dimF;
    private Libro [] libros;

    public Estante() {
        //Se pidio que el maximo de libros fueran 20 
        this.dimL = 0;
        this.dimF = 20;
        libros = new Libro [dimF];
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }
    public int getCantLibros(){
        return this.dimL;
    }
    
    public boolean estaLleno(){
        return dimL == dimF;
    }
    
    public boolean agregarLibro(Libro unLibro){
        if(!this.estaLleno()){
            this.libros[this.dimL++] = unLibro;
            return true;
        }else return false;
    }
    
    public Libro encontrarTitulo (String unTitulo){
        int i = 0;
        boolean es;
        while((i<dimL)&&( !this.libros[i].getTitulo().equals(unTitulo))){
            i++;
        }
        if(i<dimL)return this.libros[i];
        else return null;
    }
}

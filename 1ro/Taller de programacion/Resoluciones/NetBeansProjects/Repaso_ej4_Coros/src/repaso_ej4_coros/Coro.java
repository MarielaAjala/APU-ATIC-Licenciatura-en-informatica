package repaso_ej4_coros;

public abstract class Coro {
    private String nombre;
    private Director director;
    
    
//    public Coro(String nombre) {
//        this.setNombre (nombre);
//    }

    public Coro(String nombre, Director director) {
        this.setNombre(nombre);
        this.setDirector(director);    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public abstract void agregarCorista(Corista unCorista);
    public abstract boolean estaLleno();
    public abstract boolean estaBienFormado();
    public String toString(){
        String aux="Nombre: "+this.getNombre()+", "+this.getDirector().toString()+". \n";
        return aux;
    }
}

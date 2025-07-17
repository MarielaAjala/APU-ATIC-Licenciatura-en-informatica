package repaso_ej3_recitales;

public abstract class Recital {
    private String nombreDeBanda;
    private int cantTemas,cantTemasAgregados;
    private String [] temas;

    public Recital(String nombreDeBanda, int cantTemas) {
        this.setNombreDeBanda (nombreDeBanda);
        this.setCantTemas (cantTemas) ;
        this.setCantTemasAgregados(0);
        this.setTemas(new String[this.getCantTemas()]);
    }

    private void setTemas(String [] temas){
        this.temas = temas;
    }
    
    public String getNombreDeBanda() {
        return nombreDeBanda;
    }

    public void setNombreDeBanda(String nombreDeBanda) {
        this.nombreDeBanda = nombreDeBanda;
    }

    public int getCantTemas() {
        return cantTemas;
    }

    public void setCantTemas(int cantTemas) {
        this.cantTemas = cantTemas;
    }

    public int getCantTemasAgregados() {
        return cantTemasAgregados;
    }

    public void setCantTemasAgregados(int cantTemasAgregados) {
        this.cantTemasAgregados = cantTemasAgregados;
    }
    
    public String getTema(int indice){
        if(indice < this.getCantTemasAgregados()){
            return this.temas[indice];
        }
        else return null;
    }
    
    public void agregarTema(String nombre){
        if (this.getCantTemasAgregados()<this.getCantTemas()){
            this.temas[this.getCantTemasAgregados()] = nombre;
            //¿Esta bien en la linea de abajo usar getters y setters o mejor manejar la variable?
            this.setCantTemasAgregados(this.getCantTemasAgregados()+1);
        }
        else System.out.println("No se pueden agregar mas temas.");
    }

    public void listarTemas (){
        System.out.println("Listado de temas que se tocaran: ");
        for (int i = 0; i < this.getCantTemasAgregados(); i++){
            System.out.println(this.getTema(i));
        }
        System.out.println();
    }
    
    public void actuar(String tema){
//        Imprime (por consola) para cada tema la leyenda “y ahora 
//        tocaremos…” seguido por el nombre del tema.
//¿Esta bien que reciba el nombre como parametro o habia q hacerlo de otra manaera?
        System.out.println("Y ahora tocaremos "+'"'+tema+'"');
    }
    
    public abstract double calcularCosto();
}
 
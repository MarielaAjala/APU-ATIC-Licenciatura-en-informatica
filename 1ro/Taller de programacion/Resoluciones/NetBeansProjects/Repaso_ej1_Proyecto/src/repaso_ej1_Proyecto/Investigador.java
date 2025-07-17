
package repaso_ej1_Proyecto;

public class Investigador {
    private String nombre;
    private int categoria;  // 1..5
    private String especialidad;
    private Subsidio [] subsidios; //MAXIMO 5
    private int cantSubsidios,cantMaxSubsidios;

    public Investigador(String nombre, int categoria, String especialidad) {
        this.setNombre (nombre) ;
        this.setCategoria (categoria) ;
        this.setEspecialidad (especialidad);
        this.setCantMaxSubsidios (5);
        this.setCantSubsidios (0);
        this.setSubsidios (new Subsidio[cantMaxSubsidios]) ;
        //this.setSubsidios (new Subsidio[this.getCantMaxSubsidios()]) ;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Subsidio[] getSubsidios() {
        return subsidios;
    }

    public void setSubsidios(Subsidio[] subsidios) {
        this.subsidios = subsidios;
    }

    public int getCantMaxSubsidios() {
        return cantMaxSubsidios;
    }

    public void setCantMaxSubsidios(int cantMaxSubsidios) {
        this.cantMaxSubsidios = cantMaxSubsidios;
    }

    public int getCantSubsidios() {
        return cantSubsidios;
    }

    public void setCantSubsidios(int cantSubsidios) {
        this.cantSubsidios = cantSubsidios;
    }

//    public void agregarSubsidio(Subsidio subsidio) {
//        if(this.getCantSubsidios()<this.getCantMaxSubsidios()){
//            this.getSubsidios() [this.getCantSubsidios()] = subsidio;
//            this.setCantSubsidios(++cantSubsidios);
//        }
//        else System.out.println("No se pueden agregar mas subsidios! ");    
//    }
    
    public void agregarSubsidio(Subsidio subsidio) {
        if(this.getCantSubsidios()<this.getCantMaxSubsidios()){
            this.subsidios[this.getCantSubsidios()] = subsidio;
            this.setCantSubsidios(++cantSubsidios);
        }
        else System.out.println("No se pueden agregar mas subsidios! ");    
    }

    public double getDineroOtorgado(){
        int i,j;
        double suma = 0;
        for (i = 0; i < this.getCantSubsidios(); i++){
            suma += this.getSubsidios()[i].getDineroOtorgado();
        }
        return suma;
    }
    
    @Override
    public String toString() {
        return "Investigador {" + "Nombre=" + nombre + ", categoria=" + categoria + ", especialidad=" + especialidad + '}'+"\nTotal de dinero en subsidios que le fue otorgado: "+this.getDineroOtorgado()+".\n";
    }
    
    
}

package repaso_ej1_Proyecto;

public class Proyecto {
    private String nombre;
    private int codigo;
    private String nombreDirector;
    private Investigador [] investigadores; //50 como maximo
    private int cantMaxDeInvestigadores,cantInvestigadores;
    
    public Proyecto(String nombre, int codigo, String nombreDirector) {
        this.setNombre (nombre);
        this.setCodigo (codigo);
        this.setNombreDirector (nombreDirector) ;
        this.setCantMaxDeInvestigadores(50);
        this.setCantInvestigadores(0);
        this.setInvestigadores(new Investigador[this.getCantMaxDeInvestigadores()]);
        //this.setInvestigadores(new Investigador[this.cantMaxDeInvestigadores]);
    }
    
    public int getCantMaxDeInvestigadores() {
        return cantMaxDeInvestigadores;
    }

    public void setCantMaxDeInvestigadores(int cantMaxDeInvestigadores) {
        this.cantMaxDeInvestigadores = cantMaxDeInvestigadores;
    }

    public int getCantInvestigadores() {
        return cantInvestigadores;
    }

    public void setCantInvestigadores(int cantInvestigadores) {
        this.cantInvestigadores = cantInvestigadores;
    }

    private Investigador[] getInvestigadores() {//BORRAR ESTE GETTER
        return investigadores;
    }

    public void setInvestigadores(Investigador [] investigadores) {
        this.investigadores = investigadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }
    
//    public void agregarInvestigador(Investigador unInvestigador) {
//        if(this.getCantInvestigadores()<this.getCantMaxDeInvestigadores()){
//            this.getInvestigadores()[getCantInvestigadores()] = unInvestigador;
//            this.setCantInvestigadores(++cantInvestigadores);
//        }
//        else System.out.println("No se pueden agregar mas investigadores! ");     
//    }
    
    public void agregarInvestigador(Investigador unInvestigador) {
        if(this.getCantInvestigadores()<this.getCantMaxDeInvestigadores()){
            this.investigadores[this.getCantInvestigadores()] = unInvestigador;
            this.setCantInvestigadores(++cantInvestigadores);
        }
        else System.out.println("No se pueden agregar mas investigadores! ");     
    }

    public double dineroTotalOtorgado(){
        double suma = 0;
        int i;
        for(i = 0; i < this.getCantInvestigadores(); i++){
            suma += this.getInvestigadores()[i].getDineroOtorgado();
        }
        return suma;
    }
    
    public void otorgarTodos(String nombre_completo){
        int i,j;
        for (i = 0; i < this.getCantInvestigadores(); i++){
            if(this.getInvestigadores()[i].getNombre().equals(nombre_completo)){
                for (j =0; j < this.getInvestigadores()[i].getCantSubsidios(); j++){
                    if(!this.getInvestigadores()[i].getSubsidios()[j].isOtorgado()){
                        this.getInvestigadores()[i].getSubsidios()[j].setOtorgado(true);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String aux;
        int i,j;
        aux = "Proyecto{" + "nombre=" + nombre + ", codigo=" + codigo + ", nombreDirector=" + nombreDirector + '}'+"\nMonto total otorgado del proyecto: "+this.dineroTotalOtorgado()+".\n\n";
        for (i = 0; i < this.getCantInvestigadores(); i++){
            aux += this.getInvestigadores()[i].toString()+".\n";
        }
        return aux;
    }
    
    
}

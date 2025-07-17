package tema3.ejer4;

public class Habitacion {
    private double costo;
    private boolean ocupada;
    private Cliente ocupante;

    public Habitacion(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    private void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Cliente getOcupante() {
        if(this.isOcupada()){
        return ocupante;
        }else{return null;}
    }

    public boolean setOcupante(Cliente ocupante) {
        //retorno si pude o no setearlo SOLO si hay lugar
         if(!this.isOcupada()){
            this.ocupante = ocupante;
            if (ocupante == null) this.setOcupada(false);
            else this.setOcupada(true);
            return true;
           }
        else{return false;}
    }
    
    public void liberarHabitacion(){
        if(this.isOcupada()){
            this.setOcupada(false);
            this.setOcupante(null);
        }
    }
    
    public String toString(){
        if (this.isOcupada()){
            return "Costo: "+Math.round(this.getCosto()*100)/100d+", ocupada, "+this.getOcupante().toString();
        }
        else{
            return "Costo: "+Math.round(this.getCosto()*100)/100d+", libre. ";
        }
    }
}

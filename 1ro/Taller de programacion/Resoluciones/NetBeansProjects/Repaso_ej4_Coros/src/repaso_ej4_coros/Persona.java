package repaso_ej4_coros;


public class Persona {
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        this.setNombre(unNombre);
        this.setDNI(unDNI);
        this.setEdad(unaEdad); 
    }
    
    public Persona(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        String aux; 
        aux = "Nombre " + nombre + ", DNI " + DNI + ", edad  " + edad + " años.";
        return aux;
    }
    
    
    
    
}

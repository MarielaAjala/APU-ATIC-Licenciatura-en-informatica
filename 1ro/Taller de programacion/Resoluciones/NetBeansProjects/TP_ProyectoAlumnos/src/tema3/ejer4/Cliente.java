package tema3.ejer4;
import tema2.Persona;
public class Cliente {
    private Persona cliente;

    public Cliente(String unNombre, int unDNI, int unaEdad) {
        cliente = new Persona(unNombre, unDNI, unaEdad);
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + cliente.toString()+ '}';
    }


    
}

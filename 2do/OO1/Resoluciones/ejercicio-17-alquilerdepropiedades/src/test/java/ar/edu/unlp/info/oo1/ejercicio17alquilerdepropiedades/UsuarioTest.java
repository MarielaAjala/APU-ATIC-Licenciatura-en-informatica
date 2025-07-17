package ar.edu.unlp.info.oo1.ejercicio17alquilerdepropiedades;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public class UsuarioTest {
private Usuario usuario;
private PropiedadEnAlquiler propiedad;
    
    @BeforeEach
    public void setUp() {
        usuario = new Usuario("Juan Pérez", "12345678A", "Calle Falsa 123");
        propiedad = new PropiedadEnAlquiler("Calle Falsa 123", "Casa en la playa", 100.0);
        usuario.agregarPropiedad(propiedad);
    }
    
   
    @Test
    public void testAgregarPropiedad() {
         assertTrue(usuario.getPropiedades().contains(propiedad));
    }
    @Test
    public void testCancelarReserva() {
    DateLapse periodo = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 7));
    	//Reserva reserva = new Reserva(periodo,usuario, propiedad);       
    	Reserva reserva =propiedad.crearReserva(periodo, usuario);
        assertTrue(propiedad.tieneReserva(reserva));
        propiedad.cancelarReserva(reserva);       
        assertFalse(propiedad.tieneReserva(reserva));
    }
//    @Test
//    public void testHayDisponibilidad() {
//        PropiedadEnAlquiler propiedad = new PropiedadEnAlquiler("Calle Falsa 123", "Casa en la playa", 150.0);
//        DateLapse periodo = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 7));
//        
//        assertTrue(usuario.hayDisponibilidad(propiedad, periodo));
//        
//        // Si ya está ocupada, debería devolver false
//        usuario.crearReserva(propiedad, periodo);
//        assertFalse(usuario.hayDisponibilidad(propiedad, periodo));
//    }
//    @Test
//    public void testCalcularReserva() {
//        PropiedadEnAlquiler propiedad = new PropiedadEnAlquiler("Calle Falsa 123", "Casa en la playa", 150.0);
//        propiedad.setPrecio(100); // Precio por día
//        DateLapse periodo = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 7)); // 7 días
//        
//        double costo = usuario.calcularReserva(propiedad, periodo);
//        assertEquals(700, costo, 0.01); // El coste esperado es 100 * 7 días
//    }
//    @Test
//    public void testCalcularIngresos() {
//        
//        
//        DateLapse periodoReserva = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 7)); // 7 días
//        DateLapse periodoConsulta = new DateLapse(LocalDate.of(2024, 12, 3), LocalDate.of(2024, 12, 5)); // Consulta de ingresos para 3-5 diciembre
//        
//        //Reserva reserva = new Reserva(periodoReserva, propiedad);
//        usuario.crearReserva(propiedad, periodoReserva);
//        propiedad.ocupar(periodoConsulta);
//        double ingresos = usuario.calcularIngresos(periodoConsulta);
//        
//        // Si la reserva se superpone en el periodo 3-5 diciembre, se espera que los ingresos sean 100 * 3 días * 0.75 (70% del ingreso)
//        assertEquals(225, ingresos, 0.01); 
//    }
//    @Test
//    public void testCrearReserva() {
//        PropiedadEnAlquiler propiedad = new PropiedadEnAlquiler("Calle Falsa 123", "Casa en la playa", 150.0);
//        DateLapse periodo = new DateLapse(LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 7));
//        
//        boolean resultado = usuario.crearReserva(propiedad, periodo);
//        
//        assertTrue(resultado); // La reserva se debería crear si la propiedad está disponible
//        assertTrue(propiedad.getPeriodosOcupados().contains(periodo));
//    }
}

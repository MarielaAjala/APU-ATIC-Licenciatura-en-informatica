package ar.edu.unlp.info.oo1.ejercicio13clientedecorreo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDeCorreoTest {
	ClienteDeCorreo cliente1=new ClienteDeCorreo("Juan");
	ClienteDeCorreo cliente2=new ClienteDeCorreo("Pedrito");
	Email mail1 = new Email("Titulo de mail 1. ","Cuerpo de mail 1.");
	Email mail2 = new Email("Titulo de mail 2. ","Cuerpo de mail 2.");
	Email mail3 = new Email("Titulo de mail 3. ","Cuerpo de mail 3.");
	Email mail4 = new Email("Titulo de mail 4. ","Cuerpo de mail 4.");
	Email mail5 = new Email("Titulo de mail 5. ","Cuerpo de mail 5.");
	Email mail6 = new Email("Titulo de mail 6. ","Cuerpo de mail 6.");
	Email mail7 = new Email("Titulo de mail 7. ","Cuerpo de mail 7.");
	Email mail8 = new Email("Titulo de mail 8. ","Cuerpo de mail 8.");
	Email mail9 = new Email("Titulo de mail 9. ","Cuerpo de mail 9.");
	
	@BeforeEach
	void setUp() {
		cliente1.recibir(mail1);
		cliente1.recibir(mail2);
		cliente1.recibir(mail3);
		
		
		cliente2.recibir(mail4);
		cliente2.recibir(mail5);
		
	}
	@Test
	public void recibirYBuscarMailsTest() {
		cliente1.recibir(mail6);
		cliente1.recibir(mail7);

		cliente2.recibir(mail8);
		cliente2.recibir(mail9);

		assertTrue(cliente1.buscar(mail1.getTitulo()).contains(mail1));
		assertTrue(cliente1.buscar(mail2.getTitulo()).contains(mail2));
		assertTrue(cliente1.buscar(mail3.getTitulo()).contains(mail3));
		assertTrue(cliente1.buscar(mail6.getTitulo()).contains(mail6));
		assertTrue(cliente1.buscar(mail7.getTitulo()).contains(mail7));

		assertTrue(cliente2.buscar(mail4.getTitulo()).contains(mail4));
		assertTrue(cliente2.buscar(mail5.getTitulo()).contains(mail5));
		assertTrue(cliente2.buscar(mail8.getTitulo()).contains(mail8));
		assertTrue(cliente2.buscar(mail9.getTitulo()).contains(mail9));
	}

	@Test
	public void espacioOcupadoTest() {
		assertEquals(105,cliente1.espacioOcupado(),"El espacio ocupado por cliente1 es "+cliente1.espacioOcupado());
		assertEquals(70,cliente2.espacioOcupado(),"El espacio ocupado por cliente1 es "+cliente2.espacioOcupado());
	}
}

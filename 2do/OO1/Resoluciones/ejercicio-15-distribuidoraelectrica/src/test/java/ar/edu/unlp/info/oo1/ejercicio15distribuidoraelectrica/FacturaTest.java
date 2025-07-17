package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {
	private Factura fact1;
	private Usuario usu1;
	private Domicilio domi1;
	private Consumo consuAnt,consuAct;
	CuadroTarifario cuadroTarifario;
	@BeforeEach
	private void setUp() {
		domi1= new Domicilio("La calle imaginaria", 100, 4, "a", "Una ciudad imaginaria", "Una provincia imaginaria");
		usu1=new Usuario("Un usuario imaginario",domi1);
		consuAnt=new Consumo(150, 20);
		consuAct=new Consumo(170, 29);
		cuadroTarifario= new CuadroTarifario(53);
		fact1= new Factura(usu1, consuAnt, consuAct,cuadroTarifario);
	}
	@Test
	void setMontoFinalTest() {
		assertEquals(8109,fact1.getMontoFinal());
	}
}

package ar.edu.unlp.info.oo1.ejercicio9cuenta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CajaDeAhorroTest {	
		CajaDeAhorro ca1, ca2,ca3;
		@BeforeEach
		void setUp() throws Exception {
			ca1 = new CajaDeAhorro();
			ca1.depositar(400);
			ca2 = new CajaDeAhorro();
			ca2.depositar(400);
			ca3 = new CajaDeAhorro();
			ca3.depositar(400);
		}
		
	    @Test
	    public void testDepositar() {
	    	ca1.depositar(200); 	
	    	assertEquals(588,ca1.getSaldo()); 
	    	//assertEquals(596,ca1.getSaldo()); MAL DADO EL VALOR DEL TEST POR LA CATEDRA, NO QUITA EL 2%
	        assertEquals(392, ca2.getSaldo());
	        assertEquals(392,ca3.getSaldo()); 
	    }
	    @Test
	    public void testExtraer() {
	    	ca2.extraer(100);
	    	ca3.extraer(400);
	    	//assertEquals(298, ca2.getSaldo());
	    	assertEquals(290, ca2.getSaldo());
	        //assertEquals(400, ca3.getSaldo());
	    	assertEquals(392, ca3.getSaldo()); //No se pudo extraer porque no alcanzaba el saldo
	        assertTrue(ca1.extraer(200), "Informa que no puede extraer $200 teniendo $400 en caja de ahorro. ");
	    	assertTrue(ca2.extraer(100),"Informa que no puede extraer $100 teniendo $400 en caja de ahorro. ");
            assertFalse(ca3.extraer(400), "Informa que puede extraer $400 teniendo $400 en caja de ahorro necesitando $408. ");
	    }
	    @Test
	    public void testPuedeExtraer() {
	    	assertTrue(ca1.puedeExtraer(200), "Informa que no puede extraer $200 teniendo $400 en caja de ahorro. ");
	    	assertTrue(ca2.puedeExtraer(100),"Informa que no puede extraer $100 teniendo $400 en caja de ahorro. ");
            assertFalse(ca3.puedeExtraer(400), "Informa que puede extraer $400 teniendo $400 en caja de ahorro necesitando $408. ");
	    }
	    @Test
	    public void testTransferirACuenta() {
	    	ca1.transferirACuenta(200, ca2);//al que transfiere 200 le quita 204 y el que recibe recibe 200
	    	//assertEquals(196, ca1.getSaldo()); Esta mal porque el saldo original era 392 y no 400 x el 2%
	    	assertEquals(188, ca1.getSaldo());
	        //assertEquals(600, ca2.getSaldo());
	    	assertEquals(392+(200*.98), ca2.getSaldo());//Aca se suman 200-2%
	        ca1.transferirACuenta(196, ca3);
	        //assertEquals(196, ca1.getSaldo());
	        assertEquals(188, ca1.getSaldo()); //Sin cambio en el saldo porque no pudo realizarse transferencia
	        assertEquals(392, ca3.getSaldo());
	    }
}
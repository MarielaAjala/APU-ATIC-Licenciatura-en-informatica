package ar.edu.unlp.info.oo1.ejercicio9cuenta;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CuentaCorrienteTest { 	
	CuentaCorriente cc1, cc2,cc3;
		
		@BeforeEach
		void setUp() throws Exception {
			cc1 = new CuentaCorriente();
			cc2 = new CuentaCorriente();
			cc3 = new CuentaCorriente();
			cc1.depositar(100);
			cc2.depositar(100);
			cc3.depositar(100);
			cc1.setLimiteDescubierto(500);
			cc2.setLimiteDescubierto(500);
			cc3.setLimiteDescubierto(500);
		}
		
	    @Test
	    public void testDepositar() {
	    	cc1.depositar(200); 	
	    	cc2.depositar(0); 	
	        assertEquals(300,cc1.getSaldo()); 
	        assertEquals(100,cc2.getSaldo()); 
	    }
	    @Test
	    public void testExtraer() {
	    	cc1.extraer(100);
	    	cc2.extraer(400);
	    	cc3.extraer(700);
	    	assertEquals(0, cc1.getSaldo());
	    	assertEquals(-300, cc2.getSaldo());
	        assertEquals(100, cc3.getSaldo());
	        assertTrue(cc1.extraer(100), "Informa que no puede extraer $100 teniendo $100 en cuenta corriente. ");
	    	assertTrue(!cc2.extraer(400),"Informa que puede extraer $400 teniendo $-300 en cuenta corriente y $500 en descubierto. ");
	    	assertTrue(!cc3.extraer(700),"Informa que puede extraer $700 teniendo $100 en cuenta corriente y $500 en descubierto. ");
	    }
	    @Test
	    public void testPuedeExtraer() {
	    	assertTrue(cc1.puedeExtraer(200), "Informa que no puede extraer $200 teniendo $100 en cuenta corriente y $500 en descubierto. ");
	    	assertTrue(cc2.puedeExtraer(100),"Informa que no puede extraer $100 teniendo $100 en cuenta corriente. ");
	    	assertTrue(!cc3.puedeExtraer(700),"Informa que puede extraer $700 teniendo $100 en cuenta corriente y $500 en descubierto. ");
	    }
	    @Test
	    public void testTransferirACuenta() {
	    	cc1.transferirACuenta(200, cc2);
	    	assertEquals(-100, cc1.getSaldo());
	        assertEquals(300, cc2.getSaldo());
	        cc1.transferirACuenta(400, cc3);
	        assertEquals(-500, cc1.getSaldo());
	        assertEquals(500, cc3.getSaldo());
	        cc1.transferirACuenta(20, cc2);
	        assertEquals(-500,cc1.getSaldo());
	        assertEquals(300,cc2.getSaldo());
	    }
}
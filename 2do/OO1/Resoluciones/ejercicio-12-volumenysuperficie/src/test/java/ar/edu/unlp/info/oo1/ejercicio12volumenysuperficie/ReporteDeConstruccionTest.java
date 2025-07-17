package ar.edu.unlp.info.oo1.ejercicio12volumenysuperficie;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ReporteDeConstruccionTest {
	ReporteDeConstruccion reporte1,reporte2;
	String color1="blanco",color2="azul",color3="violeta";
	String material1="cromo",material2="hierro",material3="acero inoxidable";
	
	@BeforeEach
	void setUp() throws Exception {
		reporte1 = new ReporteDeConstruccion();
		reporte2 = new ReporteDeConstruccion();
		Pieza pieza1,pieza2,pieza3,pieza4,pieza5,pieza6,pieza7,pieza8,pieza9;
		
		pieza1 = new Cilindro(2,3,color1,material1);
		pieza2 = new Esfera(3,color2,material2);
		pieza3 = new PrismaRectangular(4,5,6,color3,material3);
		pieza4 = new Cilindro(3,4,color1,material1);
		
		pieza5 = new Esfera(4,color2,material2);
		pieza6 = new PrismaRectangular(7,8,9,color3,material3);
		pieza7 = new Cilindro(4,5,color1,material1);
		pieza8 = new Esfera(5,color2,material2);
		pieza9 = new PrismaRectangular(9,10,11,color3,material3);
		
		reporte1.agregarPieza(pieza1);
		reporte1.agregarPieza(pieza2);
		reporte1.agregarPieza(pieza3);
		reporte1.agregarPieza(pieza4);
		
		reporte2.agregarPieza(pieza5);
		reporte2.agregarPieza(pieza6);
		reporte2.agregarPieza(pieza7);
		reporte2.agregarPieza(pieza8);
		reporte2.agregarPieza(pieza9);
	}
	
    @Test
    public void testGetVolumenDeMaterial() {
        assertEquals(150.79644737231007,reporte1.getVolumenDeMaterial(material1));
        assertEquals(593.7610115284708,reporte2.getVolumenDeMaterial(material2));
    }
    @Test
    public void testGetSuperficieDeColor() {
    	assertEquals(194.7787445225672,reporte1.getSuperficieDeColor(color1));
        assertEquals(515.2211951887261,reporte2.getSuperficieDeColor(color2));
    }
}

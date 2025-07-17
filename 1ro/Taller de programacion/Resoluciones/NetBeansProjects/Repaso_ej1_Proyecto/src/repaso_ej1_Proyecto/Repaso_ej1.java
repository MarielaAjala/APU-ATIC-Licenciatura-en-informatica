package repaso_ej1_Proyecto;

public class Repaso_ej1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Investigador i1,i2,i3;
        //investigador(nombre,categoria,especialidad)
        i1=new Investigador("Pedro Almodovar",2,"Peliculas");
        i2=new Investigador("Anastasio Argentino",3,"Vitivinicultura");
        i3=new Investigador("Julio Aguirre",1,"Ciencias Medicas");
        //proyecto(nombre,codigo,nombreDirector)
        Proyecto p = new Proyecto("Proyecto variado 1",1,"Director Z");
        //subsidio(montoSolicitado,motivo)
        Subsidio subsidio1 = new Subsidio (1000.0,"Porque si");
        Subsidio subsidio2 = new Subsidio (2000.0,"Para filmar peliculas con vinos");
        Subsidio subsidio3 = new Subsidio (3000.0,"Para comprar frutas");
        Subsidio subsidio4 = new Subsidio (4000.0,"Por diversion");
        Subsidio subsidio5 = new Subsidio (5000.0,"Porque me quede sin plata");
        Subsidio subsidio6 = new Subsidio (6000.0,"Para viajar");
        i1.agregarSubsidio(subsidio1);
        i1.agregarSubsidio(subsidio2);
        i2.agregarSubsidio(subsidio3);
        i2.agregarSubsidio(subsidio4);
        i3.agregarSubsidio(subsidio5);
        i3.agregarSubsidio(subsidio6);
        p.agregarInvestigador(i1);
        p.agregarInvestigador(i2);
        p.agregarInvestigador(i3);
        //¿Estan bien lineas 31 a 33? (el getImvestigadores() y getSubsidios())
//        p.getInvestigadores()[0].getSubsidios()[0].setOtorgado(true);
//        p.getInvestigadores()[0].getSubsidios()[1].setOtorgado(true);
        p.otorgarTodos("Anastasio Argentino");
        System.out.println("Datos del proyecto: "+p.toString());
        
    }
    
}

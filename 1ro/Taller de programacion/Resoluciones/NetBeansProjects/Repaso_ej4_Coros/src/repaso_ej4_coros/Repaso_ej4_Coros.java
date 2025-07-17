
package repaso_ej4_coros;

public class Repaso_ej4_Coros {

    public static void main(String[] args) {
        //director(antiguedad,nombre,DNI,edad)
        Director director = new Director(15,"Nombre de director",27272383,55);
        Director director2 = new Director(5,"Nombre de director 2",25333983,45);
        
        //coroSemimcircular(nombre,director,dimension)
        CoroSemicircular cs = new CoroSemicircular ("Nombre de coro",director,10);
        //CoroPorHileras(dimensionHilera,cantidadHileras,nombre,director)
        CoroPorHileras ch = new CoroPorHileras (2,3,"Otro nombre de coro",director2);
        
        //Corista(tonoFundamental, unNombre, unDNI, unaEdad)
        Corista corista_1 = new Corista (1,"Nombre de corista 1",26192192,43);
        Corista corista_2 = new Corista (2,"Nombre de corista 2",27192192,41);
        Corista corista_3 = new Corista (3,"Nombre de corista 3",28192192,40);
        Corista corista_4 = new Corista (4,"Nombre de corista 4",29192192,39);
        Corista corista_5 = new Corista (6,"Nombre de corista 5",30192192,38);
        Corista corista_6 = new Corista (6,"Nombre de corista 6",31192192,37);
        Corista corista_7 = new Corista (8,"Nombre de corista 7",32192192,36);
        Corista corista_8 = new Corista (8,"Nombre de corista 8",33192192,35);
        Corista corista_8_mal = new Corista (9,"Nombre de corista 8_mal",33192192,35);
        
        cs.agregarCorista(corista_1);      //CORO MAL FORMADO
        cs.agregarCorista(corista_2); 
        cs.agregarCorista(corista_3);
        
//        cs.agregarCorista(corista_3);   //CORO BIEN FORMADO
//        cs.agregarCorista(corista_2); 
//        cs.agregarCorista(corista_1); 
        
        ch.agregarCorista(corista_4);   //CORO mal FORMADO
        ch.agregarCorista(corista_5);
        ch.agregarCorista(corista_6);
        ch.agregarCorista(corista_7);
        ch.agregarCorista(corista_8_mal);
        
//        ch.agregarCorista(corista_8);   //CORO BIEN FORMADO
//        ch.agregarCorista(corista_7);
//        ch.agregarCorista(corista_6);
//        ch.agregarCorista(corista_5);
//        ch.agregarCorista(corista_4);   
        
//        for (int i = 0; i < 20; i++){
//            ch.agregarCorista(corista_1);
//            ch.agregarCorista(corista_2);
//        }
//        for (int i = 0; i < 6; i++){
//            cs.agregarCorista(corista_1);
//            cs.agregarCorista(corista_2);
//        }
        System.out.println("cs.estaBienFormado() "+cs.estaBienFormado());;
        System.out.println("ch.estaBienFormado() "+ch.estaBienFormado());
        System.out.println(cs.toString());
        System.out.println("Cantidad de componentes de coro por hileras: "+ch.getIngresados());
        System.out.println(ch.toString());
    }
    
}

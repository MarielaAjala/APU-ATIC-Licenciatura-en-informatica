package repaso_ej3_recitales;

public class Repaso_ej3_Recitales {

    public static void main(String[] args) {
        // TODO code application logic here
        EventoOcasional evento = new EventoOcasional("Show de TV",
                                                    "Municipalidad de La Plata",
        "19-11-2023","Los Autenticos Decadentes",12);
      //(String motivo, String nombreContratante, String diaDeEvento, String nombreDeBanda, int cantTemas)
        Gira gira = new Gira("Stunning World Tour",15,"Rolling Stones",20);
      //(String nombre, int cantFechas,String nombreDeBanda, int cantTemas)
        Fecha otraFecha,unaFecha = new Fecha("La Plata","12-3-23");
        otraFecha = new Fecha("Brandsen","12-12-22");
        gira.agregarFecha(unaFecha);
        gira.agregarFecha(otraFecha);
        gira.agregarTema("Welcome to the jungle");
        gira.agregarTema("Wild horses");
        gira.agregarTema("Wonderful woman");
        gira.agregarTema("Here it comes again");
        gira.agregarTema("Come to me always");
        evento.agregarTema("Hoy es tu bright day");
        evento.agregarTema("Comete esta zanahoria!");
        evento.agregarTema("Colgate de esta");
        evento.agregarTema("Luxurious days");
        evento.agregarTema("Anda a mentirle a otro");
        System.out.println("Costo del evento: "+evento.calcularCosto());
        System.out.println("Costo de la gira: "+gira.calcularCosto());
        evento.actuar();
        gira.actuar();
        gira.actuar();
    }
    
}

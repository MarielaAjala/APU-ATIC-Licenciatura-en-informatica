package repaso_ej2_estacionamiento;
import PaqueteLectura.Lector;
public class Repaso_ej2_Estacionamiento {

    public static void main(String[] args) {
        // TODO code application logic here
        Estacionamiento e = new Estacionamiento("El estacionamiento ESTRELLA","Avenida Bonifacio 3012","6:00","23:00",3,3);
        Auto unAuto = new Auto("Mariela Ajala","gmf395");
        Auto unAuto2 = new Auto("Omar Arturi","fqr517");
        Auto unAuto3 = new Auto("Leandro Ajala","aa643ay");
        Auto unAuto4 = new Auto("Otro propietario","rrr333");
        Auto unAuto5 = new Auto("Natalia Natalia","ag317yu");
        Auto unAuto6 = new Auto("Andres Artaza","osn456");
        e.ocuparPlaza(unAuto,1 , 2);
        e.ocuparPlaza(unAuto2,1 , 1);
        e.ocuparPlaza(unAuto3,2 , 2);
        e.ocuparPlaza(unAuto4,2 , 3);
        e.ocuparPlaza(unAuto5,3 , 1);
        e.ocuparPlaza(unAuto6,3 , 3);
        System.out.println(e.toString());
        System.out.println();
        System.out.println("Cantidad de autos que ocupan la plaza 1: "+e.cuantosOcupanPlazaY(1));
        System.out.println("Ingrese patente a buscar: ");
        System.out.println(e.encontrarPatente(Lector.leerString()));
    }
    
}

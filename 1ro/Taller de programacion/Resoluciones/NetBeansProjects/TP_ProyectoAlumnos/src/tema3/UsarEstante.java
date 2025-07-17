package tema3;

public class UsarEstante {

    public static void main(String[] args) {
        // TODO code application logic here
        Estante e1,e2,e3,e4;
        e1 = new Estante();
        Libro libro1 = new Libro("Un titulo","Una editorial",2023,new Autor("Un nombre de autor.","Una biografia de este autor.","Un origen del autor."),"Un ISBN",2500.50);
        Libro libro2 = new Libro("Los hombres son de Marte, las mujeres de Venus","Otra editorial",2023,new Autor("Otro nombre de autor.","Otra biografia de este autor.","Otro origen del autor."),"Otro ISBN",2900.50);
        Libro libro3 = new Libro("Mujercitas","Otra editorial",2023,new Autor("Louisa May Alcott.","Fue una escritora estadounidense, famosa por su novela «Mujercitas». nació en 1832 en Germantown, Pensilvania, y fue educada por su padre y por varios educadores amigos de este. Fue una feminista y activista antiesclavista que se inspiró en su madre, una abolicionista y defensora de los derechos de la mujer125. trabajó como maestra, escritora y costurera, y escribió cuentos morales para una audiencia joven. murió en 1888\n" +
".","Otro origen del autor."),"Otro ISBN",2900.50);
        Libro libro4 = new Libro("Moby Dick","Otra editorial",2023,new Autor("Otro nombre de autor.","Otra biografia de este autor.","Otro origen del autor."),"Otro ISBN",2900.50);
        e1.agregarLibro(libro1);
        e1.agregarLibro(libro2);
        e1.agregarLibro(libro3);
        e1.agregarLibro(libro4);
        Libro l = e1.encontrarTitulo("Mujercitas");
        if(l!=null){
            System.out.println("Autor del libro Mujercitas: "+l.getPrimerAutor().getNombre());
        }
        else System.out.println("No se encuentra el libro Mujercitas en este estante.");
    }
    
}

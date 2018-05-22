package abstraccion;

public class Aplicacion {

    //psvm ctrl + barra
    public static void main(String[] args) {
        //Crear un objeto de tipo de Grados
        Grados g = new Grados();
        //A este objeto le asignamos un valor a su atributo centigrados 
        g.setCentigrados(20);
        //Creamos un objeto de la clase conversion
        Conversion c=new Conversion();
        c.setGrados(g);
        //Aplicar el módelo
        //sout para mostrar System ctrl + barra espaciadora
          System.out.println( c.centigradosAFarenheit());
          
          //creando  objeto
    }
}

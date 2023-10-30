public class Main {
    public static void main(String[] args) {
        //En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        //Se crean los objetos referentes a cada clase hija.
        Mamifero guepardo = new Mamifero(1, "Cheto", 32, "Peluda", "Carne", 4, "Polígamo", "Anaranjado", "Sabana");
        Ave pelicano = new Ave(2, "Martin", 15, "Aplumada", "Pescado", 120.60, "Planeo", "Blanco", "Bolsa");
        Reptil iguana = new Reptil(3, "Jango", 8, "Escamosa", "Insectos y verduras", 56.48, "Cicloides", "No tiene", "Bosques");

        //Se llaman a los métodos asociados a los objetos creados.
        guepardo.saludar();
        pelicano.saludar();
        iguana.saludar();

        //Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
        //Se crea el objeto
        Animal prueba = guepardo;

        //Se muestran los datos del objeto para comprobar que se acceden a los atributos de la clase
        System.out.println("Datos del animal creado al que se le asignan los datos del mamífero: ");
        System.out.println(prueba.getNombre());
        System.out.println(prueba.getTipoAlimentacion());
        //Es posible crear un objeto del tipo de la clase madre, pero solo se podrán acceder a los atributos de dicha clase, no a los declarados en la clase hija

        //Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
        //Si se cambia el modificador de acceso de los métodos a private no se permite el acceso desde el Main.
    }
}
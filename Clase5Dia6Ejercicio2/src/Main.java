public class Main {
    public static void main(String[] args) {
        //Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
        Vestimenta[] vestimentas = new Vestimenta[9];
        vestimentas[0] = new Zapato(1, "Deportivas", 119.99, "Nike", "42.5", "Blanco", "Piel", "Cordones");
        vestimentas[1] = new Zapato(2, "Chanclas", 14.99, "Quicksilver", "36", "Negro", "Plástico", "Empeine");
        vestimentas[2] = new Zapato(3, "Crocks", 29.99, "Crock", "39.5", "Azul", "Plástico", "Talón");
        vestimentas[3] = new Pantalon(4, "Chándal", 34.99, "Adidas", "L", "Negro", "Informal", "Poliéster");
        vestimentas[4] = new Pantalon(5, "Vaquero", 24.99, "Bershka", "38", "Gris", "Formal", "Denim");
        vestimentas[5] = new Pantalon(6, "Chino", 29.99, "Zara", "M", "Marrón", "Arreglado", "Algodón");
        vestimentas[6] = new Camiseta(7, "Informal", 29.99, "Nike", "L", "Blanco", "Corta", "Corto");
        vestimentas[7] = new Camiseta(8, "Polo", 24.99, "Hollister", "M", "Rojo", "Larga", "Francés");
        vestimentas[8] = new Sombrero(9, "Gorra", 24.99, "New Era", "7 1/4", "Negro", "Plana", "Medio");

        //Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
        for(Vestimenta datos : vestimentas){
            datos.mostrar();
        }
    }
}
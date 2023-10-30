public class Camiseta extends Vestimenta{
    //Atributos
    private String manga;
    private String cuello;

    //Constructores
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public void mostrar(){
        System.out.println("Esta camiseta tiene la manga: " + manga);
    }
}

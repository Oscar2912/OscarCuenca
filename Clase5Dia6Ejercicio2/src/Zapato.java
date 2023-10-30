public class Zapato extends Vestimenta{
    //Atributos
    private String material;
    private String tipoCierre;

    //Constructores
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public void mostrar(){
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }
}

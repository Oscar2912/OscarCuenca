public class Pantalon extends Vestimenta{
    //Atributos
    private String estilo;
    private String tipoTejido;

    //Constructores
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void mostrar(){
        System.out.println("Este pantalón es del estilo: " + estilo);
    }
}

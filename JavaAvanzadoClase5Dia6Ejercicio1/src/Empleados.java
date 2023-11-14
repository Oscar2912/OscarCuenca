public class Empleados {
    private String nombre;
    private double salario;
    private String categoria;

    public Empleados(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public double getSalario() {
        return salario;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}

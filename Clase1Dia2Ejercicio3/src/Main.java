public class Main {
    public static void main(String[] args) {
        //Se declaran las variables y se les asignan sus valores correspondientes
        double base = 4.8;
        double altura = 6.5;

        //Se declara la variable en la que se va a calcular el resultado de la operación y se especifica que el resultado debe contener decimales
        double area = (double) (base * altura) / 2;

        //Se muestra el resultado de la operación
        System.out.println("El área del triángulo con base de " + base + " cm y altura de " + altura + " cm es " + area);
    }
}
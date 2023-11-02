import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>(10);

        System.out.println("**** BIENVENIDO AL SISTEMA DE CONTROL DE STOCK ****");

        //Crear 10 objetos de tipo Producto con sus correspondientes valores cargados
        Producto producto1 = new Producto(1, "iPhone SE", "Apple", "SmartPhone", 289.36, 499.99, 200);
        Producto producto2 = new Producto(2, "Galaxy S13", "Samsung", "SmartPhone", 480.92, 549.99, 100);
        Producto producto3 = new Producto(3, "LG 214ST42", "LG", "Smart TV", 823.58, 1299.99, 500);
        Producto producto4 = new Producto(4, "MateBook B3", "Huawei", "Portátil", 284.65, 499.99, 360);
        Producto producto5 = new Producto(5, "iPhone 15", "Apple", "SmartPhone", 754.36, 999.99, 200);
        Producto producto6 = new Producto(6, "Core i9 4200K", "Intel", "Procesador", 628.36, 749.99, 200);
        Producto producto7 = new Producto(7, "a7III", "Sony", "Cámara", 1318.67, 1799.99, 450);
        Producto producto8 = new Producto(8, "iPhone 14", "Apple", "SmartPhone", 754.36, 999.99, 250);
        Producto producto9 = new Producto(9, "Watch SE", "Apple", "Smart Watch", 229.80, 499.99, 690);
        Producto producto10 = new Producto(10, "iPhone 17", "Apple", "SmartPhone", 1153.94, 1999.99, 400);

        System.out.println("**** SE HAN CREADO LOS ARTÍCULOS DISPONIBLES EN EL ALMACÉN ****");

        //Guardar estos objetos creados en un ArrayList
        productos.add(0, producto1);
        productos.add(1, producto2);
        productos.add(2, producto3);
        productos.add(3, producto4);
        productos.add(4, producto5);
        productos.add(5, producto6);
        productos.add(6, producto7);
        productos.add(7, producto8);
        productos.add(8, producto9);
        productos.add(9, producto10);

        System.out.println("**** SE HAN ALMACENADO LOS PRODUCTOS EN UNA LISTA ****");

        System.out.println("**** LISTA DE LOS ARTÍCULOS DISPONIBLES ****");
        for(Producto productosDisponibles : productos){
            System.out.println(productosDisponibles.toString());
        }

        System.out.println("**** CALCULANDO EL PRODUCTO MÁS CARO ****");

        //Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        double precioMasCaro = 0.0;
        Producto productoMasCaro = null;
        for(Producto masCaro : productos){
            if(masCaro.getPrecioVenta() > precioMasCaro)
                productoMasCaro = masCaro;
        }
        System.out.println("**** El producto más caro es " + productoMasCaro.getNombre() + " con un precio de " + productoMasCaro.getPrecioVenta() + " ****");

        System.out.println("**** CALCULANDO EL PRODUCTO CON MENOR PRECIO DE COSTO ****");

        //Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        double precioMasBarato = 0.0;
        Producto productoMasBarato = producto1;
        for(Producto masBarato : productos){
            if(masBarato.getPrecioVenta() <= precioMasBarato)
                productoMasBarato = masBarato;
        }
        System.out.println("**** El producto con menor precio de costo es " + productoMasBarato.getNombre() + " con un precio de " + productoMasBarato.getPrecioCosto() + " ****");

        System.out.println("**** BORRANDO EL PRODUCTO DE LA POSICIÓN 5 ****");

        //Borrar el producto que se encuentre en la posición 5 del ArrayList.
        productos.remove(5);

        System.out.println("**** LISTA DE LOS ARTÍCULOS DISPONIBLES TRAS EL BORRADO****");
        for(Producto productosDisponibles : productos){
            System.out.println(productosDisponibles.toString());
        }

        System.out.println("**** CALCULANDO EL PRODUCTO CON MAYOR STOCK ****");

        //Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
        int mayorStock = 0;
        int stockActual;
        Producto productoMayorStock = producto1;
        for(Producto masStock : productos){
            if(masStock.getCantidadStock() > mayorStock){
                mayorStock = masStock.getCantidadStock();
                productoMayorStock = masStock;
            }
        }
        System.out.println("**** El producto con más stock es " + productoMayorStock.getNombre() + " con un stock de " + productoMayorStock.getCantidadStock() + " ****");

        System.out.println("**** DESCONTANDO 3 AL STOCK TOTAL DEL PRODUCTO ****");

        stockActual = productoMayorStock.getCantidadStock();
        productoMayorStock.setCantidadStock(stockActual - 3);
        System.out.println("**** Ahora el producto " + productoMayorStock.getNombre() + " tiene un stock de " + productoMayorStock.getCantidadStock() + " ****");

        //Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.

    }
}
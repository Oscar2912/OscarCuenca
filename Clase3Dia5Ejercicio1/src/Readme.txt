********************************Archivo de pruebas****************************
Revisado por Alicia Martínez

La primera prueba consistirá en comprobar el funcionamiento de los métodos get:

Imprimuiendo por pantalla los valores de la posición 0 con los método getter:

CÓDIGO:
System.out.println("Id: " + verduras[0].getId() + " Nombre: " + verduras[0].getNombre() +
                            " Color: " + verduras[0].getColor() + " Calorias: " + verduras[0].getCalorias() +
                            " ¿Debe cocinarse? " + verduras[0].getDebeCocinarse());

RESULTADO:

***** PRUEBA GETTER ******
Id: 1 Nombre: Lechuga Color: Verde Calorias: 10 ¿Debe cocinarse? No

CONCLUSIÓN:
Los métodos getter funcionan correctamente y devuelven el resultado esperado.

Cotinuamos con la prueba de los setters, utilizando la prueba anterior para comprobarlo
Cambiamos la verdura[0] probando todos los setters y imprimimos con la prueba anterior

CODIGO:

System.out.println("\n***** PRUEBA SETTER ******");

        verduras[0].setId(34);
        verduras[0].setNombre("Calabazin");
        verduras[0].setCalorias(45);
        verduras[0].setColor("Verde");
        verduras[0].setDebeCocinarse("Si");

        System.out.println("Id: " + verduras[0].getId() + " Nombre: " + verduras[0].getNombre() +
                " Color: " + verduras[0].getColor() + " Calorias: " + verduras[0].getCalorias() +
                " ¿Debe cocinarse? " + verduras[0].getDebeCocinarse());

RESULTADO:

***** PRUEBA GETTER ******
Id: 1 Nombre: Lechuga Color: Verde Calorias: 10 ¿Debe cocinarse? No

***** PRUEBA SETTER ******
Id: 34 Nombre: Calabazin Color: Verde Calorias: 45 ¿Debe cocinarse? Si

CONCLUSION:
Al imprimir el resultado anterior y despues el cambiado se puede comprobar que funciona de manera correcta


***********************************************************************************


import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Establecemos conexión con la BD
        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection connection = DriverManager.getConnection(url, "root" , "");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Estudiante estudiante = new Estudiante();

        double nota = 0.0;
        boolean seguir = true;

        //Creamos los estudiantes
        while (seguir){
            System.out.println("Introduzca el Id del alumno:");
            estudiante.setId(sc.nextInt());
            System.out.println("Introduzca el nombre del alumno:");
            estudiante.setNombre(sc.next());
            System.out.println("Introduzca la edad del alumno:");
            estudiante.setEdad(sc.nextInt());
            System.out.println("Introduzca la calificación del alumno:");
            nota = sc.nextDouble();
            while (nota < 0 || nota > 10){
                System.out.println("Nota errónea! Introdúcela de nuevo:");
                nota = sc.nextDouble();
            }
            estudiante.setCalificacion(nota);

            //Insertamos registros de la BD
            String insertSql = "INSERT INTO estudiantes VALUES (?, ?, ?, ?)";

            //Declaramos Statement para ejecutar sentencias
            PreparedStatement statement = connection.prepareStatement(insertSql);

            //Seteamos parámetros
            statement.setInt(1, estudiante.getId());
            statement.setString(2, estudiante.getNombre());
            statement.setInt(3, estudiante.getEdad());
            statement.setDouble(4, estudiante.getCalificacion());
            //Ejecutamos sentencia
            statement.execute();

            System.out.println("¿Desea introducir datos de más alumnos? (1: Sí)");
            if (sc.nextInt() != 1)
                seguir = false;
        }

        System.out.println("Se agregaron los datos a la BD");

        //Mostramos los datos ingresados
        String selectSql = "SELECT * FROM estudiantes";
        Statement statement1 = connection.createStatement();
        ResultSet rs = statement1.executeQuery(selectSql);
        while (rs.next()){
            System.out.println("**** Datos de los alumnos ****");
            System.out.println("Id: " + rs.getInt("id"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Edad: " + rs.getInt("edad"));
            System.out.println("Calificación: " + rs.getDouble("calificación"));
        }
    }
}
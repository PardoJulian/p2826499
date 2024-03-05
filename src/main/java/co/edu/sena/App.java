package co.edu.sena;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
    {


    Scanner src = new Scanner(System.in);
    double numero1 = 0;
    double numero2 = 0;
    double numero3 = 0; 
    double numero4 = 0;
    double numero5 = 1;
    Data data = new Data();

        System.out.println( "Miscelanánea de Ejercicios OOP Java");
        System.out.println("------------------------------------");
        System.out.println("Menú principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");
        // submenu operadores
        System.out.println("Categoria operadores");
        System.out.println("1. Calcular área triángulo");
        System.out.println("2. Sumar dos números");

        System.out.println("-------------------------------------");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base:");
        numero1 = src.nextDouble();
        System.out.println("Ingrese la altura:");
        numero2 = src.nextDouble(); 
        System.out.println("El área del triángulo es: " + data.areaTriangulo(numero1, numero2));

        System.out.println("--------------------------------------");
        System.out.println("2. Ingresar dos números y sumarlos");
        System.out.println("Ingrese un número:");
        numero3 = src.nextDouble();
        System.out.println("Ingrese otro número:");
        numero4 = src.nextDouble(); 
        System.out.println("La suma de estos dos números es: " + data.sumaNumeros(numero3, numero4));

        System.out.println("--------------------------------------");
        System.out.println("3. Ingresar un número y elevarlo al cuadrado");
        System.out.println("Ingrese un número:");
        numero3 = src.nextDouble();
        System.out.println("Este número elevado al cuadrado es: " + data.numeroElevado(numero5));
        numero5 = src.nextDouble();
    }
}
}

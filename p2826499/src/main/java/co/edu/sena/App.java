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
    double numero5 = 0;
    double numero6 = 0;
    double numero7 = 0;
    double numero8 = 0;
    double numero9 = 0;
    double numero10 = 0;
    double numero11 = 0;
    double numero12 = 0;
    double numero13 = 0;
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
        numero5 = src.nextDouble();
        System.out.println("Este número elevado al cuadrado es: " + data.numeroElevado(numero5));

        System.out.println("--------------------------------------");
        System.out.println("4. Escribir un algoritmo que convierta de euro a dolares");
        System.out.println("Ingrese un valor en euros:");
        numero6 = src.nextDouble();
        System.out.println("Este valor en Euros es: " + data.EuroDolar(numero6));

        System.out.println("--------------------------------------");
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del area y del perimetro");
        System.out.println("Ingrese la medida del lado del cuadrado:");
        numero7 = src.nextDouble();
        System.out.println("El area de este cuadrado es: " + data.AreaCuadrado(numero7));
        System.out.println("El perimetro de este cuadrado es: " + data.PerimetroCuadrado(numero7));

        System.out.println("--------------------------------------");
        System.out.println("6. Escribir un algoritmo que determine el area y volumen de un cilindro ");
        System.out.println("Ingrese la medida del radio del cilindro:");
        numero8 = src.nextDouble();
        System.out.println("Ingrese la medida de la altura del cilindro:");
        numero9 = src.nextDouble();
        System.out.println("El area de este cilindro es: " + data.AreaCilindro(numero8));
        System.out.println("El volumen de este cilindro es: " + data.VolumenCilindro(numero8, numero9));

        System.out.println("--------------------------------------");
        System.out.println("7. Escribir un algoritmo que lea el radio y escriba la longitud y el area de una circunferencia ");
        System.out.println("Ingrese la medida del radio de la circunferencia:");
        numero10 = src.nextDouble();
        System.out.println("La longitud de esta circunferencia es: " + data.LongitudCircunferencia(numero10));
        System.out.println("El area de este cilindro es: " + data.AreaCircunferencia(numero10));

        System.out.println("--------------------------------------");
        System.out.println("8. Calcular el promedio de tres (3) numeros ingresados por teclado ");
        System.out.println("Ingrese un primer valor:");
        numero11 = src.nextDouble();
        System.out.println("Ingrese un segundo valor:");
        numero12 = src.nextDouble();
        System.out.println("Ingrese un tercer valor:");
        numero13 = src.nextDouble();
        System.out.println("El promedio de estos numeros es: " + data.PromedioNumeros(numero11, numero12, numero13));
    }       
}
}

package miscelanea6;

import java.util.Scanner;

public class Miscelanea6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la posición del número de fibonacci a calcular");
        //se lee la posición del número de fibonacci a calcular
        int n = scanner.nextInt();
        int fibonacci = 0;
        int a = 0;
        int b = 0;
        //se verifica si el número a calcular es diferente de los dos primeros, según el ejercicio planteado, 
        //ya que para calcular un número fibonacci se necesita de los dos anteriores
        if (n == 1){
            //si se pide el primer número fibonacci se establece que es 1, según el ejercicio planteado
            fibonacci = 1;
        }else if (n == 2){
            //si se pide el segundo número fibonacci se establece que es 2, según el ejercicio planteado
            fibonacci = 2;
        }else{
            a = 1;
            b = 2;
            //para hallar números fibonacci mayores el segundo se emplea el ciclo for, iniciando i en 3 hasta
            //el número a calcular
            for (int i = 3; i <= n; i++){
                //se suman los dos números fibonacci anteriores para calcular el nuevo,
                //siendo a = el número fibonacci dos posiccion antes, 
                //b = el número fibonacci una posiccion antes 
                //fibonacci = el número fibonacci calculado
                fibonacci = a + b;
                //se asigna el valor de b en a y de fibonacci en b para calcular el próximo número fibonacci
                a = b;
                b = fibonacci;
            }
        }
        System.out.println("El "+n+ " número fibonacci es : "+fibonacci);
    }
    
}

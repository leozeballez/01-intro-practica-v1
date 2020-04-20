package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void buscarMayores() {
        System.out.println("Ingrese el número de referencia:");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        List<Integer> lista = new ArrayList<>(10);

        for(int i=0; i<10; i++){
            System.out.println("Ingrese un número:");
            int numeroIngresado = lector.nextInt();
            if(numeroIngresado > numero){
                lista.add(numeroIngresado);
                System.out.println("Número guardado en lista.");
            }
            else {
                System.out.println("El número no ha sido guardado.");
            }
        }
        System.out.println("Números mayores al de referencia:");
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        buscarMayores();
    }
}

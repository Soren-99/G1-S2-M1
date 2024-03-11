package Esercizio1;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) +1;
        }

        System.out.print("Array originale: ");
        stampaArray(array);

        while (true){
            System.out.print("/nInserisci un numero (0 per terminare): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Arrivederci");
                break;
            }

            System.out.println("Inserisci la posizione (0-4): ");
            int posizione = scanner.nextInt();

            try {
                if(posizione < 0 || posizione >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Posizione non valida");
                }
                array[posizione] = numero;

                System.out.print("Nuovo stato dell'array: ");
                stampaArray(array);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Errore " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static void stampaArray(int[] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}

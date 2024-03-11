package Esercizio0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numero = 0;
        try {
            numero = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Errore: inserire un numero valido.");
            return;
        }

        int risultato = calcolaQuadrato(numero);
        System.out.println("Il quadrato di " + numero + " è: " + risultato);
    }

    public static int calcolaQuadrato (int numero) {
        try{
            if (numero < 0) {
                throw new IllegalAccessException("Numero negativo non consentito.");
            }
            return numero * numero;
        } catch (IllegalAccessException e) {
            System.out.println("Errore: " + e.getMessage());
            return -1;
        }
    }
}

package Esercizio2;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi: ");
            double kmPercorsi = input.nextDouble();

            System.out.println("Inserisci il numero di carburanti consumati");
            double litriConsumati = input.nextDouble();

            if (litriConsumati == 0) {
                throw new ArithmeticException("Impossibile dividere un numero per 0");
            }
            double kmPerLitro = kmPercorsi/litriConsumati;
            System.out.println("Il numero di km/litro percorsi é: " + kmPerLitro);
        }catch (ArithmeticException e){
            System.err.println("Errore: " + e.getMessage());
        }catch (Exception e){
            System.err.println("Si è verificat un errore. Assicurati di inserire valori validi.");
        }finally {
            input.close();
        }
    }
}

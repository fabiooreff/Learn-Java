package com.company;

import java.util.Scanner;

public class PracticarBucle {
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        int numero;

        System.out.println("A continuacio introdueix una frase :");
        String cadena = ent.nextLine();

        do {
            System.out.println("Ara, introdueix un numero enter, mes gran que 10 :");
            numero = ent.nextInt();
            if (numero <=10) System.out.println("¡Mes gran que 10!");
            else break;
        }while (true);

        for (int i=0; i < numero; i++) {
                System.out.println(cadena);
            }
    }
}

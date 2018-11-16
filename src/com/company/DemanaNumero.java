package com.company;

import java.util.Scanner;

public class DemanaNumero {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        System.out.println("Escriu un text");
        String Frase1 = ent.nextLine();

        for (int i = 0; i < 100; i++) {
            System.out.println(Frase1);
        }

        System.out.println("Escriu la teva edat");
        int edat = ent.nextInt();

        if (edat>=18){
            System.out.println("Ets major d'edat");
        }else{
            System.out.println("No ets major d'edat");
        }
    }
}

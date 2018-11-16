// Author --> Fabio Orefice Amez
package com.company;
import java.util.Scanner;


public class Exercici2 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        int opcio;

            System.out.println("Tria una opcio!");
            System.out.println("1. Solucio en for");
            System.out.println("2. Solucio en while");
            System.out.println("3. Solucio en do_while");
            opcio = ent.nextInt();



        switch (opcio){
            case 1:
                System.out.println("Has seleccionat la solucio en for :");

                for (int i = -50; i < 51; i++){

                    if (i%2==0){
                        System.out.println("El numero "+i+" es par");
                    }else {
                        System.out.println("El numero "+i+" es impar");
                    }
                }
                break;
            case 2:
                System.out.println("Has seleccionat la opcio en while :");
                int numero1 = -51;

                while (numero1<=49){
                    numero1++;
                    if (numero1%2==0){
                        System.out.println("El numero "+numero1+" es par");
                    }else {
                        System.out.println("El numero "+numero1+" es impar");
                    }
                }
                break;
            case 3:
                System.out.println("Has seleccionat la opcio en do_while :");
                int numero2 = -51;

                do {
                    numero2++;
                    if (numero2%2==0){
                        System.out.println("El numero "+numero2+" es par");
                    }else {
                        System.out.println("El numero "+numero2+" es impar");
                    }
                }while (numero2<=49);

                break;
                default:
                    System.out.println("¡Nomes les opcions del menu!");

        }


    }
}

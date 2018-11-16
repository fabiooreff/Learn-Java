package com.company;
import java.util.Scanner;


public class SwitchMenu {
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        System.out.println("Tria una opcio del menu ( Nomes el numero ): " +
                "Opcio 1 " +
                "Opcio 2 " +
                "Opcio 3 " +
                "Opcio 4 " +
                "Opcio 5 ");

        int OpcioMenu = ent.nextInt();

        if (OpcioMenu == 1 ){
            System.out.println("Introdueix el valor de l'opcio 1:");
            String Missatge1 = ent.next();
        }else if (OpcioMenu == 2){
            System.out.println("Introdueix el valor de l'opcio 2:");
            String Missatge2 = ent.next();
        }else if (OpcioMenu == 3){
            System.out.println("Introdueix el valor de l'opcio 3:");
            String Missatge3 = ent.next();
        }else if (OpcioMenu == 4){
            System.out.println("Introdueix el valor de l'opcio 4:");
            String Missatge4 = ent.next();
        }else if (OpcioMenu == 5){
            System.out.println("Introdueix el valor de l'opcio 5:");
            String Missatge5 = ent.next();
        }else {
            System.out.println("No has seleccionat cap valor correcte.");
        }


        System.out.println("Tria una opcio del menu ( Nomes el numero ): " +
                "Opcio 1 " +
                "Opcio 2 " +
                "Opcio 3 " +
                "Opcio 4 " +
                "Opcio 5 ");



        switch (OpcioMenu){
            case 1:
                System.out.println("Introdueix el valor de l'opcio 1:");
                String Missatge1 = ent.next();
                break;
            case 2:
                System.out.println("Introdueix el valor de l'opcio 2:");
                String Missatge2 = ent.next();
                break;
            case 3:
                System.out.println("Introdueix el valor de l'opcio 3:");
                String Missatge3 = ent.next();
                break;
            case 4:
                System.out.println("Introdueix el valor de l'opcio 4:");
                String Missatge4 = ent.next();
                break;
            case 5:
                System.out.println("Introdueix el valor de l'opcio 5:");
                String Missatge5 = ent.next();
                break;
                default:
                    System.out.println("No has introduit cap valor correcte.");

        }


    }
}

package com.company;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args){


        Scanner ent = new Scanner(System.in);

        for (int i=0; i<args.length; i++){
            String arg = args[i];
        }

        int i = 0;
        while (i <args.length){
            String arg = args[i];
            i++;

            System.out.println(arg);
        }
        int j = 0;

        do {
            System.out.println("Has entrat al do_while");
            j=j+1;
        }while (j < args.length);
    }
}

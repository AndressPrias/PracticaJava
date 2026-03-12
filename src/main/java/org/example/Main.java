package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opc = -1;
        int num = 0;
        while (opc != 2){

            System.out.println("ingresa un numero? ");
            num = input.nextInt();

            List<String> list = new ArrayList<String>();
            for (int i = 1; i <= num; i++){
                list.add(input.next());
            }

            }


            System.out.println("Desea continuar? (1=Si/2=No) ");
            opc = input.nextInt();

        }
    }
}
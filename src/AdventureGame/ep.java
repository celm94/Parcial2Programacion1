package AdventureGame;


import java.util.Scanner;

public class ep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean opciones = false, eleccion = false;

        while(opciones == false){
            System.out.println("Welcome to Adventure Game");
            System.out.println("1. Start");
            System.out.println("2. Exit");
            int op=0;
            op = scn.nextInt();

            switch(op){
                case 1:
                    System.out.println("You are the Hero. Choose your coordinates to Advance within the field");
                    int xh;
                    System.out.println("Choose coordinates from 1 to 10");
                    System.out.println("Denote coordinate X: ");

                    xh = scn.nextInt();
                    int yh;
                    System.out.println("Denote coordinate Y:");

            }

            while(eleccion == false){
                eleccion = true;
            }
            opciones= true;

        }






    }
}

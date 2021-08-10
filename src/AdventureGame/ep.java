package AdventureGame;


import java.util.Scanner;

public class ep {

    public static void main(String[] args) {

        Torre torre1 = new Torre();
        torre1.setX(1);
        torre1.setY(2);

        Muro muro1 = new Muro();
        muro1.setX(1);
        muro1.setY(10);

        Arbol arbol = new Arbol();
        arbol.setX(2);
        arbol.setY(9);

        Alimento alimento = new Alimento();
        alimento.setX(8);
        alimento.setY(6);

        Arma arma = new Arma();
        arma.setX(4);
        arma.setY(8);

        Proyectil proyectil = new Proyectil();
        proyectil.setX(2);
        proyectil.setY(2);

        Enemigo dragon = new Enemigo();
        dragon.setNombre("Dragón Azúl");
        dragon.setCapacidad(3);
        dragon.setEnergia(5);
        dragon.setVidas(1);
        dragon.setX(6);
        dragon.setY(2);


        Heroe jacob = new Heroe();
        jacob.setNombre("Jacob");
        jacob.setEnergia(5);
        jacob.setCapacidad(20);
        jacob.setVidas(5);
        System.out.println("Ingrese coordenada X para Héroe:");
        System.out.println("Escoja un número del 1 al 10");
        int xh;
        Scanner xheroe = new Scanner(System.in);
        xh = xheroe.nextInt();
        jacob.setX(xh);
        System.out.println("Ingrese coordenada Y para Héroe:");
        int yh;
        Scanner yheroe = new Scanner(System.in);
        yh = yheroe.nextInt();
        jacob.setY(yh);

        if (jacob.getX() == dragon.getX() && jacob.getY() == dragon.getY()){
            System.out.println("Te has cruzado con Dragón Azúl");
        }

        else if (jacob.getX() == arma.getX() && jacob.getY() == arma.getY()){
            System.out.println("Encontraste un arma");
        }

        else if (jacob.getX() == arbol.getX() && jacob.getY() == arbol.getY()){
            System.out.println("Escala el árbol y espera 2 turnos para continuar");
        }

        else if (jacob.getX() == proyectil.getX() && jacob.getY() == proyectil.getY()){
            System.out.println("Guarda el proyectil, te servirá luego");
        }

        else if (jacob.getX() == alimento.getX() && jacob.getY() == alimento.getY()){
            System.out.println("Come 5 bayas azules para incrementar tu nivel de energía");
        }
        else if (jacob.getX() == arma.getX() && jacob.getY() == arma.getY()){
            System.out.println("Guarda el arma en tu mochila");
        }
        else{
            System.out.println("Llegaste a la casilla " + jacob.getX() +","+jacob.getY() );

        }









    }
}

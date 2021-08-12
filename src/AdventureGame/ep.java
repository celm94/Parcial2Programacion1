package AdventureGame;


import java.util.Scanner;

public class ep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean opciones = false, eleccion = false;

        int portalSalidaX= 9, portalSalidaY = 4;






        //Definición de objetos valores para coordenadas dentro del juego
        //INMUEBLES:
        Muro muro1 = new Muro(); muro1.setX(2); muro1.setY(4);
        Muro muro2 = new Muro(); muro2.setX(6); muro2.setY(8);

        Torre torre1 = new Torre(); torre1.setX(1); torre1.setY(3);
        Torre torre2 = new Torre(); torre2.setX(3); torre2.setY(1);

        Arbol arbol1 = new Arbol(); arbol1.setX(9); arbol1.setY(1);
        Arbol arbol2 = new Arbol(); arbol2.setX(8); arbol2.setY(2);
        //MUEBLES:
        Alimento filete1 = new Alimento(); filete1.setX(5); filete1.setY(5);
        Alimento filete2 = new Alimento(); filete2.setX(6); filete2.setY(6);

        Proyectil balas1 = new Proyectil(); balas1.setX(8); balas1.setY(2);
        Proyectil balas2 = new Proyectil(); balas2.setX(2); balas2.setY(9);

        Arma pistola1 = new Arma(); pistola1.setX(1); pistola1.setY(2);
        Arma pistola2 = new Arma(); pistola2.setX(10); pistola2.setY(10);
        //ENEMIGOS:
        Enemigo e1 = new Enemigo(); e1.setX(10); e1.setY(4); e1.setNivelEnergia(1); e1.setVidas(2); e1.setCapacidadAtaque(10);
        Enemigo e2 = new Enemigo(); e2.setX(10); e2.setY(10); e2.setNivelEnergia(1); e2.setNivelEnergia(10); e2.setVidas(2); e2.setCapacidadAtaque(10);
        //HÉROE:
        Heroe heroe = new Heroe();

        heroe.setNivelEnergia(8); heroe.setVidas(2); heroe.setCapacidadAtaque(10);




        //MÉTODOS








        while(opciones == false){
            System.out.println("WELCOME TO ADVENTURE GAME");
            System.out.println("try not to die before escaping through the hatch");
            System.out.println("1. Start");
            System.out.println("2. Exit");
            int op=0;
            op = scn.nextInt();

            switch(op){
                case 1:
                    while(eleccion == false){
                        System.out.println("Welcome, Hector. Are you a hero? Choose your coordinates to Advance within the field");


                        heroe.Status();
                        System.out.println("Choose coordinates from 1 to 10 ");
                        System.out.println("Denote coordinate X: ");
                        int xh;
                        xh = scn.nextInt();
                        System.out.println("Denote coordinate Y:");
                        int yh;
                        yh = scn.nextInt();
                        heroe.setX(xh); heroe.setY(yh);
                        
                        System.out.println("");

                        if((heroe.getX() == muro1.getX() && heroe.getY() == muro1.getY()) || heroe.getX()== muro2.getX() && heroe.getY()== muro2.getY()){
                            System.out.println("You must climb the wall to continue. ENERGY: -2");
                            heroe.EscalarMuro();
                            heroe.Status();

                        }




                        eleccion = true;


                    }





            }


            opciones= true;

        }






    }
}

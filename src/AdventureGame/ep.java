package AdventureGame;


import jdk.jshell.Snippet;

import java.util.Scanner;
import java.util.ArrayList;

public class ep {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean opciones = false, eleccion = false;

        int portalSalidaX= 2, portalSalidaY = 5;
        int cont = 0;






        //Definición de objetos valores para coordenadas dentro del juego
        //INMUEBLES:
        Muro muro1 = new Muro(); muro1.setX(5); muro1.setY(4);
        Muro muro2 = new Muro(); muro2.setX(4); muro2.setY(5);

        Torre torre1 = new Torre(); torre1.setX(1); torre1.setY(3);
        Torre torre2 = new Torre(); torre2.setX(3); torre2.setY(1);

        Arbol arbol1 = new Arbol(); arbol1.setX(2); arbol1.setY(4);
        Arbol arbol2 = new Arbol(); arbol2.setX(4); arbol2.setY(3);
        //MUEBLES:
        Alimento filete1 = new Alimento(); filete1.setX(5); filete1.setY(5);
        Alimento filete2 = new Alimento(); filete2.setX(1); filete2.setY(2);

        Proyectil balas1 = new Proyectil(); balas1.setX(2); balas1.setY(1);
        Proyectil balas2 = new Proyectil(); balas2.setX(3); balas2.setY(2);

        Arma pistola1 = new Arma(); pistola1.setX(1); pistola1.setY(2);
        Arma pistola2 = new Arma(); pistola2.setX(5); pistola2.setY(3);
        //ENEMIGOS:
        Enemigo e1 = new Enemigo(); e1.setX(3); e1.setY(3); e1.setNivelEnergia(1); e1.setVidas(1); e1.setCapacidadAtaque(12);
        Enemigo e2 = new Enemigo(); e2.setX(4); e2.setY(1); e2.setNivelEnergia(1); e2.setNivelEnergia(10); e2.setVidas(1); e2.setCapacidadAtaque(12);
        //HÉROE:
        Heroe heroe = new Heroe();

        heroe.setNivelEnergia(8); heroe.setVidas(1); heroe.setCapacidadAtaque(10);

        ArrayList<Mueble> bag = new ArrayList<Mueble>();







        while(opciones == false){
            System.out.println("WELCOME TO ADVENTURE GAME");
            System.out.println("try not to die before escaping through the hatch");
            System.out.println("1. Start");
            System.out.println("2. Exit");
            int op=0;
            op = scn.nextInt();

            switch(op){
                case 1:

                        System.out.println("Welcome, Hector. Are you a hero? Choose your coordinates to Advance within the field");
                    while(eleccion == false){

                        heroe.Status();

                        System.out.println("Choose coordinates only between 1 to 5");
                        System.out.println("Denote coordinate X: ");
                        int xh;
                        xh = scn.nextInt();
                        System.out.println("Denote coordinate Y:");
                        int yh;
                        yh = scn.nextInt();
                        heroe.setX(xh); heroe.setY(yh);
                        
                        System.out.println("");
                        if(heroe.getX() == portalSalidaX && heroe.getY() == portalSalidaY){
                            System.out.println("");
                            System.out.println("Hurry up! is time to escape through the hatch. ");
                            System.out.println("Congratulations, you advanced to the next level !!");
                            System.out.println("\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6"+"\uD83C\uDFC6");
                            eleccion = true;
                        }
                        else if((heroe.getX() == muro1.getX() && heroe.getY() == muro1.getY()) || heroe.getX()== muro2.getX() && heroe.getY()== muro2.getY()){
                            System.out.println("");
                            System.out.println("You must climb the wall to continue. ENERGY: -2");
                            heroe.EscalarMuro();
                            heroe.Status();
                            System.out.println("Try again to advance... ");
                            eleccion = false;
                        }
                        else if((heroe.getX() == torre1.getX() && heroe.getY() == torre1.getY()) || heroe.getX() == torre2.getX() && heroe.getY() == torre2.getY()){
                            System.out.println("");
                            System.out.println("You found a Tower. Climb to the top to observe the position of your enemies and threats... Ability to Attack: +5");
                            heroe.EscalarTorre();
                            heroe.Status();
                            System.out.println("Try again to advance...");
                            eleccion = false;

                        }
                        else if((heroe.getX() == arbol1.getX() && heroe.getY() == arbol1.getY()) || heroe.getX() == arbol2.getX() && heroe.getY() == arbol2.getY()) {




                            System.out.println("you were lucky to evade a sentry attack by climbing the tree. Unfortunately he hit you on the arm. Rest for a moment on the top of the tree to regain energy.");
                            System.out.println("Energy: +2");
                            System.out.println("Hability to Attack: -3");
                            heroe.Arbol();
                            heroe.Status();
                            System.out.println("Try again to advance...");
                            eleccion = false;
                                }
                        else if((heroe.getX() == pistola1.getX() && heroe.getY() == pistola1.getY()) || heroe.getX() == pistola2.getX() && heroe.getY() == pistola2.getY()){

                            System.out.println("you found a gun. Save it if you can. You'll have to use it soon...");
                            Mueble weapon = new Arma();
                            heroe.Guardar(weapon);
                            heroe.Status();
                            System.out.println("Try again to advance...");
                            eleccion = false;

                        }
                        else if((heroe.getX() == filete1.getX() && heroe.getY() == filete1.getY()) || (heroe.getX() == filete2.getX() && heroe.getY() == filete2.getY())) {

                            System.out.println("You found a big piece of steak!...");
                            Mueble alimento = new Alimento();
                            heroe.Guardar(alimento);
                            heroe.Status();
                            System.out.println("Try again to advance...");
                            eleccion = false;


                        }
                        else if((heroe.getX() == balas1.getX() && heroe.getY() == balas1.getY()) ||  (balas2.getX() == filete2.getX() && heroe.getY() == balas2.getY())){


                            System.out.println("You found a new set of ammunitions...");
                                Mueble projectile = new Proyectil();
                                heroe.Guardar(projectile);
                                heroe.Status();
                                System.out.println("Try again to advance...");
                                eleccion = false;

                            }

                        else if( (heroe.getX() == e1.getX() && heroe.getY() == e1.getY()) ||  (heroe.getX() == e2.getX() && heroe.getY() == e2.getY())){
                                heroe.Enemy();
                                heroe.Status();
                            System.out.println("Try again to advance...");
                            eleccion = false;
                        }
                        else{
                            System.out.println("You moved to position ("+heroe.getX()+","+heroe.getY()+")");
                            eleccion = false;
                        }





                    }





            }


            opciones= true;

        }






    }
}

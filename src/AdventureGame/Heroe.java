package AdventureGame;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Heroe extends Personaje {



    private ArrayList<Mueble> mochila = new ArrayList<Mueble>();

    public Heroe() {

    }

    public void setMochila(ArrayList<Mueble> mochila) {
        this.mochila = mochila;
    }

    public List<Mueble> getMochila() {
        return mochila;
    }




//MÉTODOS PARA EL HÉROE
    public void Guardar(Mueble mueble){

        int tamaño = mochila.size();
        if(tamaño < 3){

            mochila.add(mueble);
            int i = getNivelEnergia();
            int j = getCapacidadAtaque();
            int mas = i + 4;
            int masj = j + 4;
            setCapacidadAtaque(masj);
            setNivelEnergia(mas);

        }
        else{
            System.out.println("Your bag is full");
        }
        //entry point:
        // Mueble gun = new Arma();
        //heroe.Guardar(gun);


    }

    public void EscalarMuro(){
        int i = getNivelEnergia();
        int menosenergia = i - 2;
        setNivelEnergia(menosenergia);
    }

    public void EscalarTorre(){
        int j =getCapacidadAtaque();
        int mascapacidad = j + 5;
        setCapacidadAtaque(mascapacidad);
    }

    public void Arbol(){
        int a = getNivelEnergia();
        int mase = a + 2;
        setNivelEnergia(mase);
        int b = getCapacidadAtaque();
        int menosa = b - 3;
        setCapacidadAtaque(menosa);

    }

    //public void Pistola(){
    //        int p = getCapacidadAtaque();
    //        int masc = p + 5;
    //        setCapacidadAtaque(masc);
    //    }


   // public void Filete(){
    //        System.out.println("Save that piece of Steak you just found for later ...");
    //        int c = getCapacidadAtaque();
    //        int mas = c + 5;
    //        int e = getNivelEnergia();
    //        int masen = e + 5;
    //        setCapacidadAtaque(mas);
    //        setNivelEnergia(masen);
    //        System.out.println("");
    //    }

    //public void Balas(){
    //        System.out.println("What a luck that you found an ammunition package... save it for later");
    //
    //        int b = getCapacidadAtaque();
    //        int masb = b + 3;
    //        int b2 = getNivelEnergia();
    //        int masb2 = b2 + 5;
    //        setCapacidadAtaque(masb);
    //        setNivelEnergia(masb2);
    //    }

    public void Enemy(){
        System.out.println("Good Heavens!... Thanos appeared from another dimension ... He's not even part of this franchise, what a crazy interdimensional deranged mother fu... attack him now!");
        int result = getCapacidadAtaque();
        if(result >= 10){
            System.out.println("You defeated him! Now, keep moving forward asap...");
            int x = result - 10;
            setCapacidadAtaque(x);


        }
        else{
            System.out.println("You lose...");


        }
    }

    public void Status(){
        System.out.println("");
        System.out.println("---------  CURRENT STATUS  ---------");

        int energia = getNivelEnergia();
        int vidas = getVidas();
        int bag = mochila.size();
        System.out.println("Name: Hector von Humboldt");
        System.out.println("Energy: " + energia);
        System.out.println("Lives: " + vidas);
        System.out.println("Ability to Attack: "+getCapacidadAtaque());
        System.out.println("objects in your bag: "+ bag);
        System.out.println("Current position: ("+getX()+","+getY()+")");
        System.out.println("");
    }








}

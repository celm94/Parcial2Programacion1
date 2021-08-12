package AdventureGame;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class Heroe extends Personaje {



    private List<Mueble> mochila;

    public Heroe() {

    }



    public List<Mueble> getMochila() {
        return mochila;
    }

    public void setMochila(List<Mueble> mochila) {
        this.mochila = mochila;
    }

    public Heroe(List<Mueble> mochila) {
        this.mochila = mochila;
    }
//MÉTODOS PARA EL HÉROE
    public void Guardar(Mueble mueble){
        mochila.add(mueble);
    }

    public void EscalarMuro(){
        int i = getNivelEnergia();
        int menosenergia = i - 2;
        setNivelEnergia(menosenergia);
    }

    public void Status(){
        System.out.println("");
        System.out.println("---------  CURRENT STATUS  ---------");

        int energia = getNivelEnergia();
        int vidas = getVidas();
        System.out.println("Name: Hector von Humboldt");
        System.out.println("Energy: " + energia);
        System.out.println("Lives: " + vidas);
        System.out.println("");
    }




}

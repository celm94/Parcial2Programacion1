package AdventureGame;

import java.util.List;

public class Heroe extends Personaje {



    private List<Mueble> mochila;




    public List<Mueble> getMochila() {
        return mochila;
    }

    public void setMochila(List<Mueble> mochila) {
        this.mochila = mochila;
    }

    public Heroe(List<Mueble> mochila) {
        this.mochila = mochila;
    }

    public void Guardar(Mueble mueble){
        mochila.add(mueble);
    }
}

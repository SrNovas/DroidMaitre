package factory.novas.droidmaitre.models;

import java.util.LinkedList;

/**
 * Created by Adrian on 6/12/16.
 */

public class Menu {

    // Un menú está compuesto por platos.
    private LinkedList<Plato> mPlatos;

    public Menu(LinkedList<Plato> platos) {
        mPlatos = platos;
    }

    // Getter.
    public LinkedList<Plato> getPlatos() {
        return mPlatos;
    }

    //Setter.
    public void setPlatos(LinkedList<Plato> platos) {
        mPlatos = platos;
    }

}

package factory.novas.droidmaitre.models;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Adrian on 6/12/16.
 */

public class Menu {

    // Un menú está compuesto por platos.
    // http://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist
    // http://www.softwero.com/2012/10/cuando-usar-linkedlist-sobre-arraylist.html
    private ArrayList<Plato> mPlatos;

    public Menu() { mPlatos = new ArrayList<Plato>(); }

    // Getter.
    public ArrayList<Plato> getPlatos() {
        return mPlatos;
    }

    //Setter.
    public void setPlatos(ArrayList<Plato> platos) {
        mPlatos = platos;
    }

}

package factory.novas.droidmaitre.models;

import java.util.LinkedList;

/**
 * Created by Adrian on 6/12/16.
 */

public class Comedor {

    private LinkedList<Mesa> mComedor;

    // Constructor
    public Comedor(LinkedList<Mesa> comedor) {
        mComedor = comedor;
    }

    // Guetter
    public LinkedList<Mesa> getComedor() {
        return mComedor;
    }

    //Setter
    public void setComedor(LinkedList<Mesa> comedor) {
        mComedor = comedor;
    }

}

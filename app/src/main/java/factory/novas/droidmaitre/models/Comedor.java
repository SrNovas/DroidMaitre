package factory.novas.droidmaitre.models;

import java.util.ArrayList;

/**
 * Created by Adrian on 6/12/16.
 */

public class Comedor {

    private ArrayList<Mesa> mComedor;

    // Constructor
    public Comedor() {
        mComedor = new ArrayList<Mesa>();
        mComedor.add(new Mesa("Mesa 1", 1, new Menu(), 0.00f));
    }

    // Guetter
    public ArrayList<Mesa> getComedor() {
        return mComedor;
    }

    //Setter
    public void setComedor(ArrayList<Mesa> comedor) {
        mComedor = comedor;
    }

}

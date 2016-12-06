package factory.novas.droidmaitre.models;

/**
 * Created by Adrian on 6/12/16.
 */

public class Mesa {

    private String mNombre;
    private int mComensales;
    private Menu mComanda;
    private Float mTotal;

    // Constructor
    public Mesa(String nombre, int comensales, Menu comanda, Float total) {
        mNombre = nombre;
        mComensales = comensales;
        mComanda = comanda;
        mTotal = total;
    }

    // Getters
    public String getNombre() {
        return mNombre;
    }

    public int getComensales() {
        return mComensales;
    }

    public Menu getComanda() {
        return mComanda;
    }

    public Float getTotal() {
        return mTotal;
    }

    // Setters
    public void setNombre(String nombre) {
        mNombre = nombre;
    }

    public void setComensales(int comensales) {
        mComensales = comensales;
    }

    public void setComanda(Menu comanda) {
        mComanda = comanda;
    }

    public void setTotal(Float total) {
        mTotal = total;
    }

}

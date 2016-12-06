package factory.novas.droidmaitre.models;

import java.util.Set;

/**
 * Created by Adrian on 6/12/16.
 */

public class Plato {

    private String mNombre;
    private String mDescripcion;
    private String mURL;
    private String mNotas;
    private Set<Alergenos> mAlergenos;
    private Float mPrecio;

    // Constructor
    public Plato(String nombre, String descripcion, String URL, String notas, Set<Alergenos> alergenos, Float precio) {
        mNombre = nombre;
        mDescripcion = descripcion;
        mURL = URL;
        mNotas = notas;
        mAlergenos = alergenos;
        mPrecio = precio;
    }

    // Guetters.
    public String getNombre() {
        return mNombre;
    }

    public String getDescripcion() {
        return mDescripcion;
    }

    public String getURL() {
        return mURL;
    }

    public String getNotas() {
        return mNotas;
    }

    public Set<Alergenos> getAlergenos() {
        return mAlergenos;
    }

    public Float getPrecio() {
        return mPrecio;
    }

    // Setters.
    public void setNombre(String nombre) {
        mNombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        mDescripcion = descripcion;
    }

    public void setURL(String URL) {
        mURL = URL;
    }

    public void setNotas(String notas) {
        mNotas = notas;
    }

    public void setAlergenos(Set<Alergenos> alergenos) {
        mAlergenos = alergenos;
    }

    public void setPrecio(Float precio) {
        mPrecio = precio;
    }

}

enum Alergenos { GLUTEN, CRUSTACEOS, HUEVOS, PESCADO, CACAHUETES, SOJA, LACTEOS, FRUTOS_DE_CASCARA,
                APIO, MOSTAZA, GRANOS_DE_SESAMO, SULFITOS, MOLUSCOS, ALTRAMUCES}
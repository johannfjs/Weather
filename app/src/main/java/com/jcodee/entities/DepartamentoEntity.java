package com.jcodee.entities;

import io.realm.RealmObject;

/**
 * Created by johannfjs on 16/12/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class DepartamentoEntity extends RealmObject {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

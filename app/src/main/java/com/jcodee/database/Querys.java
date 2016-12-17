package com.jcodee.database;

import com.jcodee.entities.DepartamentoEntity;

import io.realm.Case;
import io.realm.Realm;

/**
 * Created by johannfjs on 16/12/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class Querys {
    public boolean existeDepartamento(String departamento) {
        Realm realm = Realm.getDefaultInstance();
        return (realm.where(DepartamentoEntity.class).contains("nombre", departamento, Case.INSENSITIVE).count() > 0);
    }
}

package com.jcodee.aplicacion;

import android.app.Application;

import com.jcodee.entities.DepartamentoEntity;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by johannfjs on 16/12/16.
 * Email: johann.jara@jcodee.com
 * Phone: (+51) 990870011
 */

public class Configuracion extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(getApplicationContext());
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("weather.realm")
                .schemaVersion(1)
                .initialData(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        DepartamentoEntity departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Lima");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Piura");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("La Libertad");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Trujillo");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Ica");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Arequipa");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Tacna");
                        realm.copyToRealm(departamentoEntity);

                        departamentoEntity = new DepartamentoEntity();
                        departamentoEntity.setNombre("Loreto");
                        realm.copyToRealm(departamentoEntity);
                    }
                })
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}

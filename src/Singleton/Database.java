/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.ArrayList;

/**
 *
 * @author Arthur
 */
public class Database {

    private final ArrayList<String> dados;
    private static final Database database = new Database(new ArrayList<String>());

    private Database(ArrayList<String> dados) {
        this.dados = dados;
    }

    public static Database getInstance() {
        return database;
    }

    public ArrayList<String> getDados() {
        return dados;
    }

}

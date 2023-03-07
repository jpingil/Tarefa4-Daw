package db;


import model.Player;
import db.PadelManagerDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * creamos a clase PlayerDB
 * @author jpingil
 */
public class PlayerDB {

    /**
     * metodo co que encontramos un player a partir do id e da password
     * @param id id do player
     * @param password password do player
     * @return o player que coincide co id e ca password ou null se non
     * coincide
     */
    public static Player findByIdAndPassword(String id, String password) {

        for (Player player : PadelManagerDB.getPlayers().values()) {
            if (id.equals(player.getId()) && player.getPassword().
                    equals(password)) {
                return player;
            }
        }
        return null;
    }

}

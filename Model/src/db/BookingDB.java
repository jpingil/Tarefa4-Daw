package db;


import model.Booking;
import model.Player;
import db.PadelManagerDB;
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * creamos a clase BookingDB
 *
 * @author jpingil
 */
public class BookingDB {

    /**
     * metodo co que buscamos a partir dunha date
     *
     * @param date data que se busca
     * @return arraylist correspondete ao param
     */
    public static ArrayList<Booking> findByDate(Date date) {
        ArrayList<Booking> res = new ArrayList<>();
        for (Booking booking : PadelManagerDB.getBookings()) {
            if (booking.getDate().compareTo(date) == 0) {
                res.add(booking);
            }
        }
        return res;
    }

    /**
     * metodo co que buscamos a partir do id e da data
     * @param id id do player
     * @param data data de reserva
     * @return datas iguais ou posteriores de reserva do id
     */
    public static ArrayList<Booking> findByUserAndDate(String id, Date data) {
        ArrayList<Booking> res = new ArrayList<>();
        for (Player player : PadelManagerDB.getPlayers().values()) {
            if (player.getId().equals(id)) {
                for (Booking booking : PadelManagerDB.getBookings()) {
                    if (booking.getDate().compareTo(data) >= 0) {
                        res.add(booking);
                    }
                }
            }
        }
        return res;
    }

    /**
     * metodo para gardar unha reserva na lista
     * @param booking nova reserva
     */
    public static void save(Booking booking) {
        PadelManagerDB.getBookings().add(booking);
    }
}

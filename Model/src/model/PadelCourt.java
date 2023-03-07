package model;


import model.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * creamos a clase PadelCourt
 *
 * @author jpingil
 */
public class PadelCourt {

    private int number;

    private int type;
    private static final int SINGLE = 1;
    private static final int DOUBLE = 2;

    private String[] bookingHours;

    /**
     *
     * @return obtemos o valor do number
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number modificamos o valor do number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return obtemos o valor do type
     */
    public int getType() {
        return type;
    }

    /**
     *
     * @param type modificamos o valor do type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     *
     * @return obtemos o valor de bookingHours
     */
    public String[] getBookingHours() {
        return bookingHours;
    }

    /**
     *
     * @param bookingHours modificamos o valor de bookingHours
     */
    public void setBookingHours(String[] bookingHours) {
        this.bookingHours = bookingHours;
    }

    /**
     *
     * @param number numero da pista
     * @param type tipo de pista
     * @param bookingHours horas de reserva de pista
     */
    public PadelCourt(int number, int type, String[] bookingHours) {
        this.number = number;
        this.type = type;
        this.bookingHours = bookingHours;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[]{
            "9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[]{
            "9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[]{
            "9:00", "11:00"});
    }

}

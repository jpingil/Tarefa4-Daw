package model;


import model.PadelCourt;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * creamos a calse Booking
 *
 * @author jpingil
 */
public abstract class Booking {

    /**
     * data da reserva
     */
    protected Date date;

    /**
     * hora da reserva
     */
    protected String hour;

    /**
     * pista da reserva
     */
    protected PadelCourt court;

    /**
     *
     * @return obtemos a data de reserva
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date modificamos a data de reserva
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *
     * @return obtemos a hora de reserva
     */
    public String getHour() {
        return hour;
    }

    /**
     *
     * @param hour modificamos a hora de reserva
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     *
     * @return obtemos a court
     */
    public PadelCourt getCourt() {
        return court;
    }

    /**
     *
     * @param court modificamos a court
     */
    public void setCourt(PadelCourt court) {
        this.court = court;
    }

    /**
     *
     * @param date data da reserva
     * @param hour hora da reserva
     * @param court pista da reserva
     */
    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    public abstract double getPrice();

    public abstract boolean isCompleted();

    public abstract boolean containsPlayer(String playerId);

    public String getDescription() {
        String description = "Reserva ";

        if (isCompleted()) {
            description += "completa:\n";
        } else {
            description += "pendente:\n";
        }

        String textDate = new SimpleDateFormat("dd/MM/yyyy").format(date);
        description += "Data: " + textDate + " Hora: " + hour + " Pista: "
                + court;

        return description;

    }

}

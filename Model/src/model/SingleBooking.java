package model;


import model.Booking;
import model.PadelCourt;
import model.Player;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jpingil
 */
public class SingleBooking extends Booking {

    private Player players[];

    /**
     *
     * @return obtemos os players
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     *
     * @param players modificamos os players
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    /**
     *
     * @param date data da reserva
     * @param hour hora da reserva
     * @param court pista da reserva
     */
    public SingleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        players = new Player[2];
    }

    /**
     *
     * @return obtemos o precio
     */
    @Override
    public double getPrice() {
        return 0;
    }

    /**
     * Debe devolver "false" se algún dos xogadores do array "players" é null, e
     * "true" en caso contrario.
     *
     * @return
     */
    @Override
    public boolean isCompleted() {
        for (Player player : players) {
            if (player == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Debe devolver "true" se o Id de algún dos xogadores do array "players"
     * coincide co recibido como parámetro.
     *
     * @param playerId id dun xogador
     * @return
     */
    @Override
    public boolean containsPlayer(String playerId) {
        for (Player player : players) {
            if (player.getId().equals(playerId)) {
                return true;
            }
        }
        return false;

    }

    /**
     *
     * @return
     */
    @Override
    public String getDescription() {
        String description = super.getDescription();
        description += "\nXogadores: ";
        for (Player player : players) {
            if (isCompleted()) {
                description += player.getId() + "(" + player.getScore() + ")";
            } else {
                description += "Pendente";
            }

        }

        return description;

    }

    private void addPlayer(Player player) {
        for (Player player1 : players) {
            if (player1 == null) {
                player1 = player;
            }

        }
    }

}

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
public class DoubleBooking extends Booking {

    private Player[][] teams;

    public Player[][] getPlayers() {
        return teams;
    }

    public void setPlayers(Player[][] players) {
        this.teams = players;
    }

    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        teams = new Player[2][2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        for (Player[] team : teams) {
            for (Player player : team) {
                if (player == null) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public boolean containsPlayer(String playerId) {
        for (Player[] team : teams) {
            for (Player player : team) {
                if (player.getId().equals(playerId)) {
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public String getDescription() {
        String description = super.getDescription();
        description += "\nXogadores: ";
        for (int i = 0; i < teams[i].length; i++) {
            description += "Equipo "+i;
            for (int j = 0; j < teams[j].length; j++) {
                if (isCompleted()) {
                    description += teams[i][j].getId() + "(" + teams[i][j].
                            getScore() + ")";
                } else {
                    description += "Pendente";
                }
            }
                
            
        }

        return description;
    }

}

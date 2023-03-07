package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * creamos a clase Player
 * @author jpingil
 */
public class Player {
    
    private String id;
    private String password;
    private String name;
   
    private double score;
    private double balance;

    /**
     *
     * @return obtemos o valor de id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id modificamos o valor de id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return obtemos o valor de password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password modificamos o valor de password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return obtemos o valor do name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name modificamos o valor do name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return obtemos o valor do score
     */
    public double getScore() {
        return score;
    }

    /**
     *
     * @param score modificamos o valor do score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     *
     * @return obtemos o valor do balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance modificamos o valor do balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param id id do player
     * @param password contrasinal do player
     * @param name nome do player
     * @param score puntuacion que indica o nivel do player
     * @param balance balance que indica o saldo do player
     */
    public Player(String id, String password, String name, double score, double balance) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.score = score;
        this.balance = balance;
    }
    
    
}

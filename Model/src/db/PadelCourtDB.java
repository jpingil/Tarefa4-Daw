package db;

import model.PadelCourt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * creamos a clase PadelCourtDB
 * @author jpingil
 */
public class PadelCourtDB {
    
    /**
     * metodo para obter todas as court
     * @return todas as court
     */
    public static PadelCourt getAllCourts(){
        for (PadelCourt court : PadelManagerDB.getCourts()) {
            return court;
        }
        return null;
    }
}

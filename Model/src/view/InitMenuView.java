/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.InitMenuController;
/**
 *
 * @author jpingil
 */
public class InitMenuView {
    
    private InitMenuController controller;

    public InitMenuView(InitMenuController controller) {
        this.controller = controller;
        this.controller = new InitMenuController();
    }
    
    private void showInvalidUser(){
        System.out.println("As credenciais introducidas non son correctas");
    }
    
    private void showLoginMenu(){
        
    }
}

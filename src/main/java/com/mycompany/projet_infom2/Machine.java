/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_infom2;

/**
 *
 * @author noeli
 */

import com.mycompany.projet_infom2.Equipement;
import java.util.ArrayList;

public class Machine extends Equipement{
    private String refMachine ; 
    private String dMachine ; 
    private float coordonnee_x ; 
    private float coordonnee_y ;
    private float cout ;
    private float duree ; 
    private String type ; 
    
    ArrayList<Machine> machines = new ArrayList<>();
    
    public Machine (String refMachine, String dMachine, float coordonnee_x, float coordonnee_y){ 
       this.refMachine = refMachine ; 
       this.dMachine = dMachine ;
       this.coordonnee_x = coordonnee_x ; 
       this.coordonnee_y = coordonnee_y ; 
    }
    
    //getters&setters
    public String getRefMachine() {
        return refMachine;
    }
    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }
    public String getdMachine() {
        return dMachine;
    }
    public void setdMachine(String dMachine) {
        this.dMachine = dMachine;
    }
    public float getCoordonnee_x() {
        return coordonnee_x;
    }
    public void setCoordonnee_x(float coordonnee_x) {
        this.coordonnee_x = coordonnee_x;
    }
    public float getCoordonnee_y() {
        return coordonnee_y;
    }
    public void setCoordonnee_y(float coordonnee_y) {
        this.coordonnee_y = coordonnee_y;
    }
    public float getCout() {
        return cout;
    }
    public void setCout(float cout) {
        this.cout = cout;
    }
    public float getDuree() {
        return duree;
    }
    public void setDuree(float duree) {
        this.duree = duree;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    
    //methodes 
    
    public void afficheMachine (String refMachine, String dMachine, float coordonnee_x, float coordonnee_y){
        System.out.println("Machine "+ refMachine + " : " + dMachine + "Emplacement : " + coordonnee_x +", "+ coordonnee_y);
    }
    
    public void modifierMachine (String nouvelleref, String nouvelledesig, float nouveau_x, float nouveau_y){
       this.refMachine = nouvelleref; 
       this.dMachine = nouvelledesig;
       this.coordonnee_x = nouveau_x ; 
       this.coordonnee_y = nouveau_y ; 
    }
    
     public void ajoutermachineliste (Machine m) {
        machines.add(m);
    }
    
    public void supprimermachineliste (Machine m) {
        machines.remove(m);
    }
    
    

    
            
            
    
}

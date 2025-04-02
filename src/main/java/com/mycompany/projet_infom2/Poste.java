/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_infom2;

import com.mycompany.projet_infom2.Equipement;
import java.util.Set;

/**
 *
 * @author noeli
 */
import java.util.Set;

public class Poste extends Equipement {
    private String refPoste ; 
    private String dPoste ; 
    private Set<Machine> machines ;

    public Poste (String refPoste){
        this.refPoste = refPoste ; 
    }

    public String getRefPoste() {
        return refPoste;
    }
    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }
    public String getdPoste() {
        return dPoste;
    }
    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }
    public Set<Machine> getMachines() {
        return machines;
    }
    public void setMachines(Set<Machine> machines) {
        this.machines = machines;
    }
    
     
    public void affichePoste (){
       System.out.println("Poste "+ refPoste + " : " + dPoste + "Inclut : " + Set<Machine>);
    }
    
    public void modifierPoste (String nouvelleDesignation, String nouvelleRef){
        this.dPoste = nouvelleDesignation ;
        this.refPoste = nouvelleRef ;
    }
         
    public void supprimerPoste (){
       
    }


    
}

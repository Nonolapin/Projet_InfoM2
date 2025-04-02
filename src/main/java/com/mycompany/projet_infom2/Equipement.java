/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_infom2;

/**
 *
 * @author noeli
 */
public abstract class Equipement {
    private String refEquipement ;
    private String dEquipement ;
    private float cout ; 
    private int nombre_employes ; 

    public Equipement (String refEquipement, int nombre_employes){
        this.refEquipement = refEquipement ; 
        this.nombre_employes = nombre_employes ; 
    }

    public String getRefEquipement() {
        return refEquipement;
    }
    public void setRefEquipement(String refEquipement) {
        this.refEquipement = refEquipement;
    }
    public String getdEquipement() {
        return dEquipement;
    }
    public void setdEquipement(String dEquipement) {
        this.dEquipement = dEquipement;
    }
    public float getCout() {
        return cout;
    }
    public void setCout(float cout) {
        this.cout = cout;
    }
    public int getNombre_employes() {
        return nombre_employes;
    }
    public void setNombre_employes(int nombre_employes) {
        this.nombre_employes = nombre_employes;
    }
    
    
    
}

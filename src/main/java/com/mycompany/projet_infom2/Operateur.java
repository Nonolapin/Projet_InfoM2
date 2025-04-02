/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_infom2;

/**
 *
 * @author noeli
 */
public class Operateur {
    private String nom;
    private String code ;
    private String prenom ; 
    private String competence ; 
    private boolean estDisponible; 

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCompetence() {
        return competence;
    }
    public void setCompetence(String competence) {
        this.competence = competence;
    }
    public boolean getEstDisponible() {
        return estDisponible;
    }
    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    
    // Constructeur
    public Operateur(String nom, String code) {
        this.code = code ; 
        this.estDisponible = true; // Par défaut la personne est disponible
    }

    //mettre l'operateur en mode occupé 
    public void occuper() {
        this.estDisponible = false;
    }

    //mettre l'operateur en mode disponible 
    public void disponible() {
        this.estDisponible = true;
    }

    //vérifier si la personne est disponible
    public boolean estDisponible() {
        return estDisponible;
    }

 
}



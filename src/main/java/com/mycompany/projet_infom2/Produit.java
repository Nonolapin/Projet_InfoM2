/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_infom2;

/**
 *
 * @author noeli
 */

import java.util.ArrayList;

public class Produit {
    private String codeId ;
    private String dproduit ;
    
    //Constructeur 
    public Produit (String dproduit , String codeId ){
        this.codeId = codeId ; 
        this.dproduit = dproduit ; 
    }
    
    //Getters & Setters 
    public String getCodeId() {
        return codeId;
    }
    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }
    public String getDproduit() {
        return dproduit;
    }
    public void setDproduit(String dproduit) {
        this.dproduit = dproduit;
    }
    
    //creation des differentes listes (changer les noms la cetait juste un exemple)
    ArrayList<Produit> produits_stock = new ArrayList<>();
    ArrayList<Produit> produits_enCours = new ArrayList<>();
    //en cours de production, stock, a creer
    
    //METHODES 
    public void afficheProduit (String dproduit , String codeId){ 
        System.out.println("Produit "+ codeId + " : " + dproduit);
    }
    
    public void modifierProduit (String nouvelleDesignation, String nouveauCodeId){
        this.dproduit = nouvelleDesignation ;
        this.codeId = nouveauCodeId ;
    }
    
    public void ajouterProduit_stock (Produit p) {
        produits_stock.add(p);
    }
    
    public void ajouterProduit_enVente (Produit p) {
        produits_enCours.add(p);
    }
            
    public void supprimerProduit_stock (Produit p) {
        produits_stock.remove(p);
    }
    
    public void supprimerProduit_enVente (Produit p) {
        produits_enCours.remove(p);
    }
    
    
    
    

    
}

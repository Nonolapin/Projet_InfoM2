/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projet_infom2;

/**
 *
 * @author noeli
 */
public class Projet_InfoM2 {

    public static void main(String[] args) {
       
        Machine m1 = new Machine ("machine1" , "mac_decoupe", 100, 2, 2.234f, 3.777f, 2);
        Machine.ajoutermachineliste (m1); 
        Machine m2 = new Machine ("machine2" , "mac_assemblage",200, 3, 3.99f, 5.23f, 4);
        Machine.ajoutermachineliste (m2); 
        Machine.afficherToutesLesMachines(); 
        
        Poste poste1 = new Poste ("poste1", "poste_telephone", 3, 300) ; 
        // Ajouter des machines aux postes
        poste1.getMachines().add(m1);  
        poste1.getMachines().add(m2);  
        poste1.affichePoste (); 
        
        Produit p1 = new Produit ("abcd", "telephone"); 
        Produit p2 = new Produit ("hdfr", "enceinte"); 
        Produit.afficheProduit(p1); 
        Produit.afficheProduit(p2); 
        Produit.ajouterProduit_stock (p1); 
        Produit.ajouterProduit_stock (p2); 
        Produit.afficherStock (); 
        
        Operation ope1 = new Operation ("operation001", "decoupe" , 3f, 400); 
        
        Operateur o1 = new Operateur ("Jean", "op001");
        // On occupe la personne
        o1.occuper();
        // On libère la personne
        //o1.disponible();
        
        // Vérification de la disponibilité
        if (o1.estDisponible()) {
            System.out.println(o1.getNom()+ ", " + o1.getCode() + " , est disponible.");
        } else {
            System.out.println(o1.getNom()+ ", " +o1.getCode() + " , est occupe.");
        }
        
        
        /*Equipement e1 = new Equipement ("eq001", 3);
        Equipement e2 = new Equipement ("eq002", 2);
        Operation ope1 = new Operation ("ope001", "couper", 3f); 
        Operation ope2 = new Operation ("ope002", "fermer", 4f); */
        
        Gamme g1 = new Gamme ("g200") ; 
        g1.creerGamme_eq(poste1); // Ajout d'un poste
        g1.creerGamme_eq(m2); //Ajout d'une machine
        g1.creerGamme_op(ope1) ; //Ajout d'une operation
        Gamme.afficherGamme (g1); 
        
        Gamme.coutGamme(g1); 
        Gamme.dureeGamme (g1);
        
        
        
    }
}

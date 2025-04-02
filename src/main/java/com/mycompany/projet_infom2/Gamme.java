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
import com.mycompany.projet_s2.Operation;
import java.util.ArrayList;

public class Gamme {
    private String refGamme ;
    private ArrayList<Operation> listeOperations ; 
    private ArrayList<Equipement> listeEquipements ; 
    
    //constructeur 
    public Gamme (String refGamme ){
        this.refGamme = refGamme ;
    }
    //setters&getters
    
//creerGamme() : void
//modifierGamme() : void
//supprimerGamme () : void
//afficheGamme () : void 

   
    
    public void creerGamme_op (Operation opp) {
        listeOperations.add(opp);
    }
    
    public void creerGamme_eq (Equipement eq) {
        listeEquipements.add(eq);
    }
    
    public float coutGamme (){////n'a a voir que avec les couts des equipements et avec le slaiare des employes
        float cout_equip = 0 ; 
        for (Equipement equipement : listeEquipements){
            cout_equip += equipement.getCout();
        }
        return cout_equip ;
        
        float n_tot_employes = 0 ;
        for (Equipement equipement : listeEquipements){
            n_tot_employes += equipement.getNombre_employes();
        }
        return n_tot_employes ;
        
        float totalcout ;
        totalcout = cout_equip + n_tot_employes*10 ; 
        return totalcout ;
    }

    
    public float dureeGamme() { //n'a a voir que avec les duree des operations, 
        //on parcourt la liste des opérations et additionne les durées de chaque opération
      float totalDuree = 0;
      for (Operation operation : listeOperations) {
            totalDuree += operation.getDureeOperation();  // On additionne les durées des opérations
        }
        return totalDuree;
    }
    
 
}

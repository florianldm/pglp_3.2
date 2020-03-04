package fr.uvsq.florianldm;

import java.util.ArrayList;

public class GestionSalaires {
    private ArrayList<Employe> liste_employes;

    public GestionSalaires(){
        liste_employes = new ArrayList<Employe>();
    }

    public void ajoutEmployeEntreprise(Employe E){
        liste_employes.add(E);
    }

    public int calculSalairesEntreprise(){
        int salairetotal = 0;
        for(Employe E : liste_employes){
            salairetotal += E.calculSalaire();
        }
        return salairetotal;
    }
}

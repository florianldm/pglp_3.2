package fr.uvsq.florianldm;

import java.util.ArrayList;

public class Manager extends Employe{
    private ArrayList<Employe> Employes_geres; //Liste des employés qu'il gère

    public Manager(String nom, int anciennete){
        super(nom,anciennete);
        Employes_geres = new ArrayList<Employe>();
    }

    public void ajoutEmploye(Employe E){
        Employes_geres.add(E);
    }

    public int getNombreEmployes(){
        int cpt = 0;
        for(Employe E : Employes_geres){
            cpt++;
        }
        return cpt;
    }

    @Override
    public int calculSalaire() {
        return (this.getSalaire() + 20 * this.getAnciennete()) + 100 * this.getNombreEmployes();
    }
}

package fr.uvsq.florianldm;

public class Employe {
    String nom;
    int salaire = 1500;
    int anciennete;

    public Employe(String nom, int anciennete){
        this.nom = nom;
        this.anciennete = anciennete;
    }

    public String getNom() {
        return nom;
    }

    public int getSalaire() {
        return salaire;
    }

    public int getAnciennete() {
        return anciennete;
    }

     public int calculSalaire(){
        return this.salaire * this.anciennete;
     }
}

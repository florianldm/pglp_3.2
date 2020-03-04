package fr.uvsq.florianldm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GestionSalairesTest {
    GestionSalaires G;

    @Before
    public void initListEmploye(){
        G = new GestionSalaires();
        Employe E = new Employe("Jean",10);
        Vendeur V = new Vendeur("Paul", 5);
        V.setCommission(200);
        G.ajoutEmployeEntreprise(E);
        G.ajoutEmployeEntreprise(V);
    }

    @Test
    public void testSalaires(){
        int salaire = G.calculSalairesEntreprise();
        Assert.assertEquals(salaire,3500);
    }

}

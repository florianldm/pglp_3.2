package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {
    Manager M;

    @Before
    public void initEmploye(){
        M = new Manager("Emile", 10);
        Employe E = new Employe("Jean", 15);
        Vendeur V = new Vendeur("Thierry", 10);
        M.ajoutEmploye(E);
        M.ajoutEmploye(V);
    }
    @Test
    public void testInstance(){
        Assert.assertTrue(M.getNom().equals("Emile") && M.getAnciennete() == 10);
    }

    @Test
    public void testSalaire(){
        Assert.assertTrue(M.calculSalaire() == (10 * 20 + M.getSalaire()) + 100 * 2);
    }
}

package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendeurTest {
    Vendeur V;
    @Before
    public void initEmploye(){
        V = new Vendeur("Edouard", 15);
        V.setCommission(200);
    }
    @Test
    public void testInstance(){
        Assert.assertTrue(V.getNom().equals("Edouard") && V.getAnciennete() == 15);
    }

    @Test
    public void testSalaire(){
        Assert.assertTrue(V.calculSalaire() == 15 * 20 + V.getSalaire() + V.getCommission());
    }
}

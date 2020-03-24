package fr.uvsq.florianldm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VendeurTest {
    /** Init vendeur. */
    Vendeur v;

    /**
     * Initialisation employe.
     */
    @Before
    public void initEmploye() {
        v = new Vendeur("Edouard", 15);
        v.setCommission(200);
    }

    /**
     * Test instance d'employe.
     */
    @Test
    public void testInstance() {
        Assert.assertTrue(v.getNom().equals("Edouard") && v.getAnciennete() == 15);
    }

    /**
     * Test calcul de salaire.
     */
    @Test
    public void testSalaire() {
        Assert.assertTrue(v.calculSalaire() == 15 * 20 + v.getSalaire() + v.getCommission());
    }
}

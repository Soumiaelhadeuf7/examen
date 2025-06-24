/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class produitTest {
    @Test
    public void testPrix_total() {
        System.out.println("prix_total");
        produit instance = new produit("soumia",5,2);
        int result = instance.prix_total(5, 2);
        assertEquals(10, result);
    }
    
}

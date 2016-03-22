/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jgoodwin
 */
public class PrimaireTest 
{
    /**
     * Test of crible method, of class Primaire.
     */
    /*@Test
    public void testCrible() 
    {
        boolean crible[] = Primaire.crible(100);
        for (int i = 0;i<crible.length;i++)
        {
            if (crible[i])
                System.out.println(i+" est premier");
        }
    }*/
    
    @Test
    public void testCrible() 
    {
        HashMap <Integer,Integer> primalite = Primaire.decompose_primaire(1000);
        System.out.println("");
    }
    
    @Test
    public void testDecompPrime()
    {   //                                                                  N
        System.out.println("Decomposition primaire de N");
        HashMap <Integer,Integer> decompPrime = Primaire.decompose_primaire(55);
        System.out.println(decompPrime.toString());
        
    }
    
    @Test
    public void testPhi()
    {
        System.out.println("Fhi de N");
        //Fhi(N)                           N
        System.out.println(Primaire.euler(55));
    }
}

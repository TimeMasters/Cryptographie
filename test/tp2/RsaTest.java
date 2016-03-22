/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Jean-Paul
 */
public class RsaTest 
{
    @Test
    public void testChiffrer() 
    {
        int resultat = Rsa.chiffrer(101, 103, 10331, 7);
        //Assert.assertEquals(964, resultat);
        System.out.println(resultat);
    }
    
    @Test
    public void testChiffrer2() 
    {   // n p m e
        int resultat = Rsa.chiffrer(7, 11, 23, 5);
        //Assert.assertEquals(964, resultat);
        System.out.println(resultat);
    }
}

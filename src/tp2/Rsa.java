/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import static tp2.Euclide.restexpmn;
import static tp2.Euclide.inverse;
import static tp2.Primaire.euler;

/**
 *
 * @author Jean-Paul
 */
public class Rsa 
{
    public static int chiffrer(int n, int p, int m, int e)
    {
        int N = n * p; 
        int phiN = euler(N);
        try {
            int d = inverse(e, phiN);
        } catch (Exception ex) {
        System.err.println(ex.getMessage());        
        }
        int nouveauM = restexpmn(m, e, N);
        return nouveauM;
    }
}

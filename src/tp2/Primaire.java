package tp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author jgoodwin
 */
public class Primaire 
{
    public static boolean[] crible(int n)
    {
        int max =(int) Math.sqrt(n);
        boolean crible[] = new boolean[n];
        for (int i = 0; i < n; i++)
            crible[i] = true;
        
        int premier = 1;
        for (int i = 2; i<=max;i++)
        {
            if (crible[i])
                for (int j = 2; j < n;j++)
                {
                    System.out.println(i+"*"+j);
                    if(i*j < crible.length)
                        crible[i*j]=false;
                }
           // System.out.println("------\nA : "+n+"\nB : "+i+"\nQ : "+q);
        }
        crible[0] = false;
        crible[1] = false;
        return crible;
    }
    
    public static HashMap<Integer,Integer> decompose_primaire(int n)
    {
        HashMap<Integer,Integer> retour = new HashMap();
        int i= 2;
        while (i <= n)
        {
            if (n%i==0)
            {
                if (retour.containsKey(i))
                    retour.put(i, retour.get(i)+1);
                else
                    retour.put(i, 1);
                n/= i;
                i = 1;
            }
            i++;
        }
        return retour;
    }
    
    public static int euler(int n)
    {
        HashMap <Integer,Integer> decompPrime = Primaire.decompose_primaire(n);
        int resultat = 1;
        Set <Integer> cles = decompPrime.keySet();
        for(int valeur : cles)
        {
            int power = decompPrime.get(valeur);
            resultat *= (Math.pow(valeur,power)-Math.pow(valeur,power-1));
        }
        return resultat;
    }
}

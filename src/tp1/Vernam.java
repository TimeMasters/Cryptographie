package tp1;


public class Vernam 
{
    public static int[] chiffrer(int [] parMessage, int[] parCle)
    {
        int[] retour = new int[parMessage.length];
        for (int i=0;i<parMessage.length;i++)
        {
            retour[i] = (parMessage[i]+parCle[i%parCle.length])%2;
        }
        return retour;
    }
}

//Package
package EXAM.EXAM;

public class EXAM 
{
    //Main
    public static void main(String[] args) 
    {
        String tab_ville[] = {"LeCaire","NewYork","Paris","Calcutta","Barcelone","Manille","Montréal","HongKong"};
        double tab_superficie[] = {210,1214,105.4,185,100.4,38.55,363.52,1104};
        int tab_population[] = {8452409, 8391881, 2211297, 4580544,1621537,1660714,1667700,7018636};
        int tab_densite[] = new int[8];

        calculDensite(tab_superficie, tab_population, tab_densite);

        afficherResultat(tab_superficie, tab_population, tab_densite, tab_ville);
    }

    public static void calculDensite(double[] tab_superficie, int[] tab_population, int[] tab_densite) 
    {
        for (int i = 0; i < tab_superficie.length; i++) 
        {
            tab_densite[i] = (int) (tab_population[i] / tab_superficie[i]);
        }
    }

    public static void afficherResultat(double[] tab_superficie, int[] tab_population, int[] tab_densite, String[] tab_ville)
    {
        System.out.println("Ville\t\tSuperficie\tPopulation\tDensité");
        System.out.println("=======================================================");
        
        for (int i = 0; i < tab_ville.length; i++)
        {
            System.out.println(tab_ville[i] + "\t\t" + tab_superficie[i] + "\t\t" + tab_population[i] + "\t\t" + tab_densite[i]);
        }
    }
}

//Steven Frost
import java.util.*;
// The ArrayList values are the Ranged profile for attackers and the defense profile for defenders.
public class WarProbShoot {
  Random gen = new Random();
  private ArrayList<Integer> Attacker = new ArrayList<Integer>();// {BS, Modifier, Attack S, # of Shots,}
  private ArrayList<Integer> Defender = new ArrayList<Integer>();// {T, Armor Save, Ward Save}

  public WarProbShoot () {
  }

  public void setStats (ArrayList<Integer> a, ArrayList<Integer> d) {
    Attacker.addAll(a);
    Defender.addAll(d);
  }

  public void reset () {
    Attacker.clear();
    Defender.clear();
  }

  public String ProbTableShoot () {
    String ret = "# \t \tHit \t \tW \tSave \n"
    for (int i = 1; i <= Attacker.get(3); i++) {

    }
    return "Ranged";
  }

  public static double toHitProb (int wnd, int tot, int ws, int mod) {
    double total = Math.pow(6, tot);
    double chance = toHitProbFav(wnd, tot, ws, mod) / total;
    return chance;
  }
  public double round (double a) {
    a *= 1000;
    a = a (int);
    a /= 1000;
    return a;
  }
  private static double toHitProbFav(int wnd, int tot, int ws, int mod) {
    double fav = 0;
    return fav;
  }
}

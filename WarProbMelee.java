//Steven Frost
import java.util.*;
// The values inside the ArrayLists are statlines for attackers and defenders.
public class WarProbMelee {
  private ArrayList<Integer> Attacker;
  private ArrayList<Integer> Defender;
  // {WS, S, T, A, Ld}
  public WarProbMelee() {
    Attacker = new ArrayList<Integer>();
    Defender = new ArrayList<Integer>();
  }

  public void setStats (ArrayList<Integer> a, ArrayList<Integer> d) {
    Attacker.addAll(a);
    Defender.addAll(d);
  }

  public void reset () {
    Attacker.clear();
    Defender.clear();
  }

  public String ProbTableMelee () {
    return "Melee";
  }
}

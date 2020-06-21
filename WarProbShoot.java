//Steven Frost
import java.util.*;
// The ArrayList values are the Ranged profile for attackers and the defense profile for defenders.
public class WarProbShoot {
  private ArrayList<Integer> Attacker = new ArrayList<Integer>;// {BS, Modifier, Attack S, # of Shots,}
  private ArrayList<Integer> Defender = new ArrayList<Integer>;// {T, Armor Save, Ward Save}

  public WarProbShoot (ArrayList<Integer> a, ArrayList<Integer> d) {
    Attacker.addAll(a);
    Defender.addAll(d);
  }
  public String ProbTableShoot (ArrayList<Integer> a, ArrayList<Integer> d) {

  }
}

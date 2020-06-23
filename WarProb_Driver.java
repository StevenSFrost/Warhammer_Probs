// Steven Frost
import java.util.*;

public class WarProb_Driver {
  public static void main (String [] args) {
    Scanner read = new Scanner(System.in);
    WarProbMelee Melee = new WarProbMelee();
    WarProbShoot Ranged = new WarProbShoot();

    ArrayList<Integer> Attack = new ArrayList<Integer>();
    ArrayList<Integer> Defense = new ArrayList<Integer>();
    boolean go = true;
    String type = "";
    while (go) {
      Attack.clear();
      Defense.clear();
      System.out.println("What kind of combat do you want to predict?");
      type = read.nextLine();
      if (type.equalsIgnoreCase("Ranged") || type.equalsIgnoreCase("R")) { // Asks for the Ranged Stats and Prints the Table.
        // Attacker: {BS, Modifier, Attack S, # of Shots,}
        // Defender: {T, Armor Save, Ward Save}
        System.out.println("Enter each value for the attacker in the order of Ballistic Skill, To Hit Modifier, Weapon Strength, and Number of Shots. Hit enter between each entry.");
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        System.out.println("Enter each value for the defender in the order of Toughness, Armor Save, and Ward Save. Hit enter between each entry.");
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Ranged.setStats(Attack, Defense);
        System.out.println(Ranged.ProbTableShoot());
        Ranged.reset();
      }
      else if (type.equalsIgnoreCase("Melee") || type.equalsIgnoreCase("M")) {
        // Attacker and Defender: {WS, S, T, I, Ld, # of Attacks}
        System.out.println("Enter each value for the attacker in the order of Weapon Skill, Strength, Toughness, Initiative, Leadership, and Total Number of Attacks.");
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        Attack.add(read.nextInt());
        System.out.println("Enter each value for the defender in the order of Weapon Skill, Strength, Toughness, Initiative, Leadership and Total Number of Attacks.");
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Defense.add(read.nextInt());
        Melee.setStats(Attack, Defense);
        System.out.println(Melee.ProbTableMelee());
        Melee.reset();
      }
      System.out.println("Would you like to do it again? Yes or no will do.");
      if (read.nextLine().equalsIgnoreCase("No") || read.nextLine().equalsIgnoreCase("N")) {
        go = false;
      }
    }
  }
}

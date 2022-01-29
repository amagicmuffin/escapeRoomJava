import java.util.ArrayList;

public class Inventory {
    // TODO: this probably makes for cringe game mechanics. think abt removing it
    // private int capacity;
    // private int currentWeight;
    
    private static ArrayList<String> inventory = new ArrayList<String>();
    
    /** returns whether player inventory has an item **/
    public static boolean has(String item) {
        return inventory.contains(item);
    }
    
    /** adds String item to player inventory**/
    public static void obtain(String item) {
        inventory.add(item);
        // printqueue("you picked up a: " + item);
        System.out.println("you picked up a: " + item);
    }
    
    /** removes String item from player inventory**/
    public static void remove(String item) {
        inventory.remove(item);
    }
    
    /** returns placeholder inventory. make this fit screen size later. **/
    public String toString(){
        String ans = "";
        for (String item: inventory) {
            ans += item;
            ans += "\n";
        }
        return ans;
    }
}
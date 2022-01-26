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
    }
    
    /** removes String item from player inventory**/
    public static void remove(String item) {
        inventory.remove(item);
    }
    
    /** returns placeholder inventory. make this fit screen size later. **/
    public String toString(){
        String ans = "";
        for(int i = 0; i<inventory.size(); i++){
            ans+=inventory.get(i);
            ans+="\n";
        }
        return ans;
    }
}
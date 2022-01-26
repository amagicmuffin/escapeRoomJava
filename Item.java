/**
 * Class filled with static things that help with items.
 */

public class Item {
    // TODO: when adding an item: add to itemDictionary, tryUseItem(), and give it a function
    // item id, desc
    private static String itemDictionary[][] = {
        {"hp potion", "heals you a bit"},
        {"rusty sword", "a rusty sword"}, // TODO: implement damage queue system?
    };
    
    /**
     * @param item - item id
     * @return - if an item exists or not
     */
    public static boolean itemExists(String item) {
        for (int i = 0; i<itemDictionary.length; i++) {
            if (itemDictionary[i][0].equalsIgnoreCase(item)) { // itemDict[i][0] is item id
                return true;
            }
        }
        return false;
    }
    
    /** 
     * Tries to use an item with item id: String item.
     * Returns false if no item exists. Otherwise, returns true.
     */
    public static boolean tryUseItem(String item) {
        switch(item) {
            case "hp potion": useHpPotion(); return true; 
            case "rusty sword": useRustySword(); return true; 
            default: return false;
        }
    }
    
    // TODO: you should probably let this be used out of combat
    private static void useHpPotion() { // TODO: instead of println, use queue system to control println
        if(Environment.inCombat && Inventory.has("hp potion")) {
            System.out.println("HP pot used!");
            Inventory.remove("hp potion");
        }
    }
    
    private static void useRustySword() { // TODO: instead of println, use queue system to control println
        if(Environment.inCombat) {
            System.out.println("Rusty Sword!");
        }
    }
}
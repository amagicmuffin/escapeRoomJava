/**
 * Class filled with static things that help with items.
 */

public class Item {
    // TODO: when adding an item: add to itemDictionary, tryUseItem(), and give it a function
    // item id, desc
    private static final String[][] itemDictionary = {
        {"fragile glass bottle", "a fragile glass bottle"},
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
     * Returns false if no item exists or if you do not have the item.
     * Otherwise, returns true.
     */
    public static boolean tryUseItem(String item) {
        if (Inventory.has(item)) {
            switch(item) {
                case "bronze key": useBronzeKey(); return true;
                case "gold key": useGoldKey(); return true;
                case "fragile glass bottle": useFragileGlassBottle(); return true;
                default: return false;
            }
        } else {
            // TODO printqueue("You broke the bottle. The pile of glass at your feet increases in size.");
            System.out.println("You do not have a " + item);
            return false;
        }
    }

    private static void useBronzeKey() {

    }

    private static void useGoldKey() {

    }

    /** temp func for testing **/
    private static void useFragileGlassBottle() {
        Inventory.remove("fragile glass bottle");
        // TODO printqueue("You broke the bottle. The pile of glass at your feet increases in size.");
        System.out.println("You broke the bottle. The pile of glass at your feet increases in size.");

    }
}
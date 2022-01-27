/**
 * Class filled with static things that help with items.
 */

public class Item {
    // TODO: when adding an item: add to itemDictionary, tryUseItem(), and give it a function
    // item id, desc
    private static final String[][] itemDictionary = {
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
            case "bronze key": useBronzeKey(); return true;
            case "gold key": useGoldKey(); return true;
            default: return false;
        }
    }

    private static void useBronzeKey() {

    }

    private static void useGoldKey() {

    }
}
import java.util.ArrayList;

public class Environment {

    ///////// room things /////////
    public static String currentRoom = null; // null represents not in a room. for example, in start screen menu

    public static Room[][] map = configs.map;

    ///////// entity things /////////
    public static ArrayList<Entity> tiles = new ArrayList<Entity>();
    tiles.add(new Entity("debug chest 1", 'X', 2, 2, 0, 0));

    /** test program **/
    public static void main(String[] args) {
        System.out.println(map[0][0]);
        map[0][0].setTile(1,1,'@');
        System.out.println(map[0][0]);
        System.out.println(map[1][0]);
    }
}

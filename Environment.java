public class Environment {
    public static String room = null; // null represents not in a room. for example, in start screen menu

    public static Room[][] map = {
        {new Room(), new Room(), new Room()},
        {new Room(), new Room(), new Room()},
        {new Room(), new Room(), new Room()}
    };

    /** test program **/
    public static void main(String[] args) {
        System.out.println(map[0][0]);
        map[0][0].setTile(1,1,'@');
        System.out.println(map[0][0]);
        System.out.println(map[1][0]);
    }
}
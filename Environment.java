public class Environment {
    public static String room = null; // null represents not in a room. for example, in start screen menu

    /** WHY IS THIS SO LONG LKSDJFLSKDFJ this needs to be fixed **/
    // TODO get this outta here use the default constructor lmao
    // 
    private static char[][] mapA = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','A'}
    };

    // 
    private static char[][] mapB = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','B'}
    };

    // 
    private static char[][] mapC = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','C'}
    };

    // 
    private static char[][] mapD = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','D'}
    };

    // 
    private static char[][] mapE = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','E'}
    };

    // 
    private static char[][] mapF = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','F'}
    };

    // 
    private static char[][] mapG = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','G'}
    };

    // 
    private static char[][] mapH = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','H'}
    };

    // 
    private static char[][] mapI = {
        {'#','#','#','#','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','.','.','.','#'},
        {'#','#','#','#','I'}
    };

    

    public static Room[][] map = {
        {new Room(mapA), new Room(mapB), new Room(mapC)},
        {new Room(mapD), new Room(mapE), new Room(mapF)},
        {new Room(mapG), new Room(mapH), new Room(mapI)}
    };

    /** test program **/
    public static void main(String[] args) {
        System.out.println(map[0][0]);
        map[0][0].setTile(1,1,'@');
        System.out.println(map[0][0]);
        System.out.println(map[1][0]);
    }
}
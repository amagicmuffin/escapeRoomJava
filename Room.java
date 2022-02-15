/**
 * Represents a room.
 * Has functions to get, set, swap tiles in the room.
 */
public class Room {
    public static final char FLOOR_TILE = '.';
    private char[][] room;

    public Room(char[][] r) {
        room = r;
    }

    public Room() {
        room = new char[][]{
            {'#','#','#','#','#'},
            {'#','.','.','.','#'},
            {'#','.','.','.','#'},
            {'#','.','.','.','#'},
            {'#','.','.','.','#'},
            {'#','#','#','#','#'}
        };
    }

    /* simple getters and setters */
    public char[][] getRoom() {
        return room;
    }

    public char getTile(int i, int j) {
        return room[i][j];
    }

    public void setTile(int i, int j, char newTile) {
        room[i][j] = newTile;
    }

    /**
     * move a tile from 1 to 2.
     * replace old tile position with char representing floor
     */
    public void move(int i1, int j1, int i2, int j2) {
        setTile(i2, j2, getTile(i1,j1));
        setTile(i1, j1, FLOOR_TILE);
    }

    /**
     * println's toString
     */
    public void render() {
        System.out.println(this);
    }

    public String toString() {
        String output = "";

        // generate i rows
        for (int i = 0; i < room.length; i++) {
            // generate j columns per row
            for (int j = 0; j < room[0].length; j++) { // TODO: could that 0 be i?
                output += room[i][j];
                output += " ";
            }
            output += "\n";
        }

        return output;
    }

    /** test program **/
    public static void main(String[] args) {
        char[][] r = {
                {'#','#','#','#','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','.','.','.','#'},
                {'#','#','#','#','#'}
        };

        Room room = new Room(r);

        System.out.println(room);
    }
}
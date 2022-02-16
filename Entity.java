/**
 * class that represents an entity, represented as a tile on the map
 */
public class Entity {
    private String id;
    private int iPos;
    private int jPos;
    private char tile;

    // TODO order the functions
    public Entity(String id, char tile, int iPos, int jPos, int roomiPos, int roomjPos) {
        this.id = id;
        this.tile = tile;
        this.iPos = iPos;
        this.jPos = jPos;
        this.roomiPos = roomiPos;
        this.roomjPos = roomjPos;
    }

    public String getId() {
        return id;
    }

    public char getTile() {
        return tile;
    }
    
    public int getiPos() {
        return iPos;
    }

    public int getjPos() {
        return jPos;
    }

    public int getroomiPos() {
        return iPos;
    }

    public int getroomjPos() {
        return jPos;
    }
}

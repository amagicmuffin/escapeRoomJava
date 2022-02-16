/**
 * class that represents an entity, represented as a tile on the map
 */
public class Entity {
    private String id;
    private int iPos;
    private int jPos;
    private char tile;

    public Entity(String id, int iPos, int jPos, char tile) {
        this.id = id;
        this.iPos = iPos;
        this.jPos = jPos;
        this.tile = tile;
    }

    public String getId() {
        return id;
    }

    public int getiPos() {
        return iPos;
    }

    public int getjPos() {
        return jPos;
    }

    public char getTile() {
        return tile;
    }
}

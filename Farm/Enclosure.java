package Farm;

/**
 * Created by user on 18/12/2016.
 */

import java.util.ArrayList;

public abstract class Enclosure {
    private EnclosureType type;
    private int enclosureID;

    public Enclosure(EnclosureType type, int enclosureID) {
        this.type = type;
        this.enclosureID = enclosureID;
    }

    public EnclosureType getEnclosureType() {
        return this.type;
    }

    public int getEnclosureID() {
        return enclosureID;
    }

}



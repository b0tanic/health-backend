package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Перечень основных симптомов.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum GeneralReason {

    HEADACHE ("HEADACHE", "Головная боль"),

    STOMACHACHE("STOMACHACHE", "Боль в животе");


    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (GeneralReason value : values()) {
            values.add(value.idName);
        }
    }

    public final IdName idName;

    GeneralReason(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

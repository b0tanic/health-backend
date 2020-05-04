package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания изменения симптомов.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum SymptomChangeSelection {

    GET_WORSE ("GET_WORSE", "Становились хуже"),

    NOT_WORSE_THAN_BEFORE ("NOT_WORSE_THAN_BEFORE", "Не хуже, чем было раньше"),

    NO_CHANGE ("NO_CHANGE", "Примерно такие же");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (SymptomChangeSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    SymptomChangeSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

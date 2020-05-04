package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания остроты боли.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum PainSelection {

    MILD ("MILD", "Мягкая"),

    MODERATE ("MODERATE", "Умеренная"),

    SHARP ("SHARP", "Острая"),

    DO_NOT_KNOW ("DO_NOT_KNOW", "Я не знаю");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (PainSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    PainSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

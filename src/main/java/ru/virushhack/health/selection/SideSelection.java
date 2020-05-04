package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания стороны боли.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum SideSelection {

    ONE_SIDE ("ONE_SIDE", "Одна сторона"),

    TWO_SIDE ("TWO_SIDE", "Две стороны"),

    DO_NOT_KNOW ("DO_NOT_KNOW", "Я не знаю");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (SideSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    SideSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

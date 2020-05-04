package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок по умолчанию (Да, Нет, Не знаю).
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum StandardSelection {

    YES("YES", "Да"),

    NO("NO", "Нет"),

    DO_NOT_KNOW ("DO_NOT_KNOW", "Не знаю");


    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (StandardSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    StandardSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

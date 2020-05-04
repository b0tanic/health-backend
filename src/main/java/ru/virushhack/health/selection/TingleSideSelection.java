package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания стороны покалывания.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum TingleSideSelection {

    ONE_SIDE ("ONE_SIDE", "Одна"),

    TWO_SIDE_EQUAL ("TWO_SIDE_EQUAL", "Две одинаково"),

    TWO_SIDE_DIFF ("TWO_SIDE_DIFF", "Две, по-разному"),

    DO_NOT_KNOW ("DO_NOT_KNOW", "Я не знаю");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (TingleSideSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    TingleSideSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

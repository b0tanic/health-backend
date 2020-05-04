package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания периода времени.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum PeriodSelection {

    LESS_DAY ("LESS_DAY", "Меньше дня"),

    FROM_DAY_TO_WEEK ("FROM_DAY_TO_WEEK", "От дня до недели"),

    FROM_WEEK_TO_MONTH ("FROM_WEEK_TO_MONTH", "От недели до месяца"),

    FROM_MONTH_TO_YEAR ("FROM_MONTH_TO_YEAR", "От месяца до года"),

    MORE_YEAR ("MORE_YEAR", "Больше года");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (PeriodSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    PeriodSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

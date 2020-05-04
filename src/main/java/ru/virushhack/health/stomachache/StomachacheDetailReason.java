package ru.virushhack.health.stomachache;

import ru.virushhack.health.selection.IdNameDescription;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для уточнения симптомов боли в животе.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum StomachacheDetailReason {

    STOMACHACHE ("STOMACHACHE", "Боль в животе", "Описание варианта симптома"),

    FAST_SATURATION ("FAST_SATURATION", "Быстрое насыщение", "Описание варианта симптома"),

    INDIGESTION ("INDIGESTION", "Несварение желудка", "Описание варианта симптома");


    public static final List<IdNameDescription> values;
    static {
        values = new ArrayList<>();
        for (StomachacheDetailReason value : values()) {
            values.add(value.idName);
        }
    }

    public final IdNameDescription idName;

    StomachacheDetailReason(String id, String name, String description) {
        this.idName = new IdNameDescription(id, name, description);
    }
}

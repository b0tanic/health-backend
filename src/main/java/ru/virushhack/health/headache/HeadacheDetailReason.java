package ru.virushhack.health.headache;

import ru.virushhack.health.selection.IdNameDescription;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для уточнения симптомов головной боли.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum HeadacheDetailReason {

    HEADACHE("HEADACHE", "Головная боль", "Описание варианта симптома"),

    SINUS_PAIN ("SINUS_PAIN", "Боль в пазухе", "Описание варианта симптома"),

    EYE_PAIN ("EYE_PAIN", "Боль за глазами", "Описание варианта симптома");


    public static final List<IdNameDescription> values;
    static {
        values = new ArrayList<>();
        for (HeadacheDetailReason value : values()) {
            values.add(value.idName);
        }
    }

    public final IdNameDescription idName;

    HeadacheDetailReason(String id, String name, String description) {
        this.idName = new IdNameDescription(id, name, description);
    }
}

package ru.virushhack.health.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Список кнопок для описания эффекта после каких-то манипуляций.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum EffectSelection {

    DETERIORATION ("DETERIORATION", "Ухудшается"),

    NO_EFFECT ("NO_EFFECT", "Нет разницы"),

    DO_NOT_KNOW ("DO_NOT_KNOW", "Я не знаю");

    public static final List<IdName> values;
    static {
        values = new ArrayList<>();
        for (EffectSelection selection : values()) {
            values.add(selection.idName);
        }
    }

    public final IdName idName;

    EffectSelection(String id, String name) {
        this.idName = new IdName(id, name);
    }
}

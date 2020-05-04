package ru.virushhack.health;

import java.util.List;
import java.util.Map;

/**
 * Предварительный диагноз.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public abstract class Summary {

    public final String description;
    public final List<String> possibleCauses;
    public final List<String> present;
    public final List<String> absent;


    protected Summary(String description, List<String> possibleCauses, List<String> present, List<String> absent) {
        this.description = description;
        this.possibleCauses = possibleCauses;
        this.present = present;
        this.absent = absent;
    }


    /**
     * Определить диагноз по ответам пациента.
     * @param selections Ответы пациента.
     * @return Предварительный диагноз.
     */
    public abstract Summary determine(Map<String, String> selections);
}

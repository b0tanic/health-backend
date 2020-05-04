package ru.virushhack.health;

import ru.virushhack.health.headache.summary.cause.PossibleCause;

import java.util.List;
import java.util.Map;

/**
 * Предварительный диагноз.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public abstract class Summary {

    public String description;
    public List<PossibleCause> possibleCauses;
    public List<PossibleCause> lessLikelyCauses;


    /**
     * Определить диагноз по ответам пациента.
     * @param selections Ответы пациента.
     * @return Предварительный диагноз.
     */
    public abstract Summary determine(Map<String, String> selections);
}

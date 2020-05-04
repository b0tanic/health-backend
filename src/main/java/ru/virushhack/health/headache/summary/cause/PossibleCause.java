package ru.virushhack.health.headache.summary.cause;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ru.virushhack.health.headache.summary.SummaryDescription;

import java.util.Map;

/**
 * Возможная причина заболевания.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public abstract class PossibleCause {

    public final String name;
    public final String advice;
    public final String statistics;


    public PossibleCause(String name, String advice, String statistics) {
        this.name = name;
        this.advice = advice;
        this.statistics = statistics;
    }

    @JsonIgnore
    public abstract SummaryDescription getSummaryDescription();

    @JsonIgnore
    public abstract Map<String, String> getStepSelections();
}

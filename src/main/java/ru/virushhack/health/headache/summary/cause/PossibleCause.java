package ru.virushhack.health.headache.summary.cause;

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
    public final Map<String, String> stepSelections;


    public PossibleCause(String name, String advice, String statistics, Map<String, String> stepSelections) {
        this.name = name;
        this.advice = advice;
        this.statistics = statistics;
        this.stepSelections = stepSelections;
    }


    public abstract SummaryDescription getSummaryDescription();
}

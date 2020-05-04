package ru.virushhack.health.headache.summary.cause;

import ru.virushhack.health.headache.step.*;
import ru.virushhack.health.headache.summary.SummaryDescription;
import ru.virushhack.health.selection.StandardSelection;
import ru.virushhack.health.selection.SymptomChangeSelection;

import java.util.HashMap;
import java.util.Map;

/**
 * Мышечная боль в шее.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class MuscleNeckPain extends PossibleCause {

    public static final SummaryDescription DESCRIPTION = SummaryDescription.NOT_IMPORTANT;

    public static final String NAME = "Мышечная боль в шее";

    public static final String STATISTICS = "Аналогичные симптомы наблюдаются у 6 из 1000 людей.";

    protected static final Map<String, String> StepSelections;

    static {
        StepSelections = new HashMap<>();
        StepSelections.put(Step13.ID, StandardSelection.YES.name());
        StepSelections.put(Step25.ID, StandardSelection.YES.name());
        StepSelections.put(Step27.ID, StandardSelection.YES.name());
        StepSelections.put(Step28.ID, SymptomChangeSelection.NOT_WORSE_THAN_BEFORE.name());
    }


    public MuscleNeckPain() {
        super(NAME, DESCRIPTION.shortName, STATISTICS, StepSelections);
    }

    @Override
    public SummaryDescription getSummaryDescription() {
        return DESCRIPTION;
    }
}

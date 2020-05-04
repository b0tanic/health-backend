package ru.virushhack.health.headache.summary.cause;

import ru.virushhack.health.headache.step.*;
import ru.virushhack.health.headache.summary.SummaryDescription;
import ru.virushhack.health.selection.StandardSelection;
import ru.virushhack.health.selection.SymptomChangeSelection;

import java.util.HashMap;
import java.util.Map;

/**
 * Приобретённая кривошея.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class AcquiredTorticollis extends PossibleCause {

    public static final SummaryDescription DESCRIPTION = SummaryDescription.NOT_IMPORTANT;

    public static final String NAME = "Приобретенная кривошея";

    public static final String STATISTICS = "Аналогичный симптомы наблюдаются менее, чем у 1 из 10 людей";

    protected static final Map<String, String> StepSelections;


    static {
        StepSelections = new HashMap<>();
        StepSelections.put(Step13.ID, StandardSelection.YES.name());
        StepSelections.put(Step14.ID, StandardSelection.YES.name());
        StepSelections.put(Step15.ID, StandardSelection.YES.name());
        StepSelections.put(Step25.ID, StandardSelection.YES.name());
        StepSelections.put(Step27.ID, StandardSelection.YES.name());
        StepSelections.put(Step28.ID, SymptomChangeSelection.NOT_WORSE_THAN_BEFORE.name());
    }


    public AcquiredTorticollis() {
        super(NAME, DESCRIPTION.shortName, STATISTICS);
    }

    @Override
    public SummaryDescription getSummaryDescription() {
        return DESCRIPTION;
    }

    @Override
    public Map<String, String> getStepSelections() {
        return StepSelections;
    }
}

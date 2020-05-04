package ru.virushhack.health.headache.summary.cause;

import ru.virushhack.health.headache.step.*;
import ru.virushhack.health.headache.summary.SummaryDescription;
import ru.virushhack.health.selection.StandardSelection;
import ru.virushhack.health.selection.SymptomChangeSelection;

import java.util.HashMap;
import java.util.Map;

/**
 * Шейный остеохондроз.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class CervicalOsteochondrosis extends PossibleCause {

    public static final SummaryDescription DESCRIPTION = SummaryDescription.NEED_CONSULTATION;

    public static final String NAME = "Остеохондроз шейного отдела позвоночника";

    public static final String STATISTICS = "Аналогичные симптомы наблюдаются у 6 из 10 людей.";

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


    public CervicalOsteochondrosis() {
        super(NAME, DESCRIPTION.shortName, STATISTICS, StepSelections);
    }

    @Override
    public SummaryDescription getSummaryDescription() {
        return DESCRIPTION;
    }
}

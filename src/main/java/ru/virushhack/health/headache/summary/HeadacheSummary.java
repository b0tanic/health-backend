package ru.virushhack.health.headache.summary;

import ru.virushhack.health.Summary;
import ru.virushhack.health.headache.summary.cause.AcquiredTorticollis;
import ru.virushhack.health.headache.summary.cause.CervicalOsteochondrosis;
import ru.virushhack.health.headache.summary.cause.MuscleNeckPain;
import ru.virushhack.health.headache.summary.cause.PossibleCause;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Определения предварительного диагноза при головной боли.
 *
 * @author Arsen Avalyan
 * @since 04.05.2020
 */
public class HeadacheSummary extends Summary {

    public static final int POSSIBLE_OVERLAP = 5;

    public static final int LESS_LIKELY_OVERLAP = 3;

    protected static final List<PossibleCause> causes;

    static {
        causes = new ArrayList<>();
        causes.add(new CervicalOsteochondrosis());
        causes.add(new AcquiredTorticollis());
        causes.add(new MuscleNeckPain());
    }


    @Override
    public Summary determine(Map<String, String> selections) {

        SummaryDescription mostImportantDescription = SummaryDescription.NOT_IMPORTANT;

        possibleCauses = new ArrayList<>();
        lessLikelyCauses = new ArrayList<>();

        causes.forEach(cause -> {
            AtomicInteger selectionOverlap = compareStepSelections(selections, cause.getStepSelections());

            if (selectionOverlap.get() >= POSSIBLE_OVERLAP) {
                if (mostImportantDescription.priority <= cause.getSummaryDescription().priority) {
                    super.description = cause.getSummaryDescription().description;
                }
                possibleCauses.add(cause);
            } else if (selectionOverlap.get() >= LESS_LIKELY_OVERLAP) {
                lessLikelyCauses.add(cause);
            }
        });
        return this;
    }

    private AtomicInteger compareStepSelections(Map<String, String> userSelections, Map<String, String> causeSelections) {

        AtomicInteger selectionOverlap = new AtomicInteger();

        userSelections.forEach((step, select) -> {
            String causeSelection = causeSelections.get(step);

            if (select != null && select.equals(causeSelection)) {
                selectionOverlap.incrementAndGet();
            }
        });
        return selectionOverlap;
    }
}

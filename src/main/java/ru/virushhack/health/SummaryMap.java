package ru.virushhack.health;

import ru.virushhack.health.headache.summary.HeadacheSummary;
import ru.virushhack.health.selection.GeneralReason;
import ru.virushhack.health.stomachache.StomachacheSummary;

import java.util.EnumMap;

/**
 * Список предварительных диагнозов в связке с болью и выборами пациента.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class SummaryMap {

    protected static final EnumMap<GeneralReason, Summary> reasonSummary = new EnumMap<>(GeneralReason.class);

    static {
        reasonSummary.put(GeneralReason.HEADACHE, new HeadacheSummary());
        reasonSummary.put(GeneralReason.STOMACHACHE, new StomachacheSummary());
    }


    public static Summary getSummary(String reason) {
        return getSummary(GeneralReason.valueOf(reason));
    }

    public static Summary getSummary(GeneralReason reason) {
        return reasonSummary.get(reason);
    }
}

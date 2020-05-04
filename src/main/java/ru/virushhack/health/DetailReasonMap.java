package ru.virushhack.health;

import ru.virushhack.health.headache.HeadacheDetailReason;
import ru.virushhack.health.selection.GeneralReason;
import ru.virushhack.health.selection.IdNameDescription;
import ru.virushhack.health.stomachache.StomachacheDetailReason;

import java.util.EnumMap;
import java.util.List;

/**
 * Список уточнений симптомов по локализации боли.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class DetailReasonMap {

    static final EnumMap<GeneralReason, List<IdNameDescription>> detailReasonMap = new EnumMap<>(GeneralReason.class);

    static {
        detailReasonMap.put(GeneralReason.HEADACHE, HeadacheDetailReason.values);
        detailReasonMap.put(GeneralReason.STOMACHACHE, StomachacheDetailReason.values);
    }


    public static List<IdNameDescription> getDetailReason(GeneralReason reason) {
        return detailReasonMap.get(reason);
    }

    public static List<IdNameDescription> getDetailReason(String reason) {
        return detailReasonMap.get(GeneralReason.valueOf(reason));
    }
}

package ru.virushhack.health;

import ru.virushhack.health.headache.HeadacheStepOrder;
import ru.virushhack.health.selection.GeneralReason;
import ru.virushhack.health.stomachache.StomachacheStepOrder;

import java.util.EnumMap;

/**
 * Карта, которая определяет порядок слайдов (Step) по первоначальному симптому.
 *
 * @author Arsen Avalyan
 * @since 04.05.2020
 */
public class StepOrderMap {

    protected static final EnumMap<GeneralReason, StepOrder> stepOrderMap = new EnumMap<>(GeneralReason.class);

    static {
        stepOrderMap.put(GeneralReason.HEADACHE, new HeadacheStepOrder());
        stepOrderMap.put(GeneralReason.STOMACHACHE, new StomachacheStepOrder());
    }


    public static StepOrder stepOrder(GeneralReason reason) {
        return stepOrderMap.get(reason);
    }

    public static StepOrder stepOrder(String reason) {
        return stepOrder(GeneralReason.valueOf(reason));
    }
}

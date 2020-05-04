package ru.virushhack.health.stomachache;

import ru.virushhack.health.StepOrder;
import ru.virushhack.health.headache.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Порядок следования слайдов при боли в животе.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class StomachacheStepOrder implements StepOrder {

    protected static final Map<String, BaseStep> orderMap = new HashMap<>();

    static {
        // TODO: 04.05.2020 Заполнить порядок следования для боли в животе
    }


    public BaseStep nextStep(BaseStep current) {
        return nextStep(current.nextState);
    }

    public BaseStep nextStep(String currentStepId) {
        return orderMap.get(currentStepId);
    }
}

package ru.virushhack.health.headache;

import java.util.HashMap;
import java.util.Map;

/**
 * Порядок следования слайдов.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class StepOrder {

    protected static final Map<String, BaseStep> orderMap = new HashMap<>();

    static {
        orderMap.put(null, new Step1());
        orderMap.put(Step1.ID, new Step2());
        orderMap.put(Step2.ID, new Step3());
    }


    public static BaseStep nextStep(BaseStep current) {
        return orderMap.get(current.state);
    }

    public static BaseStep nextStep(String currentStepId) {
        return orderMap.get(currentStepId);
    }
}

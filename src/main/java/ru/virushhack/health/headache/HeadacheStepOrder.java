package ru.virushhack.health.headache;

import ru.virushhack.health.StepOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Порядок следования слайдов при головной боли.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class HeadacheStepOrder implements StepOrder {

    protected static final Map<String, BaseStep> orderMap = new HashMap<>();

    static {
        orderMap.put(null, new Step1());
        orderMap.put(Step1.ID, new Step2());
        orderMap.put(Step2.ID, new Step3());
        orderMap.put(Step3.ID, new Step4());
        orderMap.put(Step4.ID, new Step5());
        orderMap.put(Step5.ID, new Step6());
        orderMap.put(Step6.ID, new Step7());
        orderMap.put(Step7.ID, new Step8());
        orderMap.put(Step8.ID, new Step9());
        orderMap.put(Step9.ID, new Step10());
        orderMap.put(Step10.ID, new Step11());
        orderMap.put(Step11.ID, new Step12());
        orderMap.put(Step12.ID, new Step13());
        orderMap.put(Step13.ID, new Step14());
        orderMap.put(Step14.ID, new Step15());
        orderMap.put(Step15.ID, new Step16());
        orderMap.put(Step16.ID, new Step17());
        orderMap.put(Step17.ID, new Step18());
        orderMap.put(Step18.ID, new Step19());
        orderMap.put(Step19.ID, new Step20());
        orderMap.put(Step20.ID, new Step21());
        orderMap.put(Step21.ID, new Step22());
        orderMap.put(Step22.ID, new Step23());
        orderMap.put(Step23.ID, new Step24());
        orderMap.put(Step24.ID, new Step25());
        orderMap.put(Step25.ID, new Step26());
        orderMap.put(Step26.ID, new Step27());
        orderMap.put(Step27.ID, new Step28());
    }


    public BaseStep nextStep(BaseStep current) {
        return nextStep(current.nextState);
    }

    public BaseStep nextStep(String currentStepId) {
        return orderMap.get(currentStepId);
    }
}

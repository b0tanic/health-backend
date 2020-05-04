package ru.virushhack.health;

import ru.virushhack.health.headache.BaseStep;

/**
 * Порядок следования слайдов.
 *
 * @author Arsen Avalyan
 * @since 04.05.2020
 */
public interface StepOrder {

    BaseStep nextStep(BaseStep current);

    BaseStep nextStep(String currentStepId);
}

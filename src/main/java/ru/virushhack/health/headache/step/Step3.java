package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.EffectSelection;

/**
 *  Третий слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-8.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step3 extends BaseStep {

    public static final String ID = "STEP3";
    public static final String QUESTION = "Как меняется боль, если Вы наклоняетесь вперед?";

    public Step3() {
        super(ID, QUESTION, EffectSelection.values, false);
    }
}

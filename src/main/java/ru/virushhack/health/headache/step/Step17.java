package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Семнадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-23.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step17 extends BaseStep {

    public static final String ID = "STEP17";
    public static final String QUESTION = "У Вас есть проблемы (неприятные ощущения) во время жевания?";

    public Step17() {
        super(ID, QUESTION, "Проблемы при жевании", StandardSelection.values, false);
    }
}

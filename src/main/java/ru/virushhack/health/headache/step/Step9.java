package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Девятый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-15.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step9 extends BaseStep {

    public static final String ID = "STEP9";
    public static final String QUESTION = "У Вас была рвота?";

    public Step9() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

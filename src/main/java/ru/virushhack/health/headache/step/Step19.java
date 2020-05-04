package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Девятнадцатый слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-25.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step19 extends BaseStep {

    public static final String ID = "STEP19";
    public static final String QUESTION = "У Вас есть боль в руках, ладонях или пальцах? В любом из этих мест";

    public Step19() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

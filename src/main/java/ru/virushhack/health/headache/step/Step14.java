package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Четырнадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-20.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step14 extends BaseStep {

    public static final String ID = "STEP14";
    public static final String QUESTION = "У Вас есть боль в задней части шеи?";

    public Step14() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

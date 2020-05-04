package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать четвёртый слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-30.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step24 extends BaseStep {

    public static final String ID = "STEP24";
    public static final String QUESTION = "Вы чувствуете тошноту?";

    public Step24() {
        super(ID, QUESTION, "Тошнота", StandardSelection.values, false);
    }
}

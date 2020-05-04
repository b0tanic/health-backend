package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать пятый слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-31.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step25 extends BaseStep {

    public static final String ID = "STEP25";
    public static final String QUESTION = "У Вас есть покалывание или онемение в руках?";

    public Step25() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Восьмой слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-14.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step8 extends BaseStep {

    public static final String ID = "STEP8";
    public static final String QUESTION = "У тебя болит кожа головы при прикосновении или нажатии на нее?";

    public Step8() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

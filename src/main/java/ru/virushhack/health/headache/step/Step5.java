package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Пятый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-11.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step5 extends BaseStep {

    public static final String ID = "STEP5";
    public static final String QUESTION = "Твой висок болит, если коснуться его?";

    public Step5() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

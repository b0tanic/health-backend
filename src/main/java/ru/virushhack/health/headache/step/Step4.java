package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.PainSelection;

/**
 * Четвёртый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-10.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step4 extends BaseStep {

    public static final String ID = "STEP4";
    public static final String QUESTION = "Опиши остроту своей боли";

    public Step4() {
        super(ID, QUESTION, PainSelection.values, false);
    }
}

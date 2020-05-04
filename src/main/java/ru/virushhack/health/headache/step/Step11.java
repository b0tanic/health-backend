package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Одиннадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-17.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step11 extends BaseStep {

    public static final String ID = "STEP11";
    public static final String QUESTION = "Твое давление обычно (в настоящий момент) выше 140/90 ?";

    public Step11() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

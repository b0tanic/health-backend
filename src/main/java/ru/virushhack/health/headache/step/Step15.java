package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Пятнадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-21.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step15 extends BaseStep {

    public static final String ID = "STEP15";
    public static final String QUESTION = "У Вас есть затруднения (боль) во вращении или наклонах шеи/головы?";

    public Step15() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Шестнадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-22.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step16 extends BaseStep {

    public static final String ID = "STEP16";
    public static final String QUESTION = "У Вас есть (было) головокружение?";

    public Step16() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

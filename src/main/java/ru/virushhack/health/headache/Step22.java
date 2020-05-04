package ru.virushhack.health.headache;

import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать второй слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-28.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step22 extends BaseStep {

    public static final String ID = "STEP22";
    public static final String QUESTION = "У Вас были травмы шеи или головы до обнаружения первых симптомов?";

    public Step22() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

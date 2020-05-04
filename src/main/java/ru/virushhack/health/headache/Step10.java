package ru.virushhack.health.headache;

import ru.virushhack.health.selection.StandardSelection;

/**
 * Десятый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-16.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step10 extends BaseStep {

    public static final String ID = "STEP10";
    public static final String QUESTION = "У Вас есть насморк?";

    public Step10() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

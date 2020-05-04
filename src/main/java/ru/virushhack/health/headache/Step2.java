package ru.virushhack.health.headache;

import ru.virushhack.health.selection.SideSelection;

/**
 *  Второй слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-7.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step2 extends BaseStep {

    public static final String ID = "STEP2";
    public static final String QUESTION = "Головная боль в основном на одной или двух сторонах головы?";

    public Step2() {
        super(ID, QUESTION, SideSelection.values, false);
    }
}

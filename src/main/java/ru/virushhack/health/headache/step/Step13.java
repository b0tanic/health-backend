package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Тринадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-19.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step13 extends BaseStep {

    public static final String ID = "STEP13";
    public static final String QUESTION = "У Вас есть боль в шее? (от резкого движения или в принципе)";

    public Step13() {
        super(ID, QUESTION, "Боль в шее", StandardSelection.values, false);
    }
}

package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать седьмой слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-33.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step27 extends BaseStep {

    public static final String ID = "STEP27";
    public static final String QUESTION = "Ваша голова и шея большую часть времени наклонены? Например, вперед при работе за ноутбуком";

    public Step27() {
        super(ID, QUESTION, "Постоянно наклонены шея/голова", StandardSelection.values, false);
    }
}

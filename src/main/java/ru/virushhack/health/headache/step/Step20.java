package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцатый слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-26.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step20 extends BaseStep {

    public static final String ID = "STEP20";
    public static final String QUESTION = "У Вас была половая близость без использования средств контрацепции за последние 3 месяца?";

    public Step20() {
        super(ID, QUESTION, "Половая близость без контрацепции", StandardSelection.values, false);
    }
}

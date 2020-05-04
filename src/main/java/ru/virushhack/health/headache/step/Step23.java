package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать третий слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-29.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step23 extends BaseStep {

    public static final String ID = "STEP23";
    public static final String QUESTION = "У Вас повышенная температура тела? (выше 38)";

    public Step23() {
        super(ID, QUESTION, "Повышенная температура", StandardSelection.values, false);
    }
}

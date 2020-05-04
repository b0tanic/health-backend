package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Шестой слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-12.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step6 extends BaseStep {

    public static final String ID = "STEP6";
    public static final String QUESTION = "Была ли боль в глазах от яркого света?";

    public Step6() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

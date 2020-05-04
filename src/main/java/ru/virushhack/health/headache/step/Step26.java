package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.TingleSideSelection;

/**
 * Двадцать шестой слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-32.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step26 extends BaseStep {

    public static final String ID = "STEP26";
    public static final String QUESTION = "Это покалывание или онемение на одной стороне или двух?";

    public Step26() {
        super(ID, QUESTION, TingleSideSelection.values, false);
    }
}

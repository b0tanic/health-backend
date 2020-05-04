package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двенадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-18.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step12 extends BaseStep {

    public static final String ID = "STEP12";
    public static final String QUESTION = "Вы чувствуете себя истощенным? (например после сна, как будто не отдохнули   )";

    public Step12() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

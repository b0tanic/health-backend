package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.SymptomChangeSelection;

/**
 * Двадцать восьмой слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-34.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step28 extends BaseStep {

    public static final String ID = "STEP28";
    public static final String QUESTION = "Отлично, последний вопрос. Как Ваши симптомы менялись с течением времени?";

    public Step28() {
        super(ID, QUESTION, SymptomChangeSelection.values, true);
    }
}

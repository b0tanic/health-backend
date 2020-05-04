package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Двадцать первый слайд по голове
 * https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-27.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step21 extends BaseStep {

    public static final String ID = "STEP21";
    public static final String QUESTION = "У Вас есть боль в месте соединения верхней и нижней челюсти?";

    public Step21() {
        super(ID, QUESTION, "Боль между верхней и нижней челюстью", StandardSelection.values, false);
    }
}

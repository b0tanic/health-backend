package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Седьмой слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-13.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step7 extends BaseStep {

    public static final String ID = "STEP7";
    public static final String QUESTION = "Твоя челюсть напряжена так, что это слегка затрудняет ее открытие или вызывает напряжение?";

    public Step7() {
        super(ID, QUESTION, "Напряжена челюсть", StandardSelection.values, false);
    }
}

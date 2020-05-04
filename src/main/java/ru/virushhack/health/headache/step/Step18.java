package ru.virushhack.health.headache.step;

import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.selection.StandardSelection;

/**
 * Восемнадцатый слайд по голове https://www.figma.com/file/1BFhmiPivEP7so45bJ4Bak/dockduck?node-id=2%3A11 iphone 8-24.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class Step18 extends BaseStep {

    public static final String ID = "STEP18";
    public static final String QUESTION = "У Вас есть болезненные ощущения при прикосновении к любой части лица?";

    public Step18() {
        super(ID, QUESTION, StandardSelection.values, false);
    }
}

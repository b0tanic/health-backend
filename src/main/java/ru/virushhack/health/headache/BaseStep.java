package ru.virushhack.health.headache;

import ru.virushhack.health.selection.IdName;

import java.util.List;

/**
 * Базовый класс для описания слайда.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public abstract class BaseStep {

    public final String nextState;

    public final String question;

    public final String shortName;

    public final List<IdName> buttons;

    public final Boolean isFinal;

    protected BaseStep(String nextState, String question, String shortName, List<IdName> buttons, Boolean isFinal) {
        this.nextState = nextState;
        this.question = question;
        this.shortName = shortName;
        this.buttons = buttons;
        this.isFinal = isFinal;
    }
}

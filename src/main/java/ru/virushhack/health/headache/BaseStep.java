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

    public final String state;

    public final String question;

    public final List<IdName> buttons;

    public final Boolean isFinal;

    protected BaseStep(String state, String question, List<IdName> buttons, Boolean isFinal) {
        this.state = state;
        this.question = question;
        this.buttons = buttons;
        this.isFinal = isFinal;
    }
}

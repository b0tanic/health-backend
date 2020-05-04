package ru.virushhack.health.selection;

/**
 * Описывает группу значений (id, name, description).
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class IdNameDescription extends IdName {

    public final String description;

    public IdNameDescription(String id, String name, String description) {
        super(id, name);
        this.description = description;
    }
}

package ru.virushhack.health.headache.summary;

/**
 * Описание результата (итог) после ответов пациента.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public enum SummaryDescription {

    NOT_IMPORTANT (1, "Может вызвана неправильным образом жизни, ничего серьезного", "Людям с подобными симптомами не требуется срочная медицинская помощь."),

    NEED_CONSULTATION (2, "Проконсультируйтесь с врачом", "Людям с подобными симптомами может потребоваться медицинская помощь. Рекомендуем обратиться за консультацией.");

    public final int priority;
    public final String shortName;
    public final String description;

    SummaryDescription(int priority, String shortName, String description) {
        this.priority = priority;
        this.shortName = shortName;
        this.description = description;
    }
}

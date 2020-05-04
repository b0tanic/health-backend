package ru.virushhack.health.headache;

import ru.virushhack.health.Summary;

import java.util.ArrayList;
import java.util.Map;

/**
 * Определения предварительного диагноза при головной боли.
 *
 * @author Arsen Avalyan
 * @since 04.05.2020
 */
public class HeadacheSummary extends Summary {

    public static final String DESCRIPTION = "Людям с подобными симптомами не требуется срочная медицинская помощь.";

    public HeadacheSummary() {
        super(DESCRIPTION, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public Summary determine(Map<String, String> selections) {
        // TODO: 04.05.2020 Доделать
        return this;
    }
}

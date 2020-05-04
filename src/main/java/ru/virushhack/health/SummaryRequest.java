package ru.virushhack.health;

import java.util.Map;

/**
 * Формат запроса для определения диагноза.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
public class SummaryRequest {

    public String reason;
    public Map<String, String> selections;
}

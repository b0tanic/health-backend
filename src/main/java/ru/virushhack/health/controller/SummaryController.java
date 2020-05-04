package ru.virushhack.health.controller;

import org.springframework.web.bind.annotation.*;
import ru.virushhack.health.Summary;
import ru.virushhack.health.SummaryMap;

import java.util.Map;

/**
 * Контроллер для определения диагноза.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
@RestController
@RequestMapping("/summary")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SummaryController {

    @GetMapping
    public Summary determineSummary(
            @RequestParam String reason,
            @RequestParam Map<String, String> selections) {

        return SummaryMap.getSummary(reason).determine(selections);
    }
}

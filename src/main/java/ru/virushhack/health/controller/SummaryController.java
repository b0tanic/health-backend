package ru.virushhack.health.controller;

import org.springframework.web.bind.annotation.*;
import ru.virushhack.health.Summary;
import ru.virushhack.health.SummaryMap;
import ru.virushhack.health.SummaryRequest;

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

    @PostMapping
    public Summary determineSummary(@RequestBody SummaryRequest summaryRequest) {
        return SummaryMap.getSummary(summaryRequest.reason).determine(summaryRequest.selections);
    }
}

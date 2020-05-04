package ru.virushhack.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Контроллер для определения диагноза.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
@RestController
@RequestMapping("/summary")
public class SummaryController {

    @GetMapping
    public Summary determineSummary(
            @RequestParam String reason,
            @RequestParam Map<String, String> selections) {

        return SummaryMap.getSummary(reason).determine(selections);
    }
}

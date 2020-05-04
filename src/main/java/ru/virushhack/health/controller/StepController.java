package ru.virushhack.health.controller;

import org.springframework.web.bind.annotation.*;
import ru.virushhack.health.StepOrderMap;
import ru.virushhack.health.headache.BaseStep;

/**
 * Контроллер для переход между слайдами.
 *
 * @author Arsen Avalyan
 * @since 01.05.2020
 */
@RestController
@RequestMapping("/step")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StepController {

    @GetMapping (value = "/next")
    public BaseStep nextStep(
            @RequestParam (required = false) String state,
            @RequestParam String reason,
            @RequestParam (required = false) String select) {

        return StepOrderMap.stepOrder(reason).nextStep(state);
    }
}

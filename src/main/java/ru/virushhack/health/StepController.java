package ru.virushhack.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.virushhack.health.headache.BaseStep;
import ru.virushhack.health.headache.StepOrder;

/**
 * Контроллер для переход между слайдами.
 *
 * @author Arsen Avalyan
 * @since 01.05.2020
 */
@RestController
@RequestMapping("/step")
public class StepController {

    @GetMapping (value = "/next")
    public BaseStep nextStep(
            @RequestParam String state,
            @RequestParam String reason,
            @RequestParam String select) {

        return StepOrder.nextStep(state);
    }
}

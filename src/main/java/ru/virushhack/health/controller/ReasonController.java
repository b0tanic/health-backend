package ru.virushhack.health.controller;

import org.springframework.web.bind.annotation.*;
import ru.virushhack.health.DetailReasonMap;
import ru.virushhack.health.selection.GeneralReason;
import ru.virushhack.health.selection.IdName;
import ru.virushhack.health.selection.IdNameDescription;

import java.util.List;

/**
 * Контроллер для начальных симптомов.
 * В будущем можно возвращать кликабельное изображение человека.
 *
 * @author Arsen Avalyan
 * @since 03.05.2020
 */
@RestController
@RequestMapping("/reason")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReasonController {


    @GetMapping(value = "/all")
    public List<IdName> reasons() {
        return GeneralReason.values;
    }

    @GetMapping (value = "/detail")
    public List<IdNameDescription> reasons(@RequestParam String reason) {
        return DetailReasonMap.getDetailReason(reason);
    }
}

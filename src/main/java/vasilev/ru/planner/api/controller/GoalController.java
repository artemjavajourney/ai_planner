package vasilev.ru.planner.api.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import vasilev.ru.planner.api.service.GoalService;
import vasilev.ru.planner.core.dto.GoalDto;

@RestController
@RequestMapping("/api/goals")
@RequiredArgsConstructor
public class GoalController {

    private final GoalService goalService;

    @GetMapping
    public List<GoalDto> getAllGoals() {
        return goalService.getAllGoals();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GoalDto createGoal(@RequestBody GoalDto goalDto) {
        return goalService.createGoal(goalDto);
    }

}

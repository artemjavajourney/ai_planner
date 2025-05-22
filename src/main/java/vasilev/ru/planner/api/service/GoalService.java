package vasilev.ru.planner.api.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vasilev.ru.planner.core.domain.GoalEntity;
import vasilev.ru.planner.core.dto.GoalDto;
import vasilev.ru.planner.persistence.repository.GoalRepository;
import vasilev.ru.planner.persistence.mapper.GoalMapper;

@Service
@RequiredArgsConstructor
public class GoalService {

    private final GoalRepository goalRepository;

    public List<GoalDto> getAllGoals() {
    return goalRepository.findAll()
            .stream()
            .map(GoalMapper::toDto)
            .toList();
    }

    public GoalDto createGoal(GoalDto goalDto) {
        GoalEntity saved = goalRepository.save(GoalMapper.toEntity(goalDto));
        return GoalMapper.toDto(saved);
    }
}

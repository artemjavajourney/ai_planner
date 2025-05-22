package vasilev.ru.planner.persistence.mapper;

import vasilev.ru.planner.core.domain.GoalEntity;
import vasilev.ru.planner.core.dto.GoalDto;

public interface GoalMapper {

    static GoalDto toDto(GoalEntity goalEntity) {
        return new GoalDto();
    }

    static GoalEntity toEntity(GoalDto goalDto) {
        return new GoalEntity();
    }

}

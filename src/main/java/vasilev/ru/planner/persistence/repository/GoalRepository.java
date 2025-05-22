package vasilev.ru.planner.persistence.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vasilev.ru.planner.core.domain.GoalEntity;

@Repository
public interface GoalRepository extends JpaRepository<GoalEntity, UUID> {
}

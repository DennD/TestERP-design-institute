package ru.oskin_di.TestERPdesigninstitute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.oskin_di.TestERPdesigninstitute.models.WorkTask;

import java.util.List;

@Repository
public interface WorkTaskRepository extends JpaRepository<WorkTask, Integer> {

    List<WorkTask> findAllByInProgress(boolean inProgress);

}

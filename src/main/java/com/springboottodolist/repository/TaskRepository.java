package com.springboottodolist.repository;

import com.springboottodolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findTaskById(Long id);

}

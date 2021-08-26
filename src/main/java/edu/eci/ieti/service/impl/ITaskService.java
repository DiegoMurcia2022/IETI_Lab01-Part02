package edu.eci.ieti.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import edu.eci.ieti.data.Task;
import edu.eci.ieti.service.TaskService;

@Service
public class ITaskService implements TaskService {
    private final HashMap<String, Task> tasks;
    private static final AtomicInteger TASK_ID_GENERATOR = new AtomicInteger(1);

    public ITaskService() {
        this.tasks = new HashMap<>();
    }

    @Override
    public Task create(Task task) {
        task.setId(String.valueOf(TASK_ID_GENERATOR.getAndIncrement()));
        tasks.put(task.getId(), task);

        return task;
    }

    @Override
    public Task findById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public void deleteById(String id) {
        tasks.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        task.setId(id);
        tasks.replace(id, task);

        return task;
    }
}

package edu.eci.ieti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.data.Task;
import edu.eci.ieti.dto.TaskDto;
import edu.eci.ieti.service.TaskService;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all() {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.all());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(taskService.create(new Task(taskDto)));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(taskService.update(new Task(taskDto), id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        try {
            taskService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false);
        }
    }
}

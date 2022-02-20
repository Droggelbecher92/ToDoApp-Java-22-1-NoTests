package de.kittlaus.notesttodo.todoapp.controller;


import de.kittlaus.notesttodo.todoapp.model.ToDoItem;
import de.kittlaus.notesttodo.todoapp.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<ToDoItem> getAllTodos(){
        return toDoService.returnAllToDos();
    }

    @PostMapping
    public ToDoItem postNewToDo(@RequestBody ToDoItem itemtoAdd){
        return toDoService.saveNewToDo(itemtoAdd);
    }

    @GetMapping("/{id}")
    public ToDoItem getToDoById(@PathVariable String id){
        return toDoService.findToDoById(id);
    }

    @PatchMapping()
    public ToDoItem putUpdateForToDoStatus(@RequestBody ToDoItem itemToChange){
        return toDoService.advanceToDo(itemToChange);
    }

    @DeleteMapping("/{id}")
    public ToDoItem deleteToDoById(@PathVariable String idToDelete){
        return toDoService.deleteToDo(idToDelete);
    }
}

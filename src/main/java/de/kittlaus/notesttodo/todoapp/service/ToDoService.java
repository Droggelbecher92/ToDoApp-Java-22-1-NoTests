package de.kittlaus.notesttodo.todoapp.service;

import de.kittlaus.notesttodo.todoapp.model.ToDoItem;
import de.kittlaus.notesttodo.todoapp.repo.ToDoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepo toDoRepo;


    public ToDoService(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public List<ToDoItem> returnAllToDos() {
        return toDoRepo.returnAll();
    }

    public ToDoItem saveNewToDo(ToDoItem itemtoAdd) {
        return toDoRepo.addToDo(itemtoAdd);
    }

    public ToDoItem findToDoById(String id) {
        return toDoRepo.findByID(id).orElseThrow(() -> new IllegalArgumentException("No ToDo found with ID: "+id));
    }

    public ToDoItem advanceToDo(ToDoItem itemToChange) {
        ToDoItem advancedItem = itemToChange;
        advancedItem.setStatus(advancedItem.getStatus().advance());
        return toDoRepo.updateToDo(advancedItem);
    }

    public ToDoItem deleteToDo(String idToDelete) {
        return toDoRepo.removeToDo(idToDelete);
    }

}

package de.kittlaus.notesttodo.todoapp.controller;

import de.kittlaus.notesttodo.todoapp.model.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;


/*
    ToDo: - teste ob ein ToDoItem richtig hinzugefügt wird
    ToDo: - teste ob alle ToDoItems als liste zurückgegeben werden
    ToDo: - teste ob ein ToDoItem anhand der ID gefunden wird
    ToDo: - teste ob du den Status eines ToDoItems ändern kannst
    ToDo: - teste ob du ein ToDoItem löschen kannst
     */

@SpringBootTest
class ToDoControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    //Test-Objekte

    final private ToDoItem toDoItem1 = new ToDoItem("Wäsche waschen");
    final private ToDoItem toDoItem2 = new ToDoItem("Tests schreiben");



}
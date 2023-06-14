package com.example.vacationnew;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HelloController {

    public ListView listView = new ListView<>();

    public void action(ActionEvent event) throws IOException {
        Scanner enter = new Scanner
                (new FileReader("src/main/resources/com/example/vacationnew/myTask.txt")).useDelimiter(",\\n");
        StringBuilder data = new StringBuilder();
        {
            while (enter.hasNext()) {
                data
                        .append(enter.next());
                listView.getItems().add(data);
            }
        }
        enter.close();
    }
}
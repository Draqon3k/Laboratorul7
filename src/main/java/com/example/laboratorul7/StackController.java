package com.example.laboratorul7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Stack;

public class StackController {
    @FXML
    private TextField inputField;
    @FXML
    private Label outputField;

    @FXML
    private void initialize() {
        // Aici puteți face inițializări suplimentare, dacă este necesar
    }

    @FXML
    private void reverseText() {
        String input = inputField.getText();
        Stack<Character> stack = new Stack<>();

        // Adăugăm caracterele în stiva stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Construim șirul inversat folosind stiva stack
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Afisăm șirul inversat în câmpul de ieșire
        outputField.setText(reversed.toString());
    }
}

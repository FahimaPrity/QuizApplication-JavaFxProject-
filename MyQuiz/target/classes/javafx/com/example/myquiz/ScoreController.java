package com.example.myquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class ScoreController {

    @FXML
    public Label marks, markstext, wrongtext, correcttext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    // Add the submit button handler
    @FXML
    public void submitClicked(ActionEvent event) {
        // Close the application
        Stage stage = (Stage) marks.getScene().getWindow();
        stage.close();
    }

    public void initialize(int correctCount, int wrongCount) {
        System.out.println("ScoreController initialized with correct count: " + correctCount + ", wrong count: " + wrongCount);
        // Update the correct and wrong counts
        int correct = correctCount;
        int wrong = wrongCount;

        // Update the labels and progress indicators
        correcttext.setText("Correct Answers : " + correctCount);
        wrongtext.setText("Wrong Answers : " + wrongCount);
        marks.setText(correctCount + "/10");
        correct_progress.setProgress((double) correctCount / 10);
        wrong_progress.setProgress((double) wrongCount / 10);
    }
}

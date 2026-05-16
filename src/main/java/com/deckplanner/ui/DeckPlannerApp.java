package com.deckplanner.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX entry point.
 */
public class DeckPlannerApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Deck Planner");
        stage.setScene(new Scene(new StackPane(), 640, 480));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

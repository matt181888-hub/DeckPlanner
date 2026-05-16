package com.deckplanner.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX entry point — bootstraps the runtime and shows the primary window.
 */
public class DeckPlannerApp extends Application 
{

    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOW_HEIGHT = 720;

    @Override
    public void start(Stage stage) 
    {
        stage.setTitle("Deck Planner");

        MainWindowView main_window = new MainWindowView();
        Scene scene = new Scene(main_window.get_root(), WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}

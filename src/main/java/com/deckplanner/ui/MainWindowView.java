package com.deckplanner.ui;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Main window layout: toolbar area (top), canvas area (center), status area (bottom).
 * Phase 1.2 — structure only; canvas and controls come in later milestones.
 */
public class MainWindowView 
{

    private final BorderPane root = new BorderPane();

    public MainWindowView() 
    {
        Pane top_placeholder = new Pane();
        Pane center_placeholder = new Pane();
        Pane bottom_placeholder = new Pane();

        root.setTop(top_placeholder);
        root.setCenter(center_placeholder);
        root.setBottom(bottom_placeholder);
    }

    public Parent get_root() 
    {
        return root;
    }

    /** Center region where the drawing canvas will live (Phase 3+). */
    public Pane get_canvas_placeholder() 
    {
        return (Pane) root.getCenter();
    }
}

package com.myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class for the Mobile Phone Display application.
 * This class is responsible for initializing the primary stage and 
 * displaying the main view of the application.
 */
public class MainApp extends Application {

    /**
     * This method is called when the application starts.
     * It sets up the primary stage, loads the main view 
     * from the FXML file, and shows the stage.
     *
     * @param primaryStage the primary stage of the application.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the main view layout from the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("MobilePhoneView.fxml"));
        
        // Set the title for the main window
        primaryStage.setTitle("Mobile Phone Display");
        
        // Set the scene (layout) for the main window
        primaryStage.setScene(new Scene(root, 300, 150));
        
        // Display the main window
        primaryStage.show();
    }

    /**
     * The main entry point for the application.
     * It launches the JavaFX application.
     *
     * @param args command line arguments, if any.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

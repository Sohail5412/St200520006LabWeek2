package com.myapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.myapp.model.MobilePhone; // Ensure to import the MobilePhone model class

/**
 * Controller for the MobilePhone view.
 */
public class MobilePhoneController {

    // Label in the view to display phone details
    @FXML
    private Label phoneLabel;

    /**
     * Initializes the controller after the view's elements are fully loaded.
     * Sets up the phone details on the label.
     */
    public void initialize() {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 13", 128);
        phoneLabel.setText(phone.toString());
    }
}


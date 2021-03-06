/*
 * Author: Taylor Vories
 * WGU C482 Project
 * This class is an alert helper class to be shared between controllers.
 */
package C482.View_Controller;

import javafx.scene.control.Alert;

public class Alerts {
    /**
     * Pops up an error alert with whatever message is provided.
     * @param message String message to go into the content text of the alert box.
     */
    static void warningAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning!");
        alert.setHeaderText("There may be an issue.");
        alert.setContentText(message);
        alert.showAndWait();
    }
}

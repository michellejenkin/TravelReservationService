package controller.ownercontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class OwnerHomeController {

    //  THINK WE NEED TO ADD ANOTHER BUTTON THAT SAYS RATE, OR HOW ELSE WILL WE GET TO THAT PAGE?
    @FXML
    private Button addPropertyButton, removePropertyButton, logOutButton;

    @FXML
    void addProperty(ActionEvent event) throws IOException {
        // load owner add property
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/owneraddpropertyscreen.fxml"));
        Stage stage = (Stage) addPropertyButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void removeProperty(ActionEvent event) throws IOException {
        // load remove property
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/ownerremovepropertyscreen.fxml"));
        Stage stage = (Stage) removePropertyButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void logOut(ActionEvent event) throws IOException {
        // load login screen
        Parent root = FXMLLoader.load(getClass().getResource("../../fxml/loginscreen.fxml"));
        Stage stage = (Stage) logOutButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}

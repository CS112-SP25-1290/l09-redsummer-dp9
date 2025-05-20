package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {
    @FXML private Button cityStateButton;
    @FXML private Button otherCityStateButton;

    @FXML private void handleCityStateButton(ActionEvent event) {
    System.out.println("CityState button clicked");
    // Open event-view.fxml in a new window

    FXMLLoader loader = new FXMLLoader(getClass().getResource("/cs112/lab09/event-view.fxml"));
    Parent popupRoot = loader.load();

    EventController controller = loader.getController();
    controller.initData("New York", new RevisedHistoricalEvent());

    Stage popupStage = new Stage();
    popupStage.setTitle("Event Window");
    popupStage.initModality(Modality.APPLICATION_MODAL);
    popupStage.setScene(new Scene(popupRoot));
    popupStage.show();  
}

@FXML private void handleOtherCityStateButton(ActionEvent event) {
    System.out.println("Other CityState button clicked");
    // Open event-view.fxml in a new window
}

}

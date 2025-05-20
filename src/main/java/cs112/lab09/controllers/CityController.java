package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {
    @FXML private Label locationLabel;
    @FXML private Label dateLabel;
    @FXML private Label descriptionLabel;
    @FXML private Label revisedDescriptionLabel;
    @FXML private Hyperlink citationHyperlink;
    @FXML private Button closeButton;
    @FXML private ImageView eventImageView;

    @FXML private void handleCloseButton(ActionEvent event) {
    System.out.println("Close button clicked");
    // Close the popup window


}

    private String location;
    private RevisedHistoricalEvent event;

public void initData(String location, RevisedHistoricalEvent event) {
    this.location = location;
    this.event = event;

    locationLabel.setText(location);
    dateLabel.setText(event.getDate());
    descriptionLabel.setText(event.getDescription());
    revisedDescriptionLabel.setText(event.getRevisedDescription());
    citationHyperlink.setText(event.getCitation());
    // eventImageView.setImage(new Image(...)); // optional

}

}

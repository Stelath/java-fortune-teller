
/**
 * Write a description of class FortuneTeller here.
 *
 * @author Alex Korte
 * @version 1/14/2021
 */

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class FortuneTeller extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Fortune Teller");

        // Create JavaFX elements
        ImageView fortuneCookieImage = new ImageView(new Image("/FortuneCookie.jpeg"));
        Button getFortuneButton = new Button("Get Fortune");
        Label fortuneLabel = new Label("Click \"Get Fortune\" to recive a fortune!");

        // Event Handlers
        EventHandler<ActionEvent> fortuneButtonEvent = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                // Create array for fortunes
                String[] fortunes = new String[12];

                // Loads fortunes into array
                fortunes[0] = "Enjoy while you can...";
                fortunes[1] = "You will gain wealth this month";
                fortunes[2] = "Run";
                fortunes[3] = "You will find happiness in ducks";
                fortunes[4] = "You will lose wealth this month";
                fortunes[5] = "Your thesis statement could be better";
                fortunes[6] = "Something hidden will make itself known";
                fortunes[7] = "Tomorrow you will have a good day";
                fortunes[8] = "You have at your command the wisdom of the boomers";
                fortunes[9] = "You are the crispy noodle in the vegetarian salad of life.";
                fortunes[10] = "A dubious friend may be an enemy in camoflauge";
                fortunes[11] = "Will have friends";

                // Randomly chooses an index from the array
                int rand = (int)(Math.random() * fortunes.length);

                // Changes label to a random fortune
                fortuneLabel.setText(fortunes[rand]);
            }
        };

        // When button is pressed
        getFortuneButton.setOnAction(fortuneButtonEvent);

        VBox vBox = new VBox();
        vBox.setSpacing(30);

        // Add JavaFX elements to VBox layout
        vBox.getChildren().add(fortuneCookieImage);
        vBox.getChildren().add(fortuneLabel);
        vBox.getChildren().add(getFortuneButton);

        vBox.setAlignment(Pos.CENTER);

        fortuneLabel.setTextAlignment(TextAlignment.CENTER);

        Scene scene = new Scene(vBox, 400, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
    }
}

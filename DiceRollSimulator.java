import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class DiceRollSimulator extends Application
{
    private ImageView viewDice1 = new ImageView();
    private ImageView viewDice2 = new ImageView();
    private Label resultDice;
    private Label message1;
    private Label message2;

    public static void main(String[] args)
    {
        // launch application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Dice Simulator");
        Label message1 = new Label("Hello and Welcome to the Dice Simulator");
        Label message2 = new Label ("To get started please hit start to roll the dice.");

        resultDice = new Label();
        Button startButton = new Button("Start");

        startButton.setOnAction(new StartButtonHandler());

        HBox hbox = new HBox (10, viewDice1, viewDice2);

        VBox vbox = new VBox (10, message1, message2, startButton, hbox, resultDice);
        vbox.setPadding(new Insets(15));
        vbox.setAlignment(Pos.CENTER);

        Scene simScene = new Scene(vbox);
        primaryStage.setScene(simScene);
        primaryStage.show();
    }

    class StartButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {
            int num1 = 0;
            int num2 = 0;
            Image dicePic1;
            Image dicePic2;

            DiceRoll dice1 = new DiceRoll();
            DiceRoll dice2 = new DiceRoll();
            dice1.roll();
            dice2.roll();
            num1 = dice1.getRoll();
            num2 = dice2.getRoll();

            DiceImages image1 = new DiceImages();
            DiceImages image2 = new DiceImages();
            image1.setDiceImage(num1);
            image2.setDiceImage(num2);
            dicePic1 = image1.getDiceImage();
            dicePic2 = image2.getDiceImage();

            viewDice1 = new ImageView(dicePic1);
            viewDice2 = new ImageView(dicePic2);

            resultDice.setText("You rolled a " + num1 + " and " + num2 + "!");
        }
    }
}

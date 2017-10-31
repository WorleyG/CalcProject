package program;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Calculator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(50, 50, 50, 50));
        //number buttons
        Button[] numberButtons = new Button[10];
        for (int i =1; i < 10; i++ ){
            numberButtons[i] = new Button();
            numberButtons[i].setText(Integer.toString(i));
        }

        positionNumberButtons(grid, numberButtons);

        //operation buttons
        Button divButton = new Button("/");
        Button plusButton = new Button("+");
        Button minusButton = new Button("-");
        Button multiButton = new Button("*");
        Button openParButton = new Button ("(");
        Button closedParButton = new Button (")");
        Button equalsButton = new Button ("=");

        //positioning operation buttons
        grid.add(divButton, 3,1);
        grid.add(plusButton, 3,2);
        grid.add(minusButton, 3,3);
        grid.add(multiButton, 0,4);
        grid.add(openParButton, 1,4);
        grid.add(closedParButton, 2,4);
        grid.add(equalsButton, 3,4);

        //creating and adding display
        TextField screen = new TextField();
        screen.setEditable(false);
        grid.add(screen,0,0,4,1);

        Scene scene = new Scene(grid, 250, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void positionNumberButtons(GridPane grid, Button[] numberButtons ){

        grid.add(numberButtons[1], 0, 3);
        grid.add(numberButtons[2], 1, 3);
        grid.add(numberButtons[3], 2, 3);
        grid.add(numberButtons[4], 0, 2);
        grid.add(numberButtons[5], 1, 2);
        grid.add(numberButtons[6], 2, 2);
        grid.add(numberButtons[7], 0, 1);
        grid.add(numberButtons[8], 1, 1);
        grid.add(numberButtons[9], 2, 1);

    }
}

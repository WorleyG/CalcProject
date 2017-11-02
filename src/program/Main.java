package program;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Main extends Application {

    public static StringBuilder equation = new StringBuilder();

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
        for (int i =0; i < 10; i++ ){
            numberButtons[i] = new Button();
            numberButtons[i].setText(Integer.toString(i));
        }

        //creating and adding display
        TextField screen = new TextField();
        screen.setEditable(false);
        grid.add(screen,0,0,5,1);

        //adding button actions
        opButtonsSetup(grid, screen);
        numberButtonSetup(grid, screen, numberButtons);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


    public void numberButtonSetup(GridPane grid, TextField screen, Button[] numberButtons){

        grid.add(numberButtons[0],0,4);
        grid.add(numberButtons[1], 0, 3);
        grid.add(numberButtons[2], 1, 3);
        grid.add(numberButtons[3], 2, 3);
        grid.add(numberButtons[4], 0, 2);
        grid.add(numberButtons[5], 1, 2);
        grid.add(numberButtons[6], 2, 2);
        grid.add(numberButtons[7], 0, 1);
        grid.add(numberButtons[8], 1, 1);
        grid.add(numberButtons[9], 2, 1);

        numberButtons[0].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText("0");
                Main.equation.append(numberButtons[0].getText());
            }
        });

        numberButtons[1].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[1].getText());
                Main.equation.append(numberButtons[1].getText());

            }
        });

        numberButtons[2].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[2].getText());
                Main.equation.append(numberButtons[2].getText());
            }
        });

        numberButtons[3].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[3].getText());
                Main.equation.append(numberButtons[3].getText());
            }
        });

        numberButtons[4].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[4].getText());
                Main.equation.append(numberButtons[4].getText());
            }
        });

        numberButtons[5].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[5].getText());
                Main.equation.append(numberButtons[5].getText());
            }
        });

        numberButtons[6].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[6].getText());
                Main.equation.append(numberButtons[6].getText());
            }
        });

        numberButtons[7].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[7].getText());
                Main.equation.append(numberButtons[7].getText());
            }
        });

        numberButtons[8].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[8].getText());
                Main.equation.append(numberButtons[8].getText());
            }
        });

        numberButtons[9].setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(numberButtons[9].getText());
                Main.equation.append(numberButtons[9].getText());
            }
        });
    }

    public void opButtonsSetup(GridPane grid, TextField screen){
        //operation buttons
        Button divButton = new Button("/");
        Button plusButton = new Button("+");
        Button minusButton = new Button("-");
        Button multiButton = new Button("*");
        Button powerButton = new Button("^");
        Button openParButton = new Button ("(");
        Button closedParButton = new Button (")");
        Button equalsButton = new Button ("=");
        Button clearButton = new Button ("cl");

        //positioning operation buttons
        grid.add(divButton, 3,1);
        grid.add(plusButton, 3,2);
        grid.add(minusButton, 3,3);
        grid.add(multiButton, 1,4);
        grid.add(openParButton, 2,4);
        grid.add(closedParButton, 3,4);
        grid.add(powerButton,4,3);
        grid.add(equalsButton, 4,4);
        grid.add(clearButton,4,1);


        divButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(divButton.getText());
                Main.equation.append(divButton.getText());
            }
        });
        plusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(plusButton.getText());
                Main.equation.append(plusButton.getText());
            }
        });
        minusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(minusButton.getText());
                Main.equation.append(minusButton.getText());
            }
        });
        multiButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(multiButton.getText());
                Main.equation.append(multiButton.getText());
            }
        });
        openParButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(openParButton.getText());
                Main.equation.append(openParButton.getText());
            }
        });
        closedParButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(closedParButton.getText());
                Main.equation.append(closedParButton.getText());
            }
        });
        powerButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.appendText(powerButton.getText());
                Main.equation.append(powerButton.getText());
            }
        });
        equalsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //replacing karat with format that works for js engine eval
                for (int i = 0; i < (Main.equation.toString().length());i++){
                    if(Main.equation.charAt(i) == '^'){
                        Main.equation.replace((i-1),(i+2),
                                                "Math.pow("
                                                    + Main.equation.charAt(i-1) + ","
                                                    + Main.equation.charAt(i+1) + ")");
                    }
                }

                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                try {
                    Object result = engine.eval(Main.equation.toString());
                    screen.clear();
                    screen.appendText(result.toString());

                    Main.equation.delete(0, Main.equation.length());
                } catch(javax.script.ScriptException e){
                    screen.clear();
                    screen.appendText("Incorrect input");
                }
            }
        });
        clearButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                screen.clear();
                Main.equation.delete(0,Main.equation.length());
            }
        });
    }
}

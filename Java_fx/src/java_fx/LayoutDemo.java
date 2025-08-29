/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_fx;

/**
 *
 * @author wildflower
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        // ---------- FLOWPANE ----------
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setPadding(new Insets(10));
        flowPane.getChildren().addAll(
                new Button("Flow 1"),
                new Button("Flow 2"),
                new Button("Flow 3"),
                new Button("Flow 4")
        );

        // ---------- HBOX ----------
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(10));
        hbox.getChildren().addAll(
                new Button("HBox 1"),
                new Button("HBox 2"),
                new Button("HBox 3")
        );

        // ---------- VBOX ----------
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(
                new Button("VBox 1"),
                new Button("VBox 2"),
                new Button("VBox 3")
        );

        // ---------- GRIDPANE ----------
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(new Button("Grid 0,0"), 0, 0);
        gridPane.add(new Button("Grid 1,0"), 1, 0);
        gridPane.add(new Button("Grid 0,1"), 0, 1);
        gridPane.add(new Button("Grid 1,1"), 1, 1);

        // ---------- BORDERPANE ----------
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hbox);
        borderPane.setBottom(vbox);
        borderPane.setCenter(gridPane);
        borderPane.setRight(flowPane);

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setTitle("JavaFX Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
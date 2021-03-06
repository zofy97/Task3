/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author s0559289
 */
public class TextEditor extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().add(new Label("Enter message:"));
        TextArea textArea = new TextArea();
        
        root.getChildren().add(textArea);
        
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        Menu helpMenu = new Menu("Help");
        
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem saveAsItem = new MenuItem("Save as");
        MenuItem exitItem = new MenuItem("Exit");
        
        
        fileMenu.getItems().addAll(newItem, openFileItem, saveAsItem, exitItem);
        
        menuBar.getMenus().addAll(fileMenu, helpMenu);
        
        BorderPane root1 = new BorderPane();
        root1.setTop(menuBar);
        root1.setCenter(textArea);
        
        Scene scene = new Scene(root1, 300, 150);
        
        stage.setTitle("Text Editor");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}

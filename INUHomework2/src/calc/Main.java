package calc;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage primaryStage;
    private GridPane rootLayout;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Calculator");
        
        initRootLayout();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void initRootLayout() {
	    try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Calc.fxml"));
            rootLayout = (GridPane) loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	    }
}

package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	 
	Stage window;
    Scene scene1, scene2;
    
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("TipView.fxml"));
			Scene scene = new Scene(root,800,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFX Project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			}	        
	    }

	public static void main(String[] args) {
		launch(args);
	}	
}
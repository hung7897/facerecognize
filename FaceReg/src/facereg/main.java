/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facereg;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try
		{
                        
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
			BorderPane root = (BorderPane) loader.load();
			// set a whitesmoke background
			root.setStyle("-fx-background-color: whitesmoke;");
			// create and style a scene
			Scene scene = new Scene(root, 800, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// create the stage with the given title and the previously created
			// scene
			stage.setTitle("Face Detection and Tracking");
			stage.setScene(scene);
			// show the GUI
			stage.show();
			
			// init the controller
			FXController controller = loader.getController();
			controller.init();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		// load the native OpenCV library
		//System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.load("D:\\ANM\\New folder\\opencv\\build\\java\\x64\\opencv_java310.dll");
		launch(args);
	}
    
}

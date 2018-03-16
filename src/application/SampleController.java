package application;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

// TODO: Auto-generated Javadoc
/**
 * The Class SampleController.
 */
public class SampleController {
	
	/** The primary stage. */
	Stage primaryStage;

	/** The btn salida. */
	@FXML
	private Button btnSalida;

	/**
	 * Cerrar.
	 *
	 * @param event the event
	 */
	@FXML
	void cerrar(MouseEvent event) {
		System.exit(0);
	}

	/**
	 * Emergente.
	 *
	 * @param event the event
	 */
	@FXML
	void emergente(MouseEvent event) {

		try {
			abreVentana();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	/**
	 * Abre ventana.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void abreVentana() throws IOException {
		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/Second.fxml"));
			AnchorPane root1 = (AnchorPane) fxmlLoader.load();

			Stage stage = new Stage();
			Window stagePrincipal = null;
			stage.initOwner(stagePrincipal);
			Scene scene = new Scene(root1);
			
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {

		}
	}

	/**
	 * Cerrar emergente.
	 *
	 * @param event the event
	 */
	@FXML
	void cerrarEmergente(MouseEvent event) {

		Stage thisStage = (Stage) btnSalida.getScene().getWindow();
		thisStage.close();
	}
}


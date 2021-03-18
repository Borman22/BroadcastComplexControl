package tv.sonce;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

//        var label = new Label("Hello, JavaFX");
//
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce16.png")));
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce32.png")));
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce64.png")));
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce128.png")));
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce256.png")));
//        stage.getIcons().add(new Image(getClass().getResourceAsStream("/sonce512.png")));
//
//        StackPane stackPane = new StackPane();
//        stackPane.getChildren().add(label);
//        label.setAlignment(Pos.BOTTOM_RIGHT);
//        var scene = new Scene(stackPane, 640, 480);
//        stage.setScene(scene);
//        stage.show();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scene.fxml"));
        Parent root = loader.load();

        MainController mainController = loader.getController();


        stage.setScene(new Scene(root));
        stage.show();
    }

    void run(String[] args) {
        launch();
    }

}
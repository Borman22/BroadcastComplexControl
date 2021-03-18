package tv.sonce;

import javafx.scene.control.Button;

public class MainController {


  public Button mainButton;

  public void buttonClicked() {
    System.out.println("Button clicked!");
    mainButton.setText("Новый текст");
    System.out.println(mainButton);
  }

}

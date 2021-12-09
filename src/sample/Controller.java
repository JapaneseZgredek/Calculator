package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero, buttonDot, buttonEqual, buttonPlus, buttonMinus, buttonTimes, buttonDivide;
    public void setButtonOne(){
        textField.setText(textField.getText() + buttonOne.getText());
    }
}

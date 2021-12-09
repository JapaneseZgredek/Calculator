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
    public void setButtonTwo(){
        textField.setText(textField.getText() + buttonTwo.getText());
    }
    public void setButtonThree(){
        textField.setText(textField.getText() + buttonThree.getText());
    }
    public void setButtonFour(){
        textField.setText(textField.getText() + buttonFour.getText());
    }
    public void setButtonFive(){
        textField.setText(textField.getText() + buttonFive.getText());
    }
    public void setButtonSix(){
        textField.setText(textField.getText() + buttonSix.getText());
    }
    public void setButtonSeven(){
        textField.setText(textField.getText() + buttonSeven.getText());
    }
    public void setButtonEight(){
        textField.setText(textField.getText() + buttonEight.getText());
    }
    public void setButtonNine(){
        textField.setText(textField.getText() + buttonNine.getText());
    }
    public void setButtonZero(){
        textField.setText(textField.getText() + buttonZero.getText());
    }
}

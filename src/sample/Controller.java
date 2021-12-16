package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Stack;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero, buttonDot, buttonEqual, buttonPlus, buttonMinus, buttonTimes, buttonDivide, buttonClearLast;
    Stack<String> last = new Stack<>();
    char operation;
    double numberOne;
    boolean operatorClicked = false;
    public void setButtonOne(){
        numericButtons(buttonOne);
    }
    public void setButtonTwo(){
        numericButtons(buttonTwo);
    }
    public void setButtonThree(){
        numericButtons(buttonThree);
    }
    public void setButtonFour(){
        numericButtons(buttonFour);
    }
    public void setButtonFive(){
        numericButtons(buttonFive);
    }
    public void setButtonSix(){
        numericButtons(buttonSix);
    }
    public void setButtonSeven(){
        numericButtons(buttonSeven);
    }
    public void setButtonEight(){
        numericButtons(buttonEight);
    }
    public void setButtonNine(){
        numericButtons(buttonNine);
    }
    public void setButtonZero(){
        numericButtons(buttonZero);
    }
    public void setButtonPlus(){
        operation = buttonPlus.getText().charAt(0);
        numberOne = Double.parseDouble(textField.getText());
        textField.setText("");
    }
    public void setButtonEqual(){
        numberOne = mathematicAction(numberOne,Double.parseDouble(textField.getText()),operation);
        textField.setText(Double.toString(numberOne));
    }
    public void setButtonClearLast(){
        textField.setText(last.pop());
        if(last.empty()) {
            buttonClearLast.setDisable(true);
            buttonZero.setDisable(true);
            textField.setText("");
        }
        if(!textField.getText().contains("."))
            buttonDot.setDisable(false);
    }
    public void setButtonDot(){
        if(last.empty()){
            textField.setText(buttonZero.getText() + buttonDot.getText());
            last.push(textField.getText());
        }else{
            last.push(textField.getText());
            textField.setText(textField.getText() + buttonDot.getText());
        }
        buttonClearLast.setDisable(false);
        buttonDot.setDisable(true);
    }
    public void numericButtons(Button button){
        last.push(textField.getText());
        textField.setText(textField.getText() + button.getText());
        buttonClearLast.setDisable(false);
        buttonZero.setDisable(false);
    }
    public double mathematicAction(double numberOne, double numberTwo, char operation){
        switch (operation){
            case '+':
                numberOne = numberOne + numberTwo;
            break;
            case '-':
                numberOne = numberOne - numberTwo;
            break;
            case '*':
                numberOne = numberOne * numberTwo;
            break;
            case '/':
                numberOne = numberOne / numberTwo;
            break;
        }
        return numberOne;
    }
}

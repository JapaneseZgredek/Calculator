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
    double numberOne, numberTwo;
    boolean equalClicked = false;
    char operation;
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
        buttonsMathematicAction(buttonPlus);
    }
    public void setButtonMinus(){
        buttonsMathematicAction(buttonPlus);
    }
    public void setButtonTimes(){
        buttonsMathematicAction(buttonTimes);
    }
    public void setButtonDivide(){
        buttonsMathematicAction(buttonDivide);
    }
    public void setButtonEqual(){
        checkingNumberOne();
        equalClicked = true;
    }
    public void buttonsMathematicAction(Button button){
        if(!equalClicked)
            buttonsOperations();
        equalClicked = false;
        operation = button.getText().charAt(0);
        last.clear();
        buttonZero.setDisable(true);
        textField.setText("");
        buttonEqual.setDisable(false);
    }
    public void buttonsOperations(){
        if(numberOne != 0){
            if(!equalClicked){
                numberTwo = Double.parseDouble(textField.getText());
            }            numberOne = mathematicAction(numberOne, numberTwo);
        }else{
            numberOne = Double.parseDouble(textField.getText());
        }
    }

    public void checkingNumberOne(){
        if(numberOne != 0){
            if(!equalClicked){
                numberTwo = Double.parseDouble(textField.getText());
            }
            numberOne = mathematicAction(numberOne,numberTwo);
        }else{
            numberOne = Double.parseDouble(textField.getText());
        }
        textField.setText(String.valueOf(numberOne));
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
    public double mathematicAction(double numberOne, double numberTwo){
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

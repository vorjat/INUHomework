package calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcController {
	@FXML
	Label screen;
	Button button0;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	Button button7;
	Button button8;
	Button button9;
	Button buttonP;
	Button buttonM;
	Button buttonR;
	Button buttonD;
	Button calcButton;
	Button clearButton;

	String operator = "";

	double num1 = 0;
	double num2 = 0;
	double wynik;
	String wynikS = "";

	@FXML
	private void numberButtonClick(ActionEvent event) {

		if (screen.getText().equals("0")) {
			screen.setText("");
		}

		if (event.getSource().toString().equals("Button[id=button0, styleClass=button]'0'")) {
			screen.setText(screen.getText() + "0");
		} else if ((event.getSource().toString().equals("Button[id=button1, styleClass=button]'1'"))) {
			screen.setText(screen.getText() + "1");
		} else if ((event.getSource().toString().equals("Button[id=button2, styleClass=button]'2'"))) {
			screen.setText(screen.getText() + "2");
		} else if ((event.getSource().toString().equals("Button[id=button3, styleClass=button]'3'"))) {
			screen.setText(screen.getText() + "3");
		} else if ((event.getSource().toString().equals("Button[id=button4, styleClass=button]'4'"))) {
			screen.setText(screen.getText() + "4");
		} else if ((event.getSource().toString().equals("Button[id=button5, styleClass=button]'5'"))) {
			screen.setText(screen.getText() + "5");
		} else if ((event.getSource().toString().equals("Button[id=button6, styleClass=button]'6'"))) {
			screen.setText(screen.getText() + "6");
		} else if ((event.getSource().toString().equals("Button[id=button7, styleClass=button]'7'"))) {
			screen.setText(screen.getText() + "7");
		} else if ((event.getSource().toString().equals("Button[id=button8, styleClass=button]'8'"))) {
			screen.setText(screen.getText() + "8");
		} else if ((event.getSource().toString().equals("Button[id=button9, styleClass=button]'9'"))) {
			screen.setText(screen.getText() + "9");
		}

	}

	@FXML
	private void operatorButtonClick(ActionEvent event) {
		num1 = Double.valueOf(screen.getText());

		if (event.getSource().toString().equals("Button[id=buttonP, styleClass=button orange-button]'+'")) {
			operator = "+";
		} else if ((event.getSource().toString().equals("Button[id=buttonM, styleClass=button orange-button]'-'"))) {
			operator = "-";
		} else if ((event.getSource().toString().equals("Button[id=buttonR, styleClass=button orange-button]'X'"))) {
			operator = "*";
		} else if ((event.getSource().toString().equals("Button[id=buttonD, styleClass=button orange-button]'÷'"))) {
			operator = "/";
		}

		screen.setText("");
	}

	@FXML
	private void calcButtonClick(ActionEvent event) {

		num2 = Double.valueOf(screen.getText());

		if (operator.equals("+")) {
			wynik = num1 + num2;
		} else if (operator.equals("-")) {
			wynik = num1 - num2;
		} else if (operator.equals("*")) {
			wynik = num1 * num2;
		} else if (operator.equals("/")) {
			wynik = num1 / num2;
		}
		if (wynik % 1 == 0) {
			int temp = (int) wynik;
			wynikS = String.valueOf(temp);
		} else {
			wynikS = String.valueOf(wynik);
		}
		screen.setText(wynikS);

	}

	@FXML
	private void clearButtonClick(ActionEvent event) {
		num1 = 0;
		num2 = 0;
		screen.setText("0");
	}

}

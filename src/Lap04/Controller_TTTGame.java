package Lap04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller_TTTGame {
    private boolean switchXO = true;
    Bord_TTT setPoint = new Bord_TTT();

    @FXML
    private Label ShowWin;
    @FXML
    private Button switchButton1;
    @FXML
    private Button switchButton2;
    @FXML
    private Button switchButton3;
    @FXML
    private Button switchButton4;
    @FXML
    private Button switchButton5;
    @FXML
    private Button switchButton6;
    @FXML
    private Button switchButton7;
    @FXML
    private Button switchButton8;
    @FXML
    private Button switchButton9;

    @FXML
    protected void handleTextEditButtonAction(ActionEvent event) {
        Button switchNumber = (Button) event.getSource();

        if (switchXO) {
            switchNumber.setText("O");                 //x =10   O = 100
            inputPoint(switchNumber, 100);
            setPoint.CheckWhoWin(100);
            ShowWinner();
            DisableAllBtn();
            switchNumber.setDisable(true);
            switchXO = false;

        } else {
            switchNumber.setText("X");                 //x =10   O = 100
            inputPoint(switchNumber, 10);
            setPoint.CheckWhoWin(10);
            ShowWinner();
            DisableAllBtn();
            switchNumber.setDisable(true);
            switchXO = true;
        }

    }

    public void inputPoint(Button switchNumber, int oneORzero) {

        if (switchNumber.getId().toString().equals("switchButton1")) {
            setPoint.initPoint(oneORzero, 0, 0);
            //System.out.println("0 0");
        } else if (switchNumber.getId().toString().equals("switchButton2")) {
            setPoint.initPoint(oneORzero, 0, 1);
            //System.out.println("0 1");

        } else if (switchNumber.getId().toString().equals("switchButton3")) {
            setPoint.initPoint(oneORzero, 0, 2);
            //System.out.println("0 2");

        } else if (switchNumber.getId().toString().equals("switchButton4")) {
            setPoint.initPoint(oneORzero, 1, 0);
            //System.out.println("1 0");

        } else if (switchNumber.getId().toString().equals("switchButton5")) {
            setPoint.initPoint(oneORzero, 1, 1);
            //System.out.println("1 1");

        } else if (switchNumber.getId().toString().equals("switchButton6")) {
            setPoint.initPoint(oneORzero, 1, 2);
            //System.out.println("1 2");

        } else if (switchNumber.getId().toString().equals("switchButton7")) {
            setPoint.initPoint(oneORzero, 2, 0);
            //System.out.println("2 0");

        } else if (switchNumber.getId().toString().equals("switchButton8")) {
            setPoint.initPoint(oneORzero, 2, 1);
            //System.out.println("2 1");

        } else if (switchNumber.getId().toString().equals("switchButton9")) {
            setPoint.initPoint(oneORzero, 2, 2);
            //System.out.println("2 2");
        }
        //System.out.println(switchNumber.getId().toString());
    }

    @FXML
    public void ShowWinner() {
        ShowWin.setText(setPoint.getTurnXO());
    }
    @FXML
    public void DisableAllBtn(){
        if(setPoint.isEndGame()) {
            switchButton1.setDisable(true);
            switchButton2.setDisable(true);
            switchButton3.setDisable(true);
            switchButton4.setDisable(true);
            switchButton5.setDisable(true);
            switchButton6.setDisable(true);
            switchButton7.setDisable(true);
            switchButton8.setDisable(true);
            switchButton9.setDisable(true);
        }
    }


}



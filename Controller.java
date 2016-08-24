package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button result;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button resset;

    @FXML
    private Label resultlabel;

    public void initialize(URL fxmlFileLocation, ResourceBundle resources)
    {
        one.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+one.getText());
                }
        );
        two.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+two.getText());
                }
        );
        three.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+three.getText());
                }
        );
        four.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+four.getText());
                }
        );
        five.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+five.getText());
                }
        );
        six.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+six.getText());
                }
        );
        seven.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+seven.getText());
                }
        );
        eight.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+eight.getText());
                }
        );
        nine.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+nine.getText());
                }
        );
        zero.setOnAction(
                event ->
                {
                    resultlabel.setText(resultlabel.getText()+zero.getText());
                }
        );
        resset.setOnAction(
                event ->
                {
                    resultlabel.setText("");
                }
        );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasatm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
/**
 * FXML Controller class
 *
 * @author NIA
 */
public class FXMLDocumentController implements Initializable {
    String pin = "";
    String PIN = "1234";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private Label label1;

    @FXML
    private JFXPasswordField idpin;

    @FXML
    private JFXButton st;

    @FXML
    private JFXButton du;

    @FXML
    private JFXButton tg;

    @FXML
    private JFXButton em;

    @FXML
    private JFXButton lm;

    @FXML
    private JFXButton en;

    @FXML
    private JFXButton tj;

    @FXML
    private JFXButton dp;

    @FXML
    private JFXButton sm;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton oke;



    @FXML
    void tekan0(ActionEvent event) {
pin +="0";
           idpin.setText(pin);
    }

    @FXML
    void tekan1(ActionEvent event) {
pin +="1";
           idpin.setText(pin);
    }

    @FXML
    void tekan2(ActionEvent event) {
pin +="2";
           idpin.setText(pin);
    }

    @FXML
    void tekan3(ActionEvent event) {
pin +="3";
           idpin.setText(pin);
    }

    @FXML
    void tekan4(ActionEvent event) {
pin +="4";
           idpin.setText(pin);
    }

    @FXML
    void tekan5(ActionEvent event) {
pin +="5";
           idpin.setText(pin);
    }

    @FXML
    void tekan6(ActionEvent event) {
pin +="6";
           idpin.setText(pin);
    }

    @FXML
    void tekan7(ActionEvent event) {
pin +="7";
           idpin.setText(pin);
    }

    @FXML
    void tekan8(ActionEvent event) {
pin +="8";
           idpin.setText(pin);
    }

    @FXML
    void tekan9(ActionEvent event) {
pin +="9";
           idpin.setText(pin);
    }

    @FXML
    void tekanOK(ActionEvent event) {
   if (pin.equals(PIN)){
                try {
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            } catch(IOException e){
                    System.out.println("Failed to create new Window."+e);
            }
            }else{
                kesempatan -=1;
                JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa" + kesempatan + "kesempatan lagi!");
                idpin.setText("");
                pin ="";
                if(kesempatan == 0){
                    System.exit(0);
                }
        }
    }

    @FXML
    void tekanc(ActionEvent event) {
 pin+= "";
            idpin.setText(pin);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 
    
}

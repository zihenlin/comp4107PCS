package PCS.SensorHandler.Emulator;

import AppKickstarter.AppKickstarter;
import AppKickstarter.misc.MBox;
import AppKickstarter.misc.Msg;
import java.util.logging.Logger;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

//======================================================================
// SensorEmulatorController
public class SensorEmulatorController {
    private String id;
    private AppKickstarter appKickstarter;
    private Logger log;
    private SensorEmulator sensorEmulator;
    private MBox sensorMBox;
    public TextArea sensorTextArea;
    public Button autoPollButton;
    private int lineNo = 0;

    //------------------------------------------------------------
    // initialize
    public void initialize(String id, AppKickstarter appKickstarter, Logger log, SensorEmulator sensorEmulator) {
        this.id = id;
        this.appKickstarter = appKickstarter;
        this.log = log;
        this.sensorEmulator = sensorEmulator;
        this.sensorMBox = appKickstarter.getThread("SensorHandler").getMBox();
    } // initialize

    //------------------------------------------------------------
    // buttonPressed
    public void buttonPressed(ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();

        switch (btn.getText()) {

            case "Sensor Signal":
                sensorMBox.send(new Msg(id, null, Msg.Type.SensorSignal, "SensorSignal"));
                break;

            case "Poll Request":
                appendTextArea("Send poll request.");
                sensorMBox.send(new Msg(id, null, Msg.Type.Poll, ""));
                break;

            case "Poll ACK":
                appendTextArea("Send poll ack.");
                sensorMBox.send(new Msg(id, null, Msg.Type.PollAck, ""));
                break;


            case "Auto Poll: On":
                Platform.runLater(() -> autoPollButton.setText("Auto Poll: Off"));
                sensorMBox.send(new Msg(id, null, Msg.Type.SensorEmulatorAutoPollToggle, "ToggleAutoPoll"));
                break;

            case "Auto Poll: Off":
                Platform.runLater(() -> autoPollButton.setText("Auto Poll: On"));
                sensorMBox.send(new Msg(id, null, Msg.Type.SensorEmulatorAutoPollToggle, "ToggleAutoPoll"));
                break;

            default:
                log.warning(id + ": unknown button: [" + btn.getText() + "]");
                break;
        }
    } // buttonPressed


    //------------------------------------------------------------
    // appendTextArea
    public void appendTextArea(String status) {
        Platform.runLater(() -> sensorTextArea.appendText(String.format("[%04d] %s\n", ++lineNo, status)));
    } // appendTextArea
}

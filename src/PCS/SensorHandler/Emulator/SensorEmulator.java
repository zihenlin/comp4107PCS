package PCS.SensorHandler.Emulator;

import AppKickstarter.misc.*;

import PCS.PCSStarter;


import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

//======================================================================
public class SensorEmulator extends SensorHandler {
    private Stage myStage;
    private SensorEmulatorController sensorEmulatorController;
    private final PCSStarter pcsStarter;
    private final String id;
    private boolean autoPoll;

    public SensorEmulator(String id, PCSStarter pcsStarter){
        super(id, pcsStarter);
        this.pcsStarter = pcsStarter;
        this.id = id + "Emulator";
        this.autoPoll = true;
    }

    //------------------------------------------------------------
    // start
    public void start() throws Exception {
        Parent root;
        myStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        String fxmlName =
                "SensorEmulator.fxml";
        loader.setLocation(SensorEmulator.class.getResource(fxmlName));
        root = loader.load();
        sensorEmulatorController = (SensorEmulatorController) loader.getController();
        sensorEmulatorController.initialize(id, pcsStarter, log, this);
        myStage.initStyle(StageStyle.DECORATED);
        myStage.setScene(new Scene(root, 420, 470));
        myStage.setTitle("Sensor Emulator");
        myStage.setResizable(false);
        myStage.setOnCloseRequest((WindowEvent event) -> {
            pcsStarter.stopApp();
            Platform.exit();
        });
        myStage.show();
    } // SensorEmulator

    //------------------------------------------------------------
    // processMsg
    protected final boolean processMsg(Msg msg) {
        boolean quit = false;

        switch (msg.getType()) {

            case SensorEmulatorAutoPollToggle:
                handleSensorEmulatorAutoPollToggle();
                break;

            default:
                quit = super.processMsg(msg);
        }
        return quit;
    } // processMsg

    //------------------------------------------------------------
    // handleGateEmulatorAutoPollToggle:
    public final boolean handleSensorEmulatorAutoPollToggle() {
        autoPoll = !autoPoll;
        logFine("Auto poll change: " + (autoPoll ? "off --> on" : "on --> off"));
        return autoPoll;
    } // handleGateEmulatorAutoPollToggle

    //------------------------------------------------------------
    // logFine
    private final void logFine(String logMsg) {
        sensorEmulatorController.appendTextArea("[FINE]: " + logMsg);
        log.fine(id + ": " + logMsg);
    } // logFine

    //------------------------------------------------------------
    // logInfo
    private final void logInfo(String logMsg) {
        sensorEmulatorController.appendTextArea("[INFO]: " + logMsg);
        log.info(id + ": " + logMsg);
    } // logInfo


    //------------------------------------------------------------
    // logWarning
    private final void logWarning(String logMsg) {
        sensorEmulatorController.appendTextArea("[WARNING]: " + logMsg);
        log.warning(id + ": " + logMsg);
    } // logWarning


    //------------------------------------------------------------
    // logSevere
    private final void logSevere(String logMsg) {
        sensorEmulatorController.appendTextArea("[SEVERE]: " + logMsg);
        log.severe(id + ": " + logMsg);
    } // logSevere
}

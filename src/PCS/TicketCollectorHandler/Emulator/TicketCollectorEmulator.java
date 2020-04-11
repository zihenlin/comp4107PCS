////version2.0
//package PCS.TicketCollectorHandler.Emulator;
//
//import AppKickstarter.misc.Msg;
//import AppKickstarter.timer.Timer;
////import PCS.GateHandler.Emulator.GateEmulator;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;
////import PCS.GateHandler.Emulator.GateEmulatorController;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulatorController;
//
//import PCS.PCSStarter;
//import javafx.application.Platform;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//import javafx.stage.StageStyle;
//import javafx.stage.WindowEvent;
//
//public class TicketCollectorEmulator extends TicketCollectorHandler {
//  private Stage myStage;
////  private GateEmulatorController gateEmulatorController;
//  private TicketCollectorEmulatorController ticketCollectorEmulatorController;
//  private final PCSStarter pcsStarter;
//  private final String id;
////  private final int gateOpenTime;
//  //private final int ticketCollectorOpenTime;
////  private final int gateCloseTime;
//  //private final int ticketCollectorCloseTime;
////  private final int GateOpenTimerID = 1;
//  private final int TicketCollectorOpenTimerID = 1;
////  private final int GateCloseTimerID = 2;
//  private final int TicketCollectorCloseTimerID = 2;
//  private boolean autoOpen;
//  private boolean autoClose;
//  private boolean autoPoll;
//
//
//  //------------------------------------------------------------
//  // GateEmulator
////  public GateEmulator(String id, PCSStarter pcsStarter) {
//    public TicketCollectorEmulator(String id, PCSStarter pcsStarter) {
//    super(id, pcsStarter);
//    this.pcsStarter = pcsStarter;
//    this.id = id + "Emulator";
////    this.gateOpenTime = Integer.parseInt(this.pcsStarter.getProperty("Gate.GateOpenTime"));
//    //this.ticketCollectorOpenTime = Integer.parseInt(this.pcsStarter.getProperty("TicketCollector.TicketCollectorOpenTime"));
////    this.gateCloseTime = Integer.parseInt(this.pcsStarter.getProperty("Gate.GateCloseTime"));
//    //this.ticketCollectorCloseTime = Integer.parseInt(this.pcsStarter.getProperty("TicketCollector.TicketCollectorCloseTime"));
//    this.autoOpen = true;
//    this.autoClose = true;
//    this.autoPoll = true;
//  } // GateEmulator
//
//
//  //------------------------------------------------------------
//  // start
//  public void start() throws Exception {
//    Parent root;
//    myStage = new Stage();
//    FXMLLoader loader = new FXMLLoader();
//    String fxmlName ="TicketCollectorEmulator.fxml";
////      "GateEmulator.fxml";
//
////    loader.setLocation(GateEmulator.class.getResource(fxmlName));
//    loader.setLocation(TicketCollectorEmulator.class.getResource(fxmlName));
//    root = loader.load();
////    gateEmulatorController = (GateEmulatorController) loader.getController();
//    ticketCollectorEmulatorController = (TicketCollectorEmulatorController) loader.getController();
////    gateEmulatorController.initialize(id, pcsStarter, log, this);
//    ticketCollectorEmulatorController.initialize(id, pcsStarter, log, this);
//    myStage.initStyle(StageStyle.DECORATED);
//    myStage.setScene(new Scene(root, 420, 470));
////    myStage.setTitle("Gate Emulator");
//    myStage.setTitle("TicketCollector Emulator");
//    myStage.setResizable(false);
//    myStage.setOnCloseRequest((WindowEvent event) -> {
//      pcsStarter.stopApp();
//      Platform.exit();
//    });
//    myStage.show();
//  } // GateEmulator
//
//
//  //------------------------------------------------------------
//  // processMsg
//  protected final boolean processMsg(Msg msg) {
//    boolean quit = false;
//
//    switch (msg.getType()) {
////      case TimesUp:
////        handleTimesUp(msg);
////        break;
////
////      case GateEmulatorAutoOpenToggle:
////        handleGateEmulatorAutoOpenToggle();
////        break;
////
////      case GateEmulatorAutoCloseToggle:
////        handleGateEmulatorAutoCloseToggle();
////        break;
////
////      case GateEmulatorAutoPollToggle:
////        handleGateEmulatorAutoPollToggle();
////        break;
////
////      default:
////        quit = super.processMsg(msg);
//    }
//    return quit;
//  } // processMsg
//
//
//  //------------------------------------------------------------
//  // sendGateOpenSignal
////  @Override
////  protected void sendGateOpenSignal() {
////    logFine("Gate open signal received.  [autoOpen is " + (autoOpen ? "on]" : "off]"));
////    if (autoOpen) {
////      logFine("Gate open timer started.");
////      Timer.setTimer(id, mbox, gateOpenTime, GateOpenTimerID);
////    }
////  } // sendGateOpenSignal
////
////
////  //------------------------------------------------------------
////  // sendGateCloseSignal
////  @Override
////  protected void sendGateCloseSignal() {
////    logFine("Gate close signal received.  [autoClose is " + (autoClose ? "on]" : "off]"));
////    if (autoClose) {
////      logFine("Gate close timer started.");
////      Timer.setTimer(id, mbox, gateCloseTime, GateCloseTimerID);
////    }
////  } // sendGateCloseSignal
////
////
////  //------------------------------------------------------------
////  // sendPollReq
////  @Override
////  protected void sendPollReq() {
////    logFine("Poll request received.  [autoPoll is " + (autoPoll ? "on]" : "off]"));
////    if (autoPoll) {
////      logFine("Send poll ack.");
////      mbox.send(new Msg(id, mbox, Msg.Type.PollAck, ""));
////    }
////  } // sendPollReq
////
////
////  //------------------------------------------------------------
////  // handleTimesUp
////  public final void handleTimesUp(Msg msg) {
////    logFine("Times up received.");
////
////    switch (Timer.getTimesUpMsgTimerId(msg)) {
////      case GateOpenTimerID:
////        logFine("Gate open timer is up.  [autoOpen is " + (autoOpen ? "on]" : "off]"));
////        if (autoOpen) {
////          logFine("Send gate open reply");
////          mbox.send(new Msg(id, mbox, Msg.Type.GateOpenReply, "Gate Open Reply"));
////        } else {
////          // autoOpen is off.  just ignore timeout msg
////          logFine("Auto open is off.  Timer ignored.");
////        }
////        break;
////
////      case GateCloseTimerID:
////        logFine("Gate close timer is up.  [autoClose is " + (autoClose ? "on]" : "off]"));
////        if (autoClose) {
////          logFine("Send gate close reply");
////          mbox.send(new Msg(id, mbox, Msg.Type.GateCloseReply, "Gate Close Reply"));
////        } else {
////          // autoClose is off.  just ignore timeout msg
////          logFine("Auto close is off.  Timer ignored.");
////        }
////        break;
////
////      default:
////        logSevere("Unknown timer id!!");
////    }
////  } // handleTimesUp
////
////
////  //------------------------------------------------------------
////  // handleGateEmulatorAutoOpenToggle
////  public final boolean handleGateEmulatorAutoOpenToggle() {
////    autoOpen = !autoOpen;
////    logFine("Auto open change: " + (autoOpen ? "off --> on" : "on --> off"));
////    return autoOpen;
////  } // handleGateEmulatorAutoOpenToggle
////
////
////  //------------------------------------------------------------
////  // handleGateEmulatorAutoCloseToggle
////  public final boolean handleGateEmulatorAutoCloseToggle() {
////    autoClose = !autoClose;
////    logFine("Auto close change: " + (autoClose ? "off --> on" : "on --> off"));
////    return autoClose;
////  } // handleGateEmulatorAutoCloseToggle
////
////
////  //------------------------------------------------------------
////  // handleGateEmulatorAutoPollToggle:
////  public final boolean handleGateEmulatorAutoPollToggle() {
////    autoPoll = !autoPoll;
////    logFine("Auto poll change: " + (autoPoll ? "off --> on" : "on --> off"));
////    return autoPoll;
////  } // handleGateEmulatorAutoPollToggle
//
//
//  //------------------------------------------------------------
//  // logFine
//  private final void logFine(String logMsg) {
////    gateEmulatorController.appendTextArea("[FINE]: " + logMsg);
//    ticketCollectorEmulatorController.appendTextArea("[FINE]: " + logMsg);
//    log.fine(id + ": " + logMsg);
//  } // logFine
//
//
//  //------------------------------------------------------------
//  // logInfo
//  private final void logInfo(String logMsg) {
////    gateEmulatorController.appendTextArea("[INFO]: " + logMsg);
//    ticketCollectorEmulatorController.appendTextArea("[INFO]: " + logMsg);
//    log.info(id + ": " + logMsg);
//  } // logInfo
//
//
//  //------------------------------------------------------------
//  // logWarning
//  private final void logWarning(String logMsg) {
////    gateEmulatorController.appendTextArea("[WARNING]: " + logMsg);
//    ticketCollectorEmulatorController.appendTextArea("[WARNING]: " + logMsg);
//    log.warning(id + ": " + logMsg);
//  } // logWarning
//
//
//  //------------------------------------------------------------
//  // logSevere
//  private final void logSevere(String logMsg) {
////    gateEmulatorController.appendTextArea("[SEVERE]: " + logMsg);
//    ticketCollectorEmulatorController.appendTextArea("[SEVERE]: " + logMsg);
//    log.severe(id + ": " + logMsg);
//  } // logSevere
//}















//version3.0
package PCS.TicketCollectorHandler.Emulator;

import AppKickstarter.misc.Msg;
import AppKickstarter.timer.Timer;
//import PCS.GateHandler.Emulator.GateEmulator;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;
//import PCS.GateHandler.Emulator.GateEmulatorController;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulatorController;

import PCS.PCSStarter;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class TicketCollectorEmulator extends TicketCollectorHandler {
  private Stage myStage;
  //  private GateEmulatorController gateEmulatorController;
  private TicketCollectorEmulatorController ticketCollectorEmulatorController;
  private final PCSStarter pcsStarter;
  private final String id;
  //  private final int gateOpenTime;
  //private final int ticketCollectorOpenTime;
//  private final int gateCloseTime;
  //private final int ticketCollectorCloseTime;
//  private final int GateOpenTimerID = 1;
  private final int TicketCollectorOpenTimerID = 1;
  //  private final int GateCloseTimerID = 2;
  private final int TicketCollectorCloseTimerID = 2;
  private boolean autoOpen;
  private boolean autoClose;
  private boolean autoPoll;


  //------------------------------------------------------------
  // GateEmulator
//  public GateEmulator(String id, PCSStarter pcsStarter) {
  public TicketCollectorEmulator(String id, PCSStarter pcsStarter) {
    super(id, pcsStarter);
    this.pcsStarter = pcsStarter;
    this.id = id + "Emulator";
//    this.gateOpenTime = Integer.parseInt(this.pcsStarter.getProperty("Gate.GateOpenTime"));
    //this.ticketCollectorOpenTime = Integer.parseInt(this.pcsStarter.getProperty("TicketCollector.TicketCollectorOpenTime"));
//    this.gateCloseTime = Integer.parseInt(this.pcsStarter.getProperty("Gate.GateCloseTime"));
    //this.ticketCollectorCloseTime = Integer.parseInt(this.pcsStarter.getProperty("TicketCollector.TicketCollectorCloseTime"));
    this.autoOpen = true;
    this.autoClose = true;
    this.autoPoll = true;
  } // GateEmulator


  //------------------------------------------------------------
  // start
  public void start() throws Exception {
    Parent root;
    myStage = new Stage();
    FXMLLoader loader = new FXMLLoader();
    String fxmlName ="TicketCollectorEmulator.fxml";
//      "GateEmulator.fxml";

//    loader.setLocation(GateEmulator.class.getResource(fxmlName));
    loader.setLocation(TicketCollectorEmulator.class.getResource(fxmlName));
    root = loader.load();
//    gateEmulatorController = (GateEmulatorController) loader.getController();
    ticketCollectorEmulatorController = (TicketCollectorEmulatorController) loader.getController();
//    gateEmulatorController.initialize(id, pcsStarter, log, this);
    ticketCollectorEmulatorController.initialize(id, pcsStarter, log, this);
    myStage.initStyle(StageStyle.DECORATED);
    myStage.setScene(new Scene(root, 420, 470));
//    myStage.setTitle("Gate Emulator");
    myStage.setTitle("TicketCollector Emulator");
    myStage.setResizable(false);
    myStage.setOnCloseRequest((WindowEvent event) -> {
      pcsStarter.stopApp();
      Platform.exit();
    });
    myStage.show();
  } // GateEmulator


  //------------------------------------------------------------
  // processMsg
  protected final boolean processMsg(Msg msg) {
    boolean quit = false;

    switch (msg.getType()) {
      case TicketCollectorAlarmRequest:
        handleTicketCollectorAlarmRequest();
        break;

//      case TimesUp:
//        handleTimesUp(msg);
//        break;
      case TicketCollectorStopAlarmRequest:
        handleTicketCollectorStopAlarmRequest();
        break;

      case TicketCollectorButtonPressed:
        sendTicketCollectorButtonPressedSignal();
        handleTicketCollectorButtonPressed();
        break;
//
//      case GateEmulatorAutoOpenToggle:
//        handleGateEmulatorAutoOpenToggle();
//        break;
//
//      case GateEmulatorAutoCloseToggle:
//        handleGateEmulatorAutoCloseToggle();
//        break;
//
//      case GateEmulatorAutoPollToggle:
//        handleGateEmulatorAutoPollToggle();
//        break;
//
      default:
        quit = super.processMsg(msg);
    }
    return quit;
  } // processMsg


//  ------------------------------------------------------------
//  sendTicketCollectorAlarmSignal
  @Override
  protected void sendTicketCollectorAlarmSignal() {
    logFine("TicketCollector alarm signal received. TicketCollector is alarming");
//    if (autoOpen) {
//      logFine("Gate open timer started.");
//      Timer.setTimer(id, mbox, gateOpenTime, GateOpenTimerID);
//    }
  } // sendGateOpenSignal

  //  sendTicketCollectorAlarmSignal
  @Override
  protected void sendTicketCollectorStopAlarmSignal() {
    logFine("TicketCollector stop alarm signal received. TicketCollector stop alarming");
//    if (autoOpen) {
//      logFine("Gate open timer started.");
//      Timer.setTimer(id, mbox, gateOpenTime, GateOpenTimerID);
//    }
  } // sendGateOpenSignal

  //sendTicketCollectorButtonPressedSignal
  protected void sendTicketCollectorButtonPressedSignal() {
    logFine("Button Pressed!!!");
//    if (autoOpen) {
//      logFine("Gate open timer started.");
//      Timer.setTimer(id, mbox, gateOpenTime, GateOpenTimerID);
//    }
  } // sendTicketCollectorButtonPressedSignal
//
//
//  //------------------------------------------------------------
//  // sendGateCloseSignal
//  @Override
//  protected void sendGateCloseSignal() {
//    logFine("Gate close signal received.  [autoClose is " + (autoClose ? "on]" : "off]"));
//    if (autoClose) {
//      logFine("Gate close timer started.");
//      Timer.setTimer(id, mbox, gateCloseTime, GateCloseTimerID);
//    }
//  } // sendGateCloseSignal
//
//
//  //------------------------------------------------------------
//  // sendPollReq
//  @Override
//  protected void sendPollReq() {
//    logFine("Poll request received.  [autoPoll is " + (autoPoll ? "on]" : "off]"));
//    if (autoPoll) {
//      logFine("Send poll ack.");
//      mbox.send(new Msg(id, mbox, Msg.Type.PollAck, ""));
//    }
//  } // sendPollReq
//
//
//  //------------------------------------------------------------
//  // handleTimesUp
//  public final void handleTimesUp(Msg msg) {
//    logFine("Times up received.");
//
//    switch (Timer.getTimesUpMsgTimerId(msg)) {
//      case GateOpenTimerID:
//        logFine("Gate open timer is up.  [autoOpen is " + (autoOpen ? "on]" : "off]"));
//        if (autoOpen) {
//          logFine("Send gate open reply");
//          mbox.send(new Msg(id, mbox, Msg.Type.GateOpenReply, "Gate Open Reply"));
//        } else {
//          // autoOpen is off.  just ignore timeout msg
//          logFine("Auto open is off.  Timer ignored.");
//        }
//        break;
//
//      case GateCloseTimerID:
//        logFine("Gate close timer is up.  [autoClose is " + (autoClose ? "on]" : "off]"));
//        if (autoClose) {
//          logFine("Send gate close reply");
//          mbox.send(new Msg(id, mbox, Msg.Type.GateCloseReply, "Gate Close Reply"));
//        } else {
//          // autoClose is off.  just ignore timeout msg
//          logFine("Auto close is off.  Timer ignored.");
//        }
//        break;
//
//      default:
//        logSevere("Unknown timer id!!");
//    }
//  } // handleTimesUp
//
//
//  //------------------------------------------------------------
//  // handleGateEmulatorAutoOpenToggle
//  public final boolean handleGateEmulatorAutoOpenToggle() {
//    autoOpen = !autoOpen;
//    logFine("Auto open change: " + (autoOpen ? "off --> on" : "on --> off"));
//    return autoOpen;
//  } // handleGateEmulatorAutoOpenToggle
//
//
//  //------------------------------------------------------------
//  // handleGateEmulatorAutoCloseToggle
//  public final boolean handleGateEmulatorAutoCloseToggle() {
//    autoClose = !autoClose;
//    logFine("Auto close change: " + (autoClose ? "off --> on" : "on --> off"));
//    return autoClose;
//  } // handleGateEmulatorAutoCloseToggle
//
//
//  //------------------------------------------------------------
//  // handleGateEmulatorAutoPollToggle:
//  public final boolean handleGateEmulatorAutoPollToggle() {
//    autoPoll = !autoPoll;
//    logFine("Auto poll change: " + (autoPoll ? "off --> on" : "on --> off"));
//    return autoPoll;
//  } // handleGateEmulatorAutoPollToggle


  //------------------------------------------------------------
  // logFine
  private final void logFine(String logMsg) {
//    gateEmulatorController.appendTextArea("[FINE]: " + logMsg);
    ticketCollectorEmulatorController.appendTextArea("[FINE]: " + logMsg);
    log.fine(id + ": " + logMsg);
  } // logFine


  //------------------------------------------------------------
  // logInfo
  private final void logInfo(String logMsg) {
//    gateEmulatorController.appendTextArea("[INFO]: " + logMsg);
    ticketCollectorEmulatorController.appendTextArea("[INFO]: " + logMsg);
    log.info(id + ": " + logMsg);
  } // logInfo


  //------------------------------------------------------------
  // logWarning
  private final void logWarning(String logMsg) {
//    gateEmulatorController.appendTextArea("[WARNING]: " + logMsg);
    ticketCollectorEmulatorController.appendTextArea("[WARNING]: " + logMsg);
    log.warning(id + ": " + logMsg);
  } // logWarning


  //------------------------------------------------------------
  // logSevere
  private final void logSevere(String logMsg) {
//    gateEmulatorController.appendTextArea("[SEVERE]: " + logMsg);
    ticketCollectorEmulatorController.appendTextArea("[SEVERE]: " + logMsg);
    log.severe(id + ": " + logMsg);
  } // logSevere
}


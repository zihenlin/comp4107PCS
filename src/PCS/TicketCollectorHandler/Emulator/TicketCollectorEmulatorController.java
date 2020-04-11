////version2.0
//package PCS.TicketCollectorHandler.Emulator;
//
//import AppKickstarter.AppKickstarter;
//import AppKickstarter.misc.MBox;
//import AppKickstarter.misc.Msg;
////import PCS.GateHandler.Emulator.GateEmulator;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;
//import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
//
//import java.util.logging.Logger;
//
//public class TicketCollectorEmulatorController {
//  private String id;
//  private AppKickstarter appKickstarter;
//  private Logger log;
////  private GateEmulator gateEmulator;
//  private TicketCollectorEmulator ticketCollectorEmulator;
////  private MBox gateMBox;
//  private MBox ticketCollectorMBox;
////  public TextArea gateTextArea;
//  public TextArea ticketCollectorTextArea;
////  public Button autoOpenButton;
////  public Button autoCloseButton;
////  public Button autoPollButton;
//  private int lineNo = 0;
//
//
//  //------------------------------------------------------------
//  // initialize
////  public void initialize(String id, AppKickstarter appKickstarter, Logger log, GateEmulator gateEmulator) {
//  public void initialize(String id, AppKickstarter appKickstarter, Logger log, TicketCollectorEmulator ticketCollectorEmulator) {
//    this.id = id;
//    this.appKickstarter = appKickstarter;
//    this.log = log;
////    this.gateEmulator = gateEmulator;
//    this.ticketCollectorEmulator = ticketCollectorEmulator;
////    this.gateMBox = appKickstarter.getThread("GateHandler").getMBox();
//    this.ticketCollectorMBox = appKickstarter.getThread("TicketCollectorHandler").getMBox();
//  } // initialize
//
//
//  //------------------------------------------------------------
//  // buttonPressed
//  public void buttonPressed(ActionEvent actionEvent) {
//    Button btn = (Button) actionEvent.getSource();
//
//    switch (btn.getText()) {
////      case "Gate Open Request":
////        gateMBox.send(new Msg(id, null, Msg.Type.GateOpenRequest, "GateOpenReq"));
////        break;
////
////      case "Gate Open Reply":
////        gateMBox.send(new Msg(id, null, Msg.Type.GateOpenReply, "GateOpenReply"));
////        break;
////
////      case "Gate Close Request":
////        gateMBox.send(new Msg(id, null, Msg.Type.GateCloseRequest, "GateCloseReq"));
////        break;
////
////      case "Gate Close Reply":
////        gateMBox.send(new Msg(id, null, Msg.Type.GateCloseReply, "GateCloseReply"));
////        break;
////
////      case "Poll Request":
////        appendTextArea("Send poll request.");
////        gateMBox.send(new Msg(id, null, Msg.Type.Poll, ""));
////        break;
////
////      case "Poll ACK":
////        appendTextArea("Send poll ack.");
////        gateMBox.send(new Msg(id, null, Msg.Type.PollAck, ""));
////        break;
////
////      case "Auto Open: On":
////        Platform.runLater(() -> autoOpenButton.setText("Auto Open: Off"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoOpenToggle, "ToggleAutoOpen"));
////        break;
////
////      case "Auto Open: Off":
////        Platform.runLater(() -> autoOpenButton.setText("Auto Open: On"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoOpenToggle, "ToggleAutoOpen"));
////        break;
////
////      case "Auto Close: On":
////        Platform.runLater(() -> autoCloseButton.setText("Auto Close: Off"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoCloseToggle, "ToggleAutoClose"));
////        break;
////
////      case "Auto Close: Off":
////        Platform.runLater(() -> autoCloseButton.setText("Auto Close: On"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoCloseToggle, "ToggleAutoClose"));
////        break;
////
////      case "Auto Poll: On":
////        Platform.runLater(() -> autoPollButton.setText("Auto Poll: Off"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoPollToggle, "ToggleAutoPoll"));
////        break;
////
////      case "Auto Poll: Off":
////        Platform.runLater(() -> autoPollButton.setText("Auto Poll: On"));
////        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoPollToggle, "ToggleAutoPoll"));
////        break;
////
////      default:
////        log.warning(id + ": unknown button: [" + btn.getText() + "]");
////        break;
//    }
//  } // buttonPressed
//
//
//  //------------------------------------------------------
//  // appendTextArea
//  public void appendTextArea(String status) {
////    Platform.runLater(() -> gateTextArea.appendText(String.format("[%04d] %s\n", ++lineNo, status)));
//    Platform.runLater(() -> ticketCollectorTextArea.appendText(String.format("[%04d] %s\n", ++lineNo, status)));
//  } // appendTextArea
//}








//version3.0
package PCS.TicketCollectorHandler.Emulator;

import AppKickstarter.AppKickstarter;
import AppKickstarter.misc.MBox;
import AppKickstarter.misc.Msg;
//import PCS.GateHandler.Emulator.GateEmulator;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.logging.Logger;

public class TicketCollectorEmulatorController {
  private String id;
  private AppKickstarter appKickstarter;
  private Logger log;
  //  private GateEmulator gateEmulator;
  private TicketCollectorEmulator ticketCollectorEmulator;
  //  private MBox gateMBox;
  private MBox ticketCollectorMBox;
  //  public TextArea gateTextArea;
  public TextArea ticketCollectorTextArea;
  //  public Button autoOpenButton;
//  public Button autoCloseButton;
//  public Button autoPollButton;
  private int lineNo = 0;


  //------------------------------------------------------------
  // initialize
//  public void initialize(String id, AppKickstarter appKickstarter, Logger log, GateEmulator gateEmulator) {
  public void initialize(String id, AppKickstarter appKickstarter, Logger log, TicketCollectorEmulator ticketCollectorEmulator) {
    this.id = id;
    this.appKickstarter = appKickstarter;
    this.log = log;
//    this.gateEmulator = gateEmulator;
    this.ticketCollectorEmulator = ticketCollectorEmulator;
//    this.gateMBox = appKickstarter.getThread("GateHandler").getMBox();
    this.ticketCollectorMBox = appKickstarter.getThread("TicketCollectorHandler").getMBox();
  } // initialize


  //------------------------------------------------------------
  // buttonPressed
  public void buttonPressed(ActionEvent actionEvent) {
    Button btn = (Button) actionEvent.getSource();

    switch (btn.getText()) {
      case "alarm":
        ticketCollectorMBox.send(new Msg(id, null, Msg.Type.TicketCollectorAlarmRequest, "TicketCollectorAlarmReq"));
        break;


      case "stop alarm":
        ticketCollectorMBox.send(new Msg(id, null, Msg.Type.TicketCollectorStopAlarmRequest, "TicketCollectorStopAlarmReq"));
        break;
//
//      case "Gate Close Request":
//        gateMBox.send(new Msg(id, null, Msg.Type.GateCloseRequest, "GateCloseReq"));
//        break;
//
//      case "Gate Close Reply":
//        gateMBox.send(new Msg(id, null, Msg.Type.GateCloseReply, "GateCloseReply"));
//        break;
//
//      case "Poll Request":
//        appendTextArea("Send poll request.");
//        gateMBox.send(new Msg(id, null, Msg.Type.Poll, ""));
//        break;
//
//      case "Poll ACK":
//        appendTextArea("Send poll ack.");
//        gateMBox.send(new Msg(id, null, Msg.Type.PollAck, ""));
//        break;
//
//      case "Auto Open: On":
//        Platform.runLater(() -> autoOpenButton.setText("Auto Open: Off"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoOpenToggle, "ToggleAutoOpen"));
//        break;
//
//      case "Auto Open: Off":
//        Platform.runLater(() -> autoOpenButton.setText("Auto Open: On"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoOpenToggle, "ToggleAutoOpen"));
//        break;
//
//      case "Auto Close: On":
//        Platform.runLater(() -> autoCloseButton.setText("Auto Close: Off"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoCloseToggle, "ToggleAutoClose"));
//        break;
//
//      case "Auto Close: Off":
//        Platform.runLater(() -> autoCloseButton.setText("Auto Close: On"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoCloseToggle, "ToggleAutoClose"));
//        break;
//
//      case "Auto Poll: On":
//        Platform.runLater(() -> autoPollButton.setText("Auto Poll: Off"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoPollToggle, "ToggleAutoPoll"));
//        break;
//
//      case "Auto Poll: Off":
//        Platform.runLater(() -> autoPollButton.setText("Auto Poll: On"));
//        gateMBox.send(new Msg(id, null, Msg.Type.GateEmulatorAutoPollToggle, "ToggleAutoPoll"));
//        break;
//
//      default:
//        log.warning(id + ": unknown button: [" + btn.getText() + "]");
//        break;
    }
  } // buttonPressed


  //------------------------------------------------------
  // appendTextArea
  public void appendTextArea(String status) {
//    Platform.runLater(() -> gateTextArea.appendText(String.format("[%04d] %s\n", ++lineNo, status)));
    Platform.runLater(() -> ticketCollectorTextArea.appendText(String.format("[%04d] %s\n", ++lineNo, status)));
  } // appendTextArea
}

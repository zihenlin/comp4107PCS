//package PCS;
//
//import AppKickstarter.AppKickstarter;
//import AppKickstarter.misc.Msg;
//import AppKickstarter.timer.Timer;
//import PCS.GateHandler.GateHandler;
//import PCS.SensorHandler.Emulator.SensorHandler;
//import PCS.PCSCore.PCSCore;
//import javafx.application.Platform;
//
//
////======================================================================
//// PCSStarter
//public class PCSStarter extends AppKickstarter {
//  protected Timer timer;
//  protected PCSCore pcsCore;
//  protected GateHandler gateHandler;
//  protected SensorHandler sensorHandler;
//
//
//  //------------------------------------------------------------
//  // main
//  public static void main(String [] args) {
//    new PCSStarter().startApp();
//  } // main
//
//
//  //------------------------------------------------------------
//  // PCSStart
//  public PCSStarter() {
//    super("PCSStarter", "etc/PCS.cfg");
//  } // PCSStart
//
//
//  //------------------------------------------------------------
//  // startApp
//  protected void startApp() {
//    // start our application
//    log.info("");
//    log.info("");
//    log.info("============================================================");
//    log.info(id + ": Application Starting...");
//
//    startHandlers();
//  } // startApp
//
//
//  //------------------------------------------------------------
//  // startHandlers
//  protected void startHandlers() {
//    // create handlers
//    try {
//      timer = new Timer("timer", this);
//      pcsCore = new PCSCore("PCSCore", this);
//      gateHandler = new GateHandler("GateHandler", this);
//      sensorHandler = new SensorHandler("SensorHandler", this);
//    } catch (Exception e) {
//      System.out.println("AppKickstarter: startApp failed");
//      e.printStackTrace();
//      Platform.exit();
//    }
//
//    // start threads
//    new Thread(timer).start();
//    new Thread(pcsCore).start();
//    new Thread(gateHandler).start();
//    new Thread(sensorHandler).start();
//  } // startHandlers
//
//
//  //------------------------------------------------------------
//  // stopApp
//  public void stopApp() {
//    log.info("");
//    log.info("");
//    log.info("============================================================");
//    log.info(id + ": Application Stopping...");
//    pcsCore.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//    gateHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//    timer.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//    sensorHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//  } // stopApp
//} // PCS.PCSStarter

















////Version 2.0
//package PCS;
//
//import AppKickstarter.AppKickstarter;
//import AppKickstarter.misc.Msg;
//import AppKickstarter.timer.Timer;
//import PCS.GateHandler.GateHandler;
//import PCS.SensorHandler.Emulator.SensorHandler;
//import PCS.PCSCore.PCSCore;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorHandler;
//import javafx.application.Platform;
//
//
////======================================================================
//// PCSStarter
//public class PCSStarter extends AppKickstarter {
//    protected Timer timer;
//    protected PCSCore pcsCore;
//    protected GateHandler gateHandler;
//    protected SensorHandler sensorHandler;
//    protected TicketCollectorHandler ticketCollectorHandler;
//
//
//    //------------------------------------------------------------
//    // main
//    public static void main(String [] args) {
//        new PCSStarter().startApp();
//    } // main
//
//
//    //------------------------------------------------------------
//    // PCSStart
//    public PCSStarter() {
//	super("PCSStarter", "etc/PCS.cfg");
//    } // PCSStart
//
//
//    //------------------------------------------------------------
//    // startApp
//    protected void startApp() {
//	// start our application
//	log.info("");
//	log.info("");
//	log.info("============================================================");
//	log.info(id + ": Application Starting...");
//
//	startHandlers();
//    } // startApp
//
//
//    //------------------------------------------------------------
//    // startHandlers
//    protected void startHandlers() {
//	// create handlers
//	try {
//	    timer = new Timer("timer", this);
//	    pcsCore = new PCSCore("PCSCore", this);
//	    gateHandler = new GateHandler("GateHandler", this);
//	    sensorHandler = new SensorHandler("SensorHandler", this);
//      ticketCollectorHandler = new TicketCollectorHandler("TicketCollectorHandler", this);
//	} catch (Exception e) {
//	    System.out.println("AppKickstarter: startApp failed");
//	    e.printStackTrace();
//	    Platform.exit();
//	}
//
//	// start threads
//	new Thread(timer).start();
//	new Thread(pcsCore).start();
//	new Thread(gateHandler).start();
//	new Thread(sensorHandler).start();
//	new Thread(ticketCollectorHandler).start();
//    } // startHandlers
//
//
//    //------------------------------------------------------------
//    // stopApp
//    public void stopApp() {
//	log.info("");
//	log.info("");
//	log.info("============================================================");
//	log.info(id + ": Application Stopping...");
//	pcsCore.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//	gateHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//	timer.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//	sensorHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//	ticketCollectorHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
//    } // stopApp
//} // PCS.PCSStarter










//version3.0
package PCS;

import AppKickstarter.AppKickstarter;
import AppKickstarter.misc.Msg;
import AppKickstarter.timer.Timer;
import PCS.GateHandler.GateHandler;
import PCS.SensorHandler.Emulator.SensorHandler;
import PCS.PCSCore.PCSCore;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorHandler;
import javafx.application.Platform;


//======================================================================
// PCSStarter
public class PCSStarter extends AppKickstarter {
  protected Timer timer;
  protected PCSCore pcsCore;
  protected GateHandler gateHandler;
  protected SensorHandler sensorHandler;
  protected TicketCollectorHandler ticketCollectorHandler;


  //------------------------------------------------------------
  // main
  public static void main(String [] args) {
    new PCSStarter().startApp();
  } // main


  //------------------------------------------------------------
  // PCSStart
  public PCSStarter() {
    super("PCSStarter", "etc/PCS.cfg");
  } // PCSStart


  //------------------------------------------------------------
  // startApp
  protected void startApp() {
    // start our application
    log.info("");
    log.info("");
    log.info("============================================================");
    log.info(id + ": Application Starting...");

    startHandlers();
  } // startApp


  //------------------------------------------------------------
  // startHandlers
  protected void startHandlers() {
    // create handlers
    try {
      timer = new Timer("timer", this);
      pcsCore = new PCSCore("PCSCore", this);
      gateHandler = new GateHandler("GateHandler", this);
      sensorHandler = new SensorHandler("SensorHandler", this);
      ticketCollectorHandler = new TicketCollectorHandler("TicketCollectorHandler", this);
    } catch (Exception e) {
      System.out.println("AppKickstarter: startApp failed");
      e.printStackTrace();
      Platform.exit();
    }

    // start threads
    new Thread(timer).start();
    new Thread(pcsCore).start();
    new Thread(gateHandler).start();
    new Thread(sensorHandler).start();
    new Thread(ticketCollectorHandler).start();
  } // startHandlers


  //------------------------------------------------------------
  // stopApp
  public void stopApp() {
    log.info("");
    log.info("");
    log.info("============================================================");
    log.info(id + ": Application Stopping...");
    pcsCore.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
    gateHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
    timer.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
    sensorHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
    ticketCollectorHandler.getMBox().send(new Msg(id, null, Msg.Type.Terminate, "Terminate now!"));
  } // stopApp
} // PCS.PCSStarter

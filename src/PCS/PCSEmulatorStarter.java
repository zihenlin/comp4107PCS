//package PCS;
//
//import AppKickstarter.timer.Timer;
//
//import PCS.PCSCore.PCSCore;
//import PCS.GateHandler.GateHandler;
//import PCS.GateHandler.Emulator.GateEmulator;
//import PCS.SensorHandler.Emulator.SensorHandler;
//import PCS.SensorHandler.Emulator.SensorEmulator;
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.stage.Stage;
//
////======================================================================
//// PCSEmulatorStarter
//public class PCSEmulatorStarter extends PCSStarter {
//    //------------------------------------------------------------
//    // main
//    public static void main(String [] args) {
//	new PCSEmulatorStarter().startApp();
//    } // main
//
//
//    //------------------------------------------------------------
//    // startHandlers
//    @Override
//    protected void startHandlers() {
//        Emulators.pcsEmulatorStarter = this;
//        new Emulators().start();
//    } // startHandlers
//
//
//    //------------------------------------------------------------
//    // Emulators
//    public static class Emulators extends Application {
//        private static PCSEmulatorStarter pcsEmulatorStarter;
//
//	//----------------------------------------
//	// start
//        public void start() {
//            launch();
//	} // start
//
//	//----------------------------------------
//	// start
//        public void start(Stage primaryStage) {
//	    Timer timer = null;
//	    PCSCore pcsCore = null;
//	    GateEmulator gateEmulator = null;
//	    SensorEmulator sensorEmulator = null;
//
//	    // create emulators
//	    try {
//	        timer = new Timer("timer", pcsEmulatorStarter);
//	        pcsCore = new PCSCore("PCSCore", pcsEmulatorStarter);
//	        gateEmulator = new GateEmulator("GateHandler", pcsEmulatorStarter);
//	        sensorEmulator = new SensorEmulator("SensorHandler", pcsEmulatorStarter);
//
//		// start emulator GUIs
//		gateEmulator.start();
//		sensorEmulator.start();
//	    } catch (Exception e) {
//		System.out.println("Emulators: start failed");
//		e.printStackTrace();
//		Platform.exit();
//	    }
//	    pcsEmulatorStarter.setTimer(timer);
//	    pcsEmulatorStarter.setPCSCore(pcsCore);
//	    pcsEmulatorStarter.setGateHandler(gateEmulator);
//	    pcsEmulatorStarter.setSensorHandler(sensorEmulator);
//
//
//	    // start threads
//	    new Thread(timer).start();
//	    new Thread(pcsCore).start();
//	    new Thread(gateEmulator).start();
//	    new Thread(sensorEmulator).start();
//	} // start
//    } // Emulators
//
//
//    //------------------------------------------------------------
//    //  setters
//    private void setTimer(Timer timer) {
//        this.timer = timer;
//    }
//    private void setPCSCore(PCSCore pcsCore) {
//        this.pcsCore = pcsCore;
//    }
//    private void setGateHandler(GateHandler gateHandler) {
//	this.gateHandler = gateHandler;
//    }
//    private void setSensorHandler(SensorHandler sensorHandler) {
//        this.sensorHandler = sensorHandler;
//    }
//
//} // PCSEmulatorStarter

















////Version2.0
//package PCS;
//
//import AppKickstarter.timer.Timer;
//
//import PCS.PCSCore.PCSCore;
//import PCS.GateHandler.GateHandler;
//import PCS.GateHandler.Emulator.GateEmulator;
//import PCS.SensorHandler.Emulator.SensorHandler;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorHandler;
//import PCS.SensorHandler.Emulator.SensorEmulator;
//import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;
//
//
//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.stage.Stage;
//
////======================================================================
//// PCSEmulatorStarter
//public class PCSEmulatorStarter extends PCSStarter {
//  //------------------------------------------------------------
//  // main
//  public static void main(String [] args) {
//    new PCSEmulatorStarter().startApp();
//  } // main
//
//
//  //------------------------------------------------------------
//  // startHandlers
//  @Override
//  protected void startHandlers() {
//    Emulators.pcsEmulatorStarter = this;
//    new Emulators().start();
//  } // startHandlers
//
//
//  //------------------------------------------------------------
//  // Emulators
//  public static class Emulators extends Application {
//    private static PCSEmulatorStarter pcsEmulatorStarter;
//
//    //----------------------------------------
//    // start
//    public void start() {
//      launch();
//    } // start
//
//    //----------------------------------------
//    // start
//    public void start(Stage primaryStage) {
//      Timer timer = null;
//      PCSCore pcsCore = null;
//      GateEmulator gateEmulator = null;
//      SensorEmulator sensorEmulator = null;
//      TicketCollectorEmulator ticketCollectorEmulator = null;
//
//      // create emulators
//      try {
//        timer = new Timer("timer", pcsEmulatorStarter);
//        pcsCore = new PCSCore("PCSCore", pcsEmulatorStarter);
//        gateEmulator = new GateEmulator("GateHandler", pcsEmulatorStarter);
//        sensorEmulator = new SensorEmulator("SensorHandler", pcsEmulatorStarter);
//        ticketCollectorEmulator = new TicketCollectorEmulator("TicketCollectorHandler", pcsEmulatorStarter);
//
//        // start emulator GUIs
//        gateEmulator.start();
//        sensorEmulator.start();
//        ticketCollectorEmulator.start();
//      } catch (Exception e) {
//        System.out.println("Emulators: start failed");
//        e.printStackTrace();
//        Platform.exit();
//      }
//      pcsEmulatorStarter.setTimer(timer);
//      pcsEmulatorStarter.setPCSCore(pcsCore);
//      pcsEmulatorStarter.setGateHandler(gateEmulator);
//      pcsEmulatorStarter.setSensorHandler(sensorEmulator);
//      pcsEmulatorStarter.setTicketCollectorHandler(ticketCollectorEmulator);
//
//
//      // start threads
//      new Thread(timer).start();
//      new Thread(pcsCore).start();
//      new Thread(gateEmulator).start();
//      new Thread(sensorEmulator).start();
//      new Thread(ticketCollectorEmulator).start();
//    } // start
//  } // Emulators
//
//
//  //------------------------------------------------------------
//  //  setters
//  private void setTimer(Timer timer) {
//    this.timer = timer;
//  }
//  private void setPCSCore(PCSCore pcsCore) {
//    this.pcsCore = pcsCore;
//  }
//  private void setGateHandler(GateHandler gateHandler) {
//    this.gateHandler = gateHandler;
//  }
//  private void setSensorHandler(SensorHandler sensorHandler) {
//    this.sensorHandler = sensorHandler;
//  }
//
//  private void setTicketCollectorHandler(TicketCollectorHandler ticketCollectorHandler) {
//    this.ticketCollectorHandler = ticketCollectorHandler;
//  }
//
//} // PCSEmulatorStarter










//Version3.0
package PCS;

import AppKickstarter.timer.Timer;

import PCS.PCSCore.PCSCore;
import PCS.GateHandler.GateHandler;
import PCS.GateHandler.Emulator.GateEmulator;
import PCS.SensorHandler.Emulator.SensorHandler;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorHandler;
import PCS.SensorHandler.Emulator.SensorEmulator;
import PCS.TicketCollectorHandler.Emulator.TicketCollectorEmulator;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

//======================================================================
// PCSEmulatorStarter
public class PCSEmulatorStarter extends PCSStarter {
  //------------------------------------------------------------
  // main
  public static void main(String [] args) {
    new PCSEmulatorStarter().startApp();
  } // main


  //------------------------------------------------------------
  // startHandlers
  @Override
  protected void startHandlers() {
    Emulators.pcsEmulatorStarter = this;
    new Emulators().start();
  } // startHandlers


  //------------------------------------------------------------
  // Emulators
  public static class Emulators extends Application {
    private static PCSEmulatorStarter pcsEmulatorStarter;

    //----------------------------------------
    // start
    public void start() {
      launch();
    } // start

    //----------------------------------------
    // start
    public void start(Stage primaryStage) {
      Timer timer = null;
      PCSCore pcsCore = null;
      GateEmulator gateEmulator = null;
      SensorEmulator sensorEmulator = null;
      TicketCollectorEmulator ticketCollectorEmulator = null;

      // create emulators
      try {
        timer = new Timer("timer", pcsEmulatorStarter);
        pcsCore = new PCSCore("PCSCore", pcsEmulatorStarter);
        gateEmulator = new GateEmulator("GateHandler", pcsEmulatorStarter);
        sensorEmulator = new SensorEmulator("SensorHandler", pcsEmulatorStarter);
        ticketCollectorEmulator = new TicketCollectorEmulator("TicketCollectorHandler", pcsEmulatorStarter);

        // start emulator GUIs
        gateEmulator.start();
        sensorEmulator.start();
        ticketCollectorEmulator.start();
      } catch (Exception e) {
        System.out.println("Emulators: start failed");
        e.printStackTrace();
        Platform.exit();
      }
      pcsEmulatorStarter.setTimer(timer);
      pcsEmulatorStarter.setPCSCore(pcsCore);
      pcsEmulatorStarter.setGateHandler(gateEmulator);
      pcsEmulatorStarter.setSensorHandler(sensorEmulator);
      pcsEmulatorStarter.setTicketCollectorHandler(ticketCollectorEmulator);


      // start threads
      new Thread(timer).start();
      new Thread(pcsCore).start();
      new Thread(gateEmulator).start();
      new Thread(sensorEmulator).start();
      new Thread(ticketCollectorEmulator).start();
    } // start
  } // Emulators


  //------------------------------------------------------------
  //  setters
  private void setTimer(Timer timer) {
    this.timer = timer;
  }
  private void setPCSCore(PCSCore pcsCore) {
    this.pcsCore = pcsCore;
  }
  private void setGateHandler(GateHandler gateHandler) {
    this.gateHandler = gateHandler;
  }
  private void setSensorHandler(SensorHandler sensorHandler) {
    this.sensorHandler = sensorHandler;
  }

  private void setTicketCollectorHandler(TicketCollectorHandler ticketCollectorHandler) {
    this.ticketCollectorHandler = ticketCollectorHandler;
  }

} // PCSEmulatorStarter


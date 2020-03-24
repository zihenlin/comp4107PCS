package PCS.SensorHandler.Emulator;

import AppKickstarter.AppKickstarter;
import AppKickstarter.misc.*;


//======================================================================
// SensorHandler
public class SensorHandler extends AppThread {
    protected final MBox pcsCore;

    //------------------------------------------------------------
    // GateHandler
    public SensorHandler(String id, AppKickstarter appKickstarter) {
        super(id, appKickstarter);
        pcsCore = appKickstarter.getThread("PCSCore").getMBox();
    } // GateHandler


    //------------------------------------------------------------
    // run
    public void run() {
        Thread.currentThread().setName(id);
        log.info(id + ": starting...");

        for (boolean quit = false; !quit;) {
            Msg msg = mbox.receive();

            log.fine(id + ": message received: [" + msg + "].");

            quit = processMsg(msg);
        }

        // declaring our departure
        appKickstarter.unregThread(this);
        log.info(id + ": terminating...");
    } // run


    //------------------------------------------------------------
    // processMsg
    protected boolean processMsg(Msg msg) {
        boolean quit = false;

        switch (msg.getType()) {
            case Poll:		   handlePollReq();	     break;
            case PollAck:	   handlePollAck();	     break;
            case Terminate:	   quit = true;		     break;
            default:
                log.warning(id + ": unknown message type: [" + msg + "]");
        }
        return quit;
    } // processMsg


    //------------------------------------------------------------
    // handlePollReq
    protected final void handlePollReq() {
        log.info(id + ": poll request received.  Send poll request to hardware.");
        sendPollReq();
    } // handlePollReq


    //------------------------------------------------------------
    // handlePollAck
    protected final void handlePollAck() {
        log.info(id + ": poll ack received.  Send poll ack to PCS Core.");
        pcsCore.send(new Msg(id, mbox, Msg.Type.PollAck, id + " is up!"));
    } // handlePollAck


    //------------------------------------------------------------
    // sendSensorSignal
    protected void sendSensorSignal() {
        // fixme: send sensor signal to PCS
        log.info(id + ": sending gate open signal to hardware.");
    } // sendGateOpenSignal

        //------------------------------------------------------------
    // sendPollReq
    protected void sendPollReq() {
        // fixme: send sensor poll request to hardware
        log.info(id + ": poll request received");
    } // sendPollReq
} // SensorHandler


package com.qualcomm.ftcrobotcontroller.Ftc9015;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class BLUE_AutoOp extends T9015Auto_Beacon {
//
@Override
public void init() {
    redAlliance = false;
    delayStartMsec = 0;

    super.init();
//    telemetry.addData("00I - ", "RED flag=" + redAlliance + " delay=" + delayStartMsec);
}

    @Override
    public void loop() {
        telemetry.addData("00L - ", "Loop BLUE flag");
        super.loop();
    }

}

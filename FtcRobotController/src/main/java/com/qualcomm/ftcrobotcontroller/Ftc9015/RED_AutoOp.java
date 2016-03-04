package com.qualcomm.ftcrobotcontroller.Ftc9015;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class RED_AutoOp extends T9015Auto_Beacon {
//

    @Override
    public void init() {
        redAlliance = true;
        super.init();
        telemetry.addData("00I - ", "RED=" + redAlliance);
    }

    @Override
    public void loop() {
        telemetry.addData("00L - ", "Loop RED flag");
        super.loop();
    }

}

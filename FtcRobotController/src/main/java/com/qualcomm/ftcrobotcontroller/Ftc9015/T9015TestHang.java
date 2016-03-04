package com.qualcomm.ftcrobotcontroller.Ftc9015;

/**
 * Autonomous program for going up the blue ramp on home side
 *
 * Key point: Robot is programmed to go forward in front of the ramp and backwards to ensure there is no debris blocking the turn path
 *
 *
 * Created by ttn on 12/29/2015.
 */

public class T9015TestHang extends T9015Hardware {
    private int v_state;
    private boolean v_inState;
    //private boolean v_forward;
    //private boolean v_turn_left;
    FtcConfig ftcConfig=new FtcConfig();

    private double degrees = 0;
    private double power = 0;

    private long delayStart;

    public T9015TestHang(){

    }

    @Override
    public void init(){
        super.init();
        v_state = 0;
        v_inState = false;
        ftcConfig.init(hardwareMap.appContext, this);
    }

    @Override
    public void loop(){
        switch(v_state) {
            case 0:
                // Reset the encoders to ensure they are at a known good value.
                telemetry.addData("0 - ", "init");
                set_hang_encoders();
                set_servo_down();

                move_to_next_state();
                telemetry.addData("ColorIsRed", Boolean.toString(ftcConfig.param.colorIsRed));
                telemetry.addData("DelayInSec", Integer.toString(ftcConfig.param.delayInSec));
                telemetry.addData("WhiteTape", Integer.toString(ftcConfig.param.whiteTape));
                telemetry.addData("RobotPosition", Integer.toString(ftcConfig.param.position));
                telemetry.addData("AutonType", ftcConfig.param.autonType);
                break;
            case 1:
                // allow the encoder to reset
                //if (reach_delay_msec(5000))
                //    if (have_hang_encoders_reset())
                        move_to_next_state();
                break;
            case 2:
                //only need to initialize encoders on first time in state
                hang_forward_state(45,0.15);
                    move_to_next_state();
                break;

            case 3:
                // allow the encoder to reset
                if (have_hang_encoders_reset())
                if (reach_delay_msec(3000))
                    move_to_next_state();
                break;
            case 4:
                hang_back_state(45,0.10);
                break;

             default:
                // The autonomous actions have been accomplished (i.e. the state has
                // transitioned into its final state.
                //
                break;
        }

    }


    //move to next state in switch loop
    void move_to_next_state() {
        v_state++;
        v_inState = false;
    }

    //check if first time in current state
    boolean first_time_in_state(){
        boolean firstTime = v_inState == false;
        v_inState = true;
        return firstTime;
    }

    void hang_forward_state(double degree, double power)
    {
        telemetry.addData(v_state + " - ", "hang forward=" + degree + "p=" + power); //displays distance and power to phone screen
        if (first_time_in_state()) {
            //set_hang_encoders();
            hang_forward();
        }
        // when encoder has reached corresponding ticks for set distance move to the next stat
        if (has_hang_moved(degree, power) || reach_delay_msec(1000)) //when encoder has reached corresponding ticks for set distance move to the next state
            move_to_next_state();

    }

    void hang_back_state(double degree, double power)
    {
        telemetry.addData(v_state + " - ", "hang backward=" + degree + "p=" + power); //displays distance and power to phone screen
        if (first_time_in_state()) {
            //set_hang_encoders();
            hang_backward();
        }
        // when encoder has reached corresponding ticks for set distance move to the next stat
        if (has_hang_moved(degree, power) || reach_delay_msec(1000)) //when encoder has reached corresponding ticks for set distance move to the next state
            move_to_next_state();

    }
    // Delay msec - return false if not timeout yet
    private double start_time = 0;
    private boolean start_timer = false;
    boolean done = false;
    boolean reach_delay_msec(int msec) {
        double cur_time = System.currentTimeMillis();
        int diff ;
        if (msec == 0) return true;

        if (start_timer == false)
        {
            done = false;
            start_timer = true;
            start_time = System.currentTimeMillis();
        }
        diff = (int)(cur_time - start_time);
        if (diff >= msec)
        {
            done = true;
            start_timer = false;
        }
        telemetry.addData("time-" , diff + " "+ msec + " " + cur_time + " " + start_time);
        return done;
    }

}

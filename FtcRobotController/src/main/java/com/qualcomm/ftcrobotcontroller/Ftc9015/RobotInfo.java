package com.qualcomm.ftcrobotcontroller.Ftc9015;

/**
 * Created by ttn on 02/11/2016.
 */

public class RobotInfo
{
    //
    // Winch subsystem.
    //
    public static final double BEACON_PUSH_POSITION            = 0.05;
    public static final double BEACON_MID_POSITION             = 0.60;
    public static final double BEACON_OFF_POSITION             = 0.98;
    public static final double BEACON_DEFAULT_POSITION         = BEACON_MID_POSITION;

    //
    // Winch subsystem.
    //
    public static final double PULLER_UP_POSITION               = 0.50;
    public static final double PULLER_DOWN_POSITION             = 0.98;
    public static final double PULLER_DEFAULT_POSITION          = PULLER_UP_POSITION;

    //
    // Back subsystem.
    //
    public static final double BACK_UP_POSITION                 = 0.999;
    public static final double BACK_DOWN_POSITION               = 0.001;
    public static final double BACK_DEFAULT_POSITION            = BACK_DOWN_POSITION;
    //
    // ClimberRelease subsystem.
    //
    public static final double CLIMBER_RELEASE_POSITION         = 0.001;
    public static final double CLIMBER_LOCK_POSITION            = 0.98;
    public static final double CLIMBER_DEFAULT_POSITION         = CLIMBER_LOCK_POSITION;

    //
    // ButtonPusher subsystem.
    //

    // Color tape
    public static final int RED_TAPE                 = 100;
    public static final int BLUE_TAPE                = 25;
    public static final int WHITE_TAPE               = 150;

    public static final double WALL_CM  = 20;

    public static final int TURN_LEFT                =0;
    public static final int TURN_RIGHT               =1;

    public static String CONGIG_FILENAME="Ftc9015Config.txt";

}   //class RobotInfo
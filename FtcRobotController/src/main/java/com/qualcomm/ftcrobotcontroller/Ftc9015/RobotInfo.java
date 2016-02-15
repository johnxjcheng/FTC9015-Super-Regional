package com.qualcomm.ftcrobotcontroller.Ftc9015;

/**
 * Created by ttn on 02/11/2016.
 */

public class RobotInfo
{
    //
    // DriveBase subsystem.
    //
    public static final double DRIVE_KP                         = 0.03;
    public static final double DRIVE_KI                         = 0.0;
    public static final double DRIVE_KD                         = 0.0;
    public static final double DRIVE_KF                         = 0.0;
    public static final double DRIVE_TOLERANCE                  = 2.0;
    public static final double DRIVE_SETTLING                   = 0.2;
    public static final double DRIVE_INCHES_PER_CLICK           = (104.0/7416.5);


    //
    // Line following PID control.
    //
    public static final double SONAR_KP                         = 0.08;
    public static final double SONAR_KI                         = 0.0;
    public static final double SONAR_KD                         = 0.0;
    public static final double SONAR_KF                         = 0.0;
    public static final double SONAR_TOLERANCE                  = 0.2;
    public static final double SONAR_SETTLING                   = 0.2;
    public static final double SONAR_INCHES_PER_CM              = (1.0/2.54);
    public static final double SONAR_BEACON_DISTANCE            = 2.0;

    public static final double COLOR_KP                         = 0.125;
    public static final double COLOR_KI                         = 0.0;
    public static final double COLOR_KD                         = 0.0;
    public static final double COLOR_KF                         = 0.0;
    public static final double COLOR_TOLERANCE                  = 2.0;
    public static final double COLOR_SETTLING                   = 0.2;
    public static final double COLOR_BLACK                      = 0.0;
    public static final double COLOR_BLUE                       = 3.0;
    public static final double COLOR_RED                        = 10.0;
    public static final double COLOR_WHITE                      = 16.0;
    public static final double COLOR_DARK_LEVEL                 = 0.0;
    public static final double COLOR_WHITE_LEVEL                = 10.0;
    public static final double COLOR_LINE_EDGE_LEVEL            = ((COLOR_DARK_LEVEL + COLOR_WHITE_LEVEL)/2.0);
    public static final double COLOR_LINE_EDGE_DEADBAND         = (COLOR_LINE_EDGE_LEVEL*0.25);

    //
    // Winch subsystem.
    //
    public static final double WINCH_KP                         = 0.5;  //TODO: needs tuning
    public static final double WINCH_KI                         = 0.0;
    public static final double WINCH_KD                         = 0.0;
    public static final double WINCH_KF                         = 0.0;
    public static final double WINCH_TOLERANCE                  = 0.2;
    public static final double WINCH_SETTLING                   = 0.2;
    public static final double WINCH_INCHES_PER_CLICK           = 1.0;
    public static final double WINCH_MIN_LENGTH                 = 0.0;
    public static final double WINCH_MAX_LENGTH                 = 23.5;
    public static final double WINCH_CAL_POWER                  = -0.2;
    public static final double WINCH_BRAKE_ON_POSITION          = 1.0;
    public static final double WINCH_BRAKE_OFF_POSITION         = 0.0;

    public static final double WINCH_TILTER_MIN_POSITION        = 0.2;
    public static final double WINCH_TILTER_MAX_POSITION        = 0.65;
    public static final double WINCH_TILTER_START_POSITION      = 0.55;
    public static final double WINCH_TILTER_MAX_STEPRATE        = 0.2;

    //
    // Back subsystem.
    //
    public static final double BACK_UP_POSITION                 = 0.999;
    public static final double BACK_DOWN_POSITION               = 0.001;

    //
    // ClimberRelease subsystem.
    //
    public static final double CLIMBER_RELEASE_POSITION         = 0.001;
    public static final double CLIMBER_LOCK_POSITION            = 0.999;

    //
    // ButtonPusher subsystem.
    //
    public static final double BEACON_LEFT                      = 0.0;
    public static final double BEACON_RIGHT                     = 1.0;
    public static final double BEACON_DOWN                      = 0.5;

    // Color tape
    public static final int RED_TAPE                 = 30;
    public static final int BLUE_TAPE                = 21;
    public static final int WHITE_TAPE               = 130;

    public static final double WALL_CM  = 20;

}   //class RobotInfo
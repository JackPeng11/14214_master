/*
 * Copyright (c)  3/19/2021. FTC Team 14214 NvyUs
 * This code is very epic
 */

package org.firstinspires.ftc.teamcode.NonRunnable.Logic.RingLogic;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.NonRunnable.Functions.DrivePath;
import org.firstinspires.ftc.teamcode.NonRunnable.NvyusRobot.Constants;

import static org.firstinspires.ftc.teamcode.NonRunnable.Functions.ImuFunctions.correctToHeading;
import static org.firstinspires.ftc.teamcode.NonRunnable.Functions.ImuFunctions.turn;
import static org.firstinspires.ftc.teamcode.NonRunnable.Functions.WobbleArmFunctions.*;

public final class FourRingsBehavior
{
    private FourRingsBehavior()
    {
    }
    
    public static void doFourRingsBehavior(LinearOpMode opMode)
    {
        DrivePath moveForwardTowardsZone = new DrivePath(0.3, 69, Constants.DriveMode.FORWARD, opMode);
        DrivePath strafeIntoZone         = new DrivePath(0.3, 9.5, Constants.DriveMode.STRAFE_LEFT, opMode);
        DrivePath goBackToLaunchLine     = new DrivePath(0.3, 34, Constants.DriveMode.BACKWARD, opMode);
        DrivePath releaseByMovingBack    = new DrivePath(0.3, 4, Constants.DriveMode.BACKWARD, opMode);
        
        moveForwardTowardsZone.go();
        strafeIntoZone.go();
        moveWobbleArmDown(opMode);
        releaseWobbleGoal(opMode);
        releaseByMovingBack.go();
        moveWobbleArmUp(opMode);
        goBackToLaunchLine.go();
        turn(180, opMode);
        correctToHeading(180, opMode);
    }
}

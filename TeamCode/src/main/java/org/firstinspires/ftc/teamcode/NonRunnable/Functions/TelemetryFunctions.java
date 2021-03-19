/*
 * Copyright (c)  3/19/2021. FTC Team 14214 NvyUs
 * This code is very epic
 */

package org.firstinspires.ftc.teamcode.NonRunnable.Functions;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public final class TelemetryFunctions
{
    private TelemetryFunctions()
    {
    
    }
    
    public static void showReady(LinearOpMode opMode)
    {
        opMode.telemetry.addLine("Hey look, I didn't throw an error");
        opMode.telemetry.update();
    }
}

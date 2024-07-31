package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

//LinearOpModes don't have the five different sections, they just run once from top to bottom. 

/**
From FTC
 * This file contains an minimal example of a Linear "OpMode". An OpMode is a 'program' that runs in either
 * the autonomous or the teleop period of an FTC match. The names of OpModes appear on the menu
 * of the FTC Driver Station. When an selection is made from the menu, the corresponding OpMode
 * class is instantiated on the Robot Controller and executed.
 *
 * This particular OpMode just executes a basic Tank Drive Teleop for a two wheeled robot
 * It includes all the skeletal structure that all linear OpModes contain.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

//this annotation makes is show up on the left drop-downn arrow on the driver station
@Autonomous
//add this annotation if you want the code to show up on the computer but not on the driver station
//@Disabled
//this class extends LinearOpMode instead of OpMode, which gives it the more limited structure
public class blankLinearOpMode extends LinearOpMode {
    //declare motor, servo, and sensor variables here
    @Override
    public void runOpMode() {
        //put hardwareMap.get(), sensor, and servo initialization here
      
        // Wait for driver to press start -- don't remove this line
        waitForStart();

        //put all your code here, in loops to limit how long it runs for based on your conditions
        //all while statements need to also check opModeIsActive() boolean so you don't crash the driver station when you stop the program

    } //close runOpMode()
} // close entire class

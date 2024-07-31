package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class blankLinearOpMode extends LinearOpMode {

  //make an object of the time, you can change runtime to whatever name you want
  private ElapsedTime runtime = new ElapsedTime();
    
    @Override
    public void runOpMode() {
      
        // Wait for driver to press start -- don't remove this line
        waitForStart();

        //reset your runtime before each action
        runtime.reset();
        //this is the easiest way to control movements on the robot in auto
        //this can be combined with sensors or some other check as a fail-safe
        while(runtime.seconds() < /*pick your number*/ && opModeIsActive()){
          //do thing
        }
      
    } //close runOpMode()
} // close entire class

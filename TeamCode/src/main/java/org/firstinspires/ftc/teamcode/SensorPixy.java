package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
import com.qualcomm.robotcore.util.ElapsedTime;

//an example of how to actually get data from pixy

@TeleOp
@Disabled
public class SensorPixy extends OpMode {
    ElapsedTime runtime = new ElapsedTime();
    private Pixy pixy; 

    @Override
    public void init() {
        pixy = hardwareMap.get(Pixy.class, "pixy"); // need this

        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }
    @Override
    public void init_loop() {
    }
    @Override
    public void start() {
    }

    @Override
    public void loop() {
        byte[] pixyBytes1 = pixy.readShort(0x51, 5); 
        telemetry.addData("number of Signature 1", pixyBytes1[0]); 
        telemetry.addData("x position of largest block of sig 1", pixyBytes1[1]); 
        byte[] pixyBytes2 = pixy.readShort(0x52, 2); 
        telemetry.addData("number of Signature 2", pixyBytes2[0]); 
        telemetry.addData("x position of largest block of sig 2", pixyBytes2[1]); 
        telemetry.update();
    }
    @Override
    public void stop() {
    }
} //close entire class

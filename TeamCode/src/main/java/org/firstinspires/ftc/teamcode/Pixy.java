package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.I2cDeviceSynch;
import com.qualcomm.robotcore.hardware.I2cDeviceSynchDevice;
import com.qualcomm.robotcore.hardware.configuration.I2cSensor;
import com.qualcomm.robotcore.util.TypeConversion;

//this is the code that makes Pixy show up as an option on the robot configuration on the driver station, just copy and past the whole thing
//it uses the LEGO I2C protocol to communicate, there's a pdf saved on the programming computer with details

@I2cSensor(name = "PixyCam", xmlTag = "Pixy")
public class Pixy extends I2cDeviceSynchDevice<I2cDeviceSynch> {
    @Override
    public Manufacturer getManufacturer(){
        return Manufacturer.valueOf("Charmed Labs");
    }
    @Override
    protected synchronized boolean doInitialize()
    {
        return true;
    }
    @Override
    public String getDeviceName() {
        return "PixyCam";
    }
    public Pixy(I2cDeviceSynch deviceClient)
    {
        super(deviceClient, true);

        this.deviceClient.setI2cAddress(I2cAddr.create7bit(0x01));

        super.registerArmingStateCallback(false);
        this.deviceClient.engage();;
    }

    public enum Register
    {
        LARGEST_BLOCK_ALL(0x50),
        SIG_1(0x51),
        SIG_2(0x52),
        SIG_3(0x53),
        SIG_4(0x54),
        SIG_5(0x55),
        SIG_6(0x56),
        SIG_7(0x57);

        public int bVal;

        Register(int bVal)
        {
            this.bVal = bVal;
        }
    }

    protected byte[] readShort(int queryAddress, int bytesToRead)
    {
        return deviceClient.read(queryAddress, bytesToRead);
    }
}

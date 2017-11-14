package org.usfirst.frc.team3082.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private Talon leftMotor;
	private Talon rightMotor;
	private RobotDrive robotDrive;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	
    public DriveTrain(int leftMotorPort, int rightMotorPort) {
    	this.leftMotor = new Talon(leftMotorPort);
    	this.rightMotor = new Talon(rightMotorPort);
    	this.robotDrive = new RobotDrive(leftMotor, rightMotor);
    }

    public void driveTank(double leftSpeed, double rightSpeed) {
    	robotDrive.tankDrive(leftSpeed, rightSpeed);
    }
}
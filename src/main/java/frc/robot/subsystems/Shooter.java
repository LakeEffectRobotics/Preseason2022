package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Subsystem to handle the shooting moter.
 */
public class Shooter extends SubsystemBase  {

    public double targetSpeed = 0.8;

	/**
	 * talon that controls shooting moter.
	 */
	TalonSRX topTalon1;


	/**
	 * Create a new ShooterSystem.
	 * 
	 * @param topTalon3 talon that controls shooting moter
	 */
	public Shooter(TalonSRX topTalon1) {
		this.topTalon1 = topTalon1;

		SmartDashboard.putNumber("ShooterSpeed", targetSpeed);
	}

	/**
	 * Set intake moter spinn speed
	 * 
	 * @param speed intake output percent, [-1, 1]
	 */
	public void setOutput(double output) {
		topTalon1.set(ControlMode.PercentOutput, output);
	}

	/**
	 * Stops the intake moter
	 */
	public void stop() {
		topTalon1.set(ControlMode.PercentOutput, 0);
	}

}
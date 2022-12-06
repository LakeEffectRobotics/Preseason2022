package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Subsystem to handle the shooting moter.
 */
public class Feeder extends SubsystemBase  {

	/**
	 * talon that controls shooting moter.
	 */
	TalonSRX topTalon2;


	/**
	 * Create a new ShooterSystem.
	 * 
	 * @param topTalon3 talon that controls shooting moter
	 */
	public Feeder(TalonSRX topTalon2) {
		this.topTalon2 = topTalon2;
	}

	/**
	 * Set intake moter spinn speed
	 * 
	 * @param speed intake output percent, [-1, 1]
	 */
	public void setOutput(double output) {
		topTalon2.set(ControlMode.PercentOutput, output);
	}

	/**
	 * Stops the intake moter
	 */
	public void stop() {
		topTalon2.set(ControlMode.PercentOutput, 0);
	}

}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
  
  private TalonSRX conveyorMotor;
  
  /** Creates a new Conveyor. */
  public Conveyor(TalonSRX conveyorMotor) {
    this.conveyorMotor = conveyorMotor;
  }

  /**
   * Set the conveyor speed
   * @param speed Speed in range [0, 1]
   */
  public void setOutput(double speed){
    conveyorMotor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

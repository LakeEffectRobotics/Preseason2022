// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
 
  private static final double SHOOTER_POWER = 1;

  public TalonSRX shootermotor;
  
 
  /** Creates a new Shooter. */
  public Shooter(TalonSRX shootermotor ) {
    this.shootermotor = shootermotor;
  }

  public void spin(){
      shootermotor.set(ControlMode.PercentOutput, SHOOTER_POWER);
  }

  public void stop (){
    shootermotor.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

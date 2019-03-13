/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ArmStrongLiftSystem extends Subsystem {
  private TalonSRX ArmStrongLiftMotor; 
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
public ArmStrongLiftSystem() {
  ArmStrongLiftMotor = new TalonSRX(RobotMap.ArmStrongLiftMotor);
  Robot.initTalon(ArmStrongLiftMotor);
}
public void ArmStrongLift(double output) { 
  ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
}

public void ArmStrongDrop(double output) {
ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
}

public void ArmStrongStop(double output) {
ArmStrongLiftMotor.set(ControlMode.PercentOutput, output);
}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

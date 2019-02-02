package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import com.revrobotics.CANSparkMax;

public class Elevator extends Subsystem {
  private CANSparkMax Elevator;

  public Elevator() {
        Elevator = new CANSparkMax(14, MotorType.kBrushless);

  }


  @Override
  public void initDefaultCommand() {

  }
}

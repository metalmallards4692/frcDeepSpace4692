package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import frc.robot.Robot;
//import frc.robot.RobotMap;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import com.revrobotics.CANSparkMax;

public class Elevator extends Subsystem {
  private CANSparkMax ElevatorMotor;

  public Elevator() {
    ElevatorMotor = new CANSparkMax(14, MotorType.kBrushless);
  }

  public void ElevatorDirection(double output) {
       
        ElevatorMotor.set(output);

  }

  


  @Override
  public void initDefaultCommand() {

  }
}

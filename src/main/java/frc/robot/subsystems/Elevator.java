package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

//import frc.robot.Robot;
//import frc.robot.RobotMap;
//import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.revrobotics.CANSparkMax;

public class Elevator extends Subsystem {
  private TalonSRX ElevatorMotor;

  public Elevator() {
    ElevatorMotor = new TalonSRX(RobotMap.ElevatorMotor);
  }

  public void ElevatorDirection(double output) {
       
        ElevatorMotor.set(ControlMode.PercentOutput, output);

  }

  


  @Override
  public void initDefaultCommand() {

  }
}

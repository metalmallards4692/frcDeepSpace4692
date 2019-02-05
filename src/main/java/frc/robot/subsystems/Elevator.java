package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import com.revrobotics.CANSparkMax;

public class Elevator extends Subsystem {
  private CANSparkMax Elevator;

  public void Elevator(double output) {
        Elevator = new CANSparkMax(14, MotorType.kBrushless);

        

        Elevator.set(1);

  }


  @Override
  public void initDefaultCommand() {

  }
}

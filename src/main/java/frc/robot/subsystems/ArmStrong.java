

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;


public class ArmStrong extends Subsystem {
  private CANSparkMax ArmStrongLift;
  private TalonSRX ArmStrong;

  public ArmStrong() {
        ArmStrongLift = new CANSparkMax(12, MotorType.kBrushless);
        ArmStrong = new TalonSRX(RobotMap.ArmStrong);

        Robot.initTalon(ArmStrong);

  }

  @Override
  public void initDefaultCommand() {
   
  }
}

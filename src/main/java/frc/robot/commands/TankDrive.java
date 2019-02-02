

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;
import frc.robot.OI;


public class TankDrive extends Command {
  public TankDrive() {
    
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    double throttle = (1.0 - Robot.m_oi.leftJoy.getThrottle()) / -1;
    Robot.driveTrain.DriveBot(ControlMode.PercentOutput, Robot.m_oi.getLeftJoyY() * throttle, Robot.m_oi.getRightJoyY() * throttle);
   
    

  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}

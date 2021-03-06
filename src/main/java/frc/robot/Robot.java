

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.LimitSwitchNormal;
import com.ctre.phoenix.motorcontrol.LimitSwitchSource;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.revrobotics.CANSparkMax;
import frc.robot.subsystems.*;
import frc.robot.commands.*;



public class Robot extends TimedRobot {
  public static DriveTrain driveTrain = new DriveTrain();
  public static Elevator elevator = new Elevator();
  public static Aldrin aldrin = new Aldrin();
  public static ArmStrong armStrong = new ArmStrong();
  public static Hatch hatch = new Hatch();
  public static Intake intake = new Intake();
  public static Pivot pivot = new Pivot();
  public static ServoStuff servoStuff = new ServoStuff();
  public static ArmStrongLiftSystem armStrongLiftSystem = new ArmStrongLiftSystem();
  private Command TankDrive;
  //private Command ArmStrongDrive;
  
 //public static TankDrive tankDrive = new TankDrive();
  public static OI m_oi;
  

  //TalonSRX RightMotor = new TalonSRX(25);
  //TalonSRX LeftMotor = new TalonSRX(27);
  //DifferentialDrive DiffDrive = new DifferentialDrive(LeftMotor, RightMotor);



  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  
  @Override
  public void robotInit() {
    m_oi = new OI();
    m_chooser.setDefaultOption("Default Auto", new TankDrive());
    TankDrive = new TankDrive();
    
    //SmartDashboard.putData("Auto mode", m_chooser);
    Robot.armStrong.ArmStrongArmIn();
    Robot.armStrong.ArmStrongFrontCylindersRetract();
    Robot.servoStuff.servoHome();
  }

  
  @Override
  public void robotPeriodic() {
  }

  
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  
  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

   
    if (m_autonomousCommand != null) {
      m_autonomousCommand.start();
    }
  }

 
  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

    TankDrive.start();
    
  }

  
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

 
  @Override
  public void testPeriodic() {
  }

  public static void initTalon(TalonSRX motor)  {
          motor.setNeutralMode(NeutralMode.Coast);
          motor.neutralOutput();
          motor.setSensorPhase(false);
          motor.configForwardLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
          motor.configReverseLimitSwitchSource(LimitSwitchSource.FeedbackConnector, LimitSwitchNormal.NormallyOpen, 0);
          motor.configNominalOutputForward(0.0, 0);
          motor.configNominalOutputReverse(0.0, 0);
          motor.configClosedloopRamp(0.5, 0);

  }
}

/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Lift extends Subsystem {
  // Put methods for controlling this subsystem
  Talon talonL = null;
  Talon talonR = null;
  // here. Call these from Commands.
  public Lift(){
    talonL = new Talon(RobotMap.LIFT_TALON_L);
    talonR = new Talon(RobotMap.LIFT_TALON_R);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

public void Up() {
talonL.set(0.5);
talonR.set(0.5);
}

public void Down() {
  talonL.set(-0.5);
  talonR.set(-0.5);
}

public void Stop() {
  talonL.set(0);
  talonR.set(0);
}
}

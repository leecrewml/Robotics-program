/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */
public class Punch extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  // Instantiation of double solenoid
  // PCM channels are in RobotMap
  DoubleSolenoid doubleS = new DoubleSolenoid(RobotMap.doubleSolenoid1, RobotMap.doubleSolenoid2);

  // "Punches" single solenoid outwards
  // "Punches" double solenoid outwards
  public void doublePunch(){
    doubleS.set(DoubleSolenoid.Value.kForward);
  }

  // Retracts double solenoid
  public void doubleRetract(){
    doubleS.set(DoubleSolenoid.Value.kReverse);
  }

  // Ensures no movement of double solenoid
  public void doubleIdle(){
    doubleS.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
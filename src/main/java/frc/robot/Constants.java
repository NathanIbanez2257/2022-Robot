
package frc.robot;


public final class Constants 
{

public static int 


///////////////////////////////         Controllers         /////////////////////////////////////////////////

nathan = 0, gio = 1, daniel = 2,                               // controller ports

leftDriveAxis = 1, rightDriveAxis = 5,                      // controller axis 



///////////////////////////////         Falcon Id's        /////////////////////////////////////////////////

rightFront = 10, rightRear = 11, leftFront = 13, leftRear = 12,      // drive ID's

shooterMotor = 16, cascadeMotor = 18,                                // cascade ID's

rotaryArmMotor = 15,                                                 // rotary arm ID



////////////////////////////////        Talon SRX       //////////////////////////////////////////////

indexMotor = 20,                                                     // indexer ID



///////////////////////////////           Controller Buttons        ////////////////////////////////////////


                    /////////////           Nathan Controls              ///////////////

rotaryForwardButton = 8, rotaryBackwardButton = 6,              // rotary arms buttons 
rotaryForwardSlowButton = 11, rotaryBackwardSlowButton = 12,

cascadeDownButton = 5, cascadeUpButton = 7,                     // cascade buttons
cascadeDownSlowButton = 14,

// IndexerOutNathan = 2, IndexerInNathan = 1,                    // indexer



                    ////////////        Gio Controls            //////////////////

IndexerOutGio = 6, IndexerInGio = 5,                    // indexer buttons
IndexerInMaxGio = 9, aimButtonPS = 14,

shooterMax = 10, shooterClose = 7, shooterMid = 8,              // shooter controls
shooterFar = 4, shooterRev = 6, lowerHub =  1, lowerHub25 = 2,                            // shooter controls 

aimRobotButton2 = 7,                                            // aiming button    



///////////////////////////             Auto                ////////////////////////////////////

tarmacDistance = -3, initialMove = 6;







public static double



////////////////////////                 Vision Tracking                /////////////////////////////////

hubHeight = 8.667, limelightHeight = 2.25, bottomAngle = 25, targetDistance1 = 10,

targetHeight = 69, limeBaseHeight = 27, limeAngle = 27,

targetDistance = 137,



////////////////////////                  PIDS for Aiming                ////////////////////////////////

shortAimKP = 0.02, longAimKP = .015,

shortAimKI = .045, longAimKI = 0.04,  

aimKD = 0.01, 

targetAngle = 0.00,

//aimKP = 0.05, aimKI = 0, aimKD1 = 0, 
//aimKP = .09, aimKI = 0.0001, aimKD = 0,


////////////////////////                  PIDS for Drive                ////////////////////////////////

distanceKP = 0.38, distanceKI = 0.09, distanceKD = 0.07, 

// distanceKP = .1 distanceKD 0.01, dKP = .13



////////////////////////                 PIDS for shooter               ////////////////////////////////

shooterKP = .001,



////////////////////////                     Encoder                    ////////////////////////////////

kEncoderDistancePerPulse = ((Math.PI * 5.75)/(24576 * 9.375)),



/////////////////////////////                Subsystem Speeds                ///////////////////////////////////

shooterMaxSpeed = 1, shooterCloseSpeed = .5, shooterMidSpeed = .6, 
shooterFarSpeed = .7, shooterRevSpeed = .4,  shooterLowerSpeed = .3, shooter25 = .25,                               


cascadeUpSpeed = .6, cascadeUpSlowSpeed = .55, 
cascadeDownSpeed = -.6, cascadeDownSlowSpeed = .55,


driveSpeed =.84, 


indexerSpeedMax = .8, indexerInSpeed = .5, indexerOutSpeed = -.5,


rotaryArmFowardSpeed = .5, rotaryArmBackwardSpeed = -.5,
rotaryArmFowardSlowSpeed = .45, rotaryArmBackwardSlowSpeed = -.45,


shooterOut = -.5;




}


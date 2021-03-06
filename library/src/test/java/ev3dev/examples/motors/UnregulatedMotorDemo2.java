package ev3dev.examples.motors;

import lejos.utility.Delay;
import ev3dev.hardware.port.MotorPort;
import ev3dev.hardware.motor.UnregulatedMotor;

//java -cp ev3-lang-java-0.2-SNAPSHOT.jar ev3dev.examples.motors.UnregulatedMotorDemo2
public class UnregulatedMotorDemo2 {

	//Robot Definition
	private static UnregulatedMotor umotor1 = new UnregulatedMotor(MotorPort.D);

    //Configuration
    private final static int motorPower = 50;
    private final static int ONE_SECOND = 1000;
	
	public static void main(String[] args) {

		//Set power for DC Motors
		umotor1.setPower(motorPower);

		//Testing DC-Motor 1
		umotor1.forward();		
		System.out.println(umotor1.isMoving());
		Delay.msDelay(ONE_SECOND);
		umotor1.stop();
		System.out.println(umotor1.isMoving());
		umotor1.backward();
		System.out.println(umotor1.isMoving());
		Delay.msDelay(ONE_SECOND);
		umotor1.stop();
		System.out.println(umotor1.isMoving());
		umotor1.forward();
		System.out.println(umotor1.isMoving());
		Delay.msDelay(ONE_SECOND);
		umotor1.stop();

        System.exit(0);
	}

}

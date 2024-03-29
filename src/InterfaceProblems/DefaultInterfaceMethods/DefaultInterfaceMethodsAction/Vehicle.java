package InterfaceProblems.DefaultInterfaceMethods.DefaultInterfaceMethodsAction;

/**
 * 
 * @author Aronno
 *
 */
public interface Vehicle {

	String getBrand();

	String speedUp();

	String slowDown();

	default String turnAlarmOn() {
		return "Turning the vehicle alarm on.";
	}

	default String turnAlarmOff() {
		return "Turning the vehicle alarm off.";
	}

}
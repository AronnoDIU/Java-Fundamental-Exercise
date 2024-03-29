package InterfaceProblems;

/**
 * 
 * @author Aronno
 *
 */
public class Client {

	private PaymentProcessor paymentProcessor;

	{
		paymentProcessor = new PayPalPaymentProcessor();
	}

	public void checkout(PaymentData payment) {
		// ... some methods calls goes here
		paymentProcessor.processPayment(payment);
		InterfaceProblems.PaymentProcessor.someStaticMethod(); // demo of static method invocation
	}

	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

}
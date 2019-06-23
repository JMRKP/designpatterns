public class Forward implements Accelerated {

	@Override 
	public Accelerated backward(){
		return Accelerations.halt;
	}

	@Override 
	public Accelerated forward(){
		return Accelerations.forward;
	}
}
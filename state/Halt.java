public class Halt implements Accelerated {
	
	@Override 
	public Accelerated backward(){
		return Accelerations.forward;
	}

	@Override 
	public Accelerated forward(){
		return Accelerations.backward;
	}
}
public abstract class Decorator implement Component {
	private Component component;
	public Decorator(Component component){
		this.component = component
	}
}
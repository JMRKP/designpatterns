class DecoratorA extends Decorator implements Component {
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public String operate(){
		return "Decorator A Operation, then " + this.component.operate();
	}
}
package abstractfactory;
public class KnightFactory implements AvatarFactory {
	@Override
	public Outfit getOutfit() {
		return new Armour();
	}
	public Weapon getWeapon() {
		return new Sword();
	}
	public Vehicle getVehicle() {
		return new Horse();
	}
}
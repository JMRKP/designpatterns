package abstractfactory;
public interface AvatarFactory {
	public Outfit getOutfit();
	public Weapon getWeapon();
	public Vehicle getVehicle();
}
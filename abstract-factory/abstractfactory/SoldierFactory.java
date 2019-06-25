package abstractfactory;

public class SoldierFactory implements AvatarFactory{

	@Override
	public Outfit getOutfit() {
		return new Camouflage();
	}

	@Override
	public Weapon getWeapon() {
		return new MachineGun();
	}

	@Override
	public Vehicle getVehicle() {
		return new Tank();
	}

}

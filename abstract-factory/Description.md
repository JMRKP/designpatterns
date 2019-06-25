# Abstract Factory
#### Creational Pattern

## Beschreibung
Die Abstract Factory definiert eine Produktfamilie, die sich aus Abstrakten Produkten (Interfaces) zusammensetzt. Implementierungen der Abstract Factory beschreiben, aus welchen konkreten Produkten sich die Familie zusammensetzt.

## Beispiel
Accelerations

## Classes 


```java
package abstractfactory;
public interface AvatarFactory {
	public Outfit getOutfit();
	public Weapon getWeapon();
	public Vehicle getVehicle();
}
```

```java
package abstractfactory;
public interface Weapon {
	public void attack();
}
```

```java
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
```

```java
public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("Ka-Cheng!");
	}

}
```
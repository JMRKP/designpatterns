#State
#### Behavioral Pattern

## Beschreibung
Ein Objekt (Context) hat verschiedene Zustände. In Abhängigkeit von seinem Zustand (State) ändert sich das Verhalten. Das Verhalten wird im Interface Zustand (State) definiert und in konkreten Zustandsklassen (Concrete State) definiert. Die Zustandsübergänge können entweder vom Context oder von Konkreten Zuständen definiert werden. Möglicherweise ist es sinnvoll, die konkreten Zustände nicht jedesmal neu zu initialisieren. Wenn eine Zusatndsmethode keinen Rückgabewert braucht, kann sie direkt den Folgezustand zurückgeben.
## Beispiel

## Classes 
Accelerations

```java
public class Move implements Accelerated {

	private Accelerated currentAcceleration;

	public Move(){
		this.currentAcceleration = Accelerations.halt;
	}

	@Override
	public Accelerated forward(){
		this.currentAcceleration = this.currentAcceleration.forward()
	}
	
	@Override
	public Accelerated backward(){
		this.currentAcceleration = this.currentAcceleration.backward()
	}	
}
```

```java
public interface Accelerated {
	Accelerated forward();
	Accelerated backward();
}
```

```java
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
```

```java
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
```

```java
public class Backward implements Accelerated {

	@Override 
	public Accelerated backward(){
		return Accelerations.backward;
	}

	@Override 
	public Accelerated forward(){
		return Accelerations.halt;
	}
}
```

```java
public class Acclerations {
	static Accelerated forward = new Farward();
	static Accelerated backward = new Backward();
	static Accelerated halt = new Halt();
}
```
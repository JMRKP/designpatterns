# Decorator Pattern
#### Structural Pattern

## Beschreibung
Erlaubt mehrere Klassen und deren Verhalten miteinander zu Laufzeit zu kombinieren. D.h. es benötigt nicht für jede Kombi eine Klasse.
Alle Klassen erben vom Decorator Interface. Konkrete Decorator Klassen sind Wrapper für andere Decorator Instanzen. Wenn operate() aufegrufen wird, wird rekursiv operate der gewrappten Instanz aufgerufen. Die innerste Klasse heißt ebenfalls Component. Der Component wrappt keine weiteren Instanzen. Daher wird beim Decorator typischerweise eine abstract Decorator Klasse eingefügt, die den gewrappten Decorator als Member deklariert.

## Beispiel
Hauptspeisen mit Beilage kombinieren. Hauptspeisen sind Components, Beilagen sind Decorators. operate() gibt den Preis zurück.

## Classes
```java
public interface Component {
	public String operate();
}
```

```java
public abstract class Decorator implement Component {
	private Component component;
	public Decorator(Component component){
		this.component = component
	}
}
```

```java
class CoreComponent implements Component {
	@Override
	public String operate(){
		return "Core Operation."
	}
}
```

```java
class DecoratorA extends Decorator implements Component {
	public Decorator(Component component){
		this.component = component;
	}
	@Override
	public String operate(){
		return "Decorator A Operation, then " + this.component.operate();
	}
}
```
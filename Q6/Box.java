package Q6;

public class Box <T>{
	public T t;
	public Box(T t) {
		this.t=t;
	}
	public void sett(T t) {
		this.t=t;
	}
	public T gett() {
		return t;
	}
}

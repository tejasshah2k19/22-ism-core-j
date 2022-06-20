import java.applet.Applet;

public class AbstractDemo {

	public static void main(String[] args) {

	}
}

abstract class Santa {
	abstract void add(); // only declaration
}

abstract class LoginModule {

	abstract public void login();

	abstract public void forgetpassword(String email);

}

abstract class Raj extends LoginModule {

	public void forgetpassword(String email) {

	}

}

class ChildRaj extends Raj {

	public void login() {

	}
}

abstract interface RBI { //pure abstract class 
	abstract void wid();

	public abstract void dep();

	public static final float ROI = 4.5f;
}

class ICICI implements RBI {
	public void wid() {

	}

	public void dep() {

	}
}
//multiple inheritance 
class AtmMenu extends Applet implements Runnable {
	public void run() {

	}
}





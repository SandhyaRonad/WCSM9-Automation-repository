package practice;

class Vehicle
{
	void start()
	{
		System.out.println("vehicel started");
	}
	void stop()
	{
		System.out.println("vehicel stopeed");
	}
}
class M800 extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("M800 started");
	}
	void shiftgear()
	{
		System.out.println("gear shifted");
	}
}
public class MethodOver1 {

	public static void main(String[] args) {
		
		M800 m = new M800();
		m.start();
		m.stop();
		m.shiftgear();

	}

}

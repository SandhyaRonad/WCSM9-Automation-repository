package practice;

class father 
{
void bike()
   {
	System.out.println("fathers bike");
	
   }
}
class son extends father
   {
    void bike()
    {
    	System.out.println("sons bike now");
    }
   }
public class Demo1 {

	public static void main(String[] args) {
		son s = new son();
		s.bike();
	}
}

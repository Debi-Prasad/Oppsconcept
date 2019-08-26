package testdebi1;

/*class animal{
	void run() {      //defining a method  
		System.out.println("Animal can run");
	}
}

class tiger extends animal{
	void run() {      //defining the same method as in the parent class  
		System.out.println("Tiger can roare");
	}
}

public class Method_Overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     tiger obj = new tiger();    //creating object.
     obj.run();   //calling method.
	}

}*/

class Bank{
	int getRateofInterest(){
		return(0);
		}
}
class sbi extends Bank{                    //where three classes are overriding the method of a parent class.  
	int getRateofInterest() {
		return(7);
	}
}
class Hdfc extends Bank{
	int getRateofInterest() {
		return(5);
	}
}
class Axis extends Bank{
	int getRateofInterest() {
		return(1);
	}
}
class Method_Overiding{
	public static void main(String[] args) {
		sbi obj = new sbi();
		Hdfc obj1 = new Hdfc();
		Axis obj2 = new Axis();
		System.out.println("SBI Interest is: "+ obj.getRateofInterest());
		System.out.println("This is Interest for Hdfc: "+ obj1.getRateofInterest());
		System.out.println("This is Interest of Axis: "+ obj2.getRateofInterest());
	}
}
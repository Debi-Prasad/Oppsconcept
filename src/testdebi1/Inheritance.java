package testdebi1;

class employee{                   //IS-A relationship
	float salary = 10000;
}

class php_developer extends employee {
	int bonus = 500;
}
class java_developer extends employee{
	int daily_allowance = 200;
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		php_developer obj1 = new php_developer();
		System.out.println("This is 1st: "+obj1.bonus);
		System.out.println("This is 1st: "+obj1.salary);
		//System.out.println("This is 1st: "+obj1.bonus);
	}

}

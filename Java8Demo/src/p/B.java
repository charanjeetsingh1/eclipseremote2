package p;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class B implements A,A2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new B().definedMethod();
		//j8iioi
		
		// Lambda Exp
		/*List list = Arrays.asList(1,2,3,4,5);
		list.forEach(i -> System.out.println(i));*/
		
		// Lambda Exp 2 
		
		A3 obj;
		/*obj = new A3(){
			public void lambDaDemo(){
				System.out.println("Lamda Demo");
			}
		};
		obj.lambDaDemo();
		*/
		
		obj = i -> {
			System.out.println("Lamda Demo2 " +i);
		};
		
		obj.lambDaDemo(6);
	}

	@Override
	public void declared() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void definedMethod() {
		System.out.println("Overridden");
	}

}

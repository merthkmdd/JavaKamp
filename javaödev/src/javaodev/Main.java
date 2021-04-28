package javaodev;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.color ="Gümüþ";
		car1.model ="Volkswagen Passat";
		car1.engine =1.6;
		car1.doors = 4;
		
		System.out.println("Arabanýn Rengi : "+car1.color);
		System.out.println("Arabanýn Modeli : "+car1.model);
		System.out.println("Arabanýn Motor hacmi : "+car1.engine);
		System.out.println("Arabanýn Kapý sayýsý : "+car1.doors);
		
		Motor moto1 = new Motor();
		
		moto1.color ="Mavi";
		moto1.model ="Honda";
		moto1.cc =650;
		
		System.out.println("Motorun Rengi :" +moto1.color);
		System.out.println("Motorun Modeli :" +moto1.model);
		System.out.println("Motorun CC deðeri :" +moto1.cc);
		

	}

}

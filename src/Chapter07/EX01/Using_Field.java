package Chapter07.EX01;

class A{
	//필드
	
	int m=3;
	int n=4;
	
	//기본생성자는 생략됨  A(){}
	
	//메소드 
	void work1() {
		int k=5;				//지역변수
		System.out.println(k);
		work2(3);				//work2(3) 메소드 호출
	}
	
	void work2(int i) {
		int j=4;
		System.out.println(i+j);
	}
	
}



public class Using_Field {

	public static void main(String[] args) {
		
		A a=new A();		//기본 생성자 호출, 생략되어 있다.
		System.out.println(a.m);
		System.out.println(a.n);
		
		//메소드 호출
		System.out.println("===========================================================");
		a.work1();

		
	}

}
interface F1
{
	void m1();
	void m2();
	void m3();
	
}
class F2 implements F1
{
	public void m1(){
		System.out.println("hi");
	}
	public void m2(){
		System.out.println("hlo");
	}
	public void m3(){
		System.out.println("bye");
	}
	public static void main (String[] args) {
		
		F2 f=new F2();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
	}
}

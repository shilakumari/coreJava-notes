package _201Certification.ocajp;


public class Test {

	public static void main(String[] args) {
		//m1();
		m2();
		
	}

	private static void m2() {
    long l=123l;
    int i=(int) l;
	
    
    byte b1=10;
    byte b2=10;
    //short sh=b1+b2;//CTE
    short sh2=(short)(b1+b2);//CTE
    
    final byte b3=127;
    final byte b4=10;
    short sh3=b3+b4;//CTE
    short sh4=(short)(b1+b2);//CTE
    
    int a=10;
    a=a++ + a + a-- - a-- + ++a;
    System.out.println(a);//10+11+11-10+10=32 
    
	}

	private static void m1() {

//		String name=/*The greatest batsman ever!  */"Sach
//				in";
//		System.out.println(name);//Sachin
		}

}

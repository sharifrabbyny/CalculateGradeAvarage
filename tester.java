package calculate;

public class tester {
	
	public static void main(String[] args) {
		
	
		
		Calculate cl = new Calculate();
		
		cl.setPc(1011, 1011);
		cl.setHw(810, 810);
		cl.setProject1(100, 100);
		cl.setProject2(96, 100);
		cl.setMidBB(44, 50);
		cl.setMidZybook(50, 50);
		cl.setFinalBB(45, 50);
		cl.setFinalZybook(70,70);
		
		System.out.println(cl.total());
		
		double[] s = new double[10];
		
		s[0] = 1011; //pc
		s[1] = 810; //hw
		s[2] = 100; //project1
		s[3] = 96; //project2
		s[4] = 44; //midbb
		s[5] = 50; //midZybook
		s[6] = 45;  //finalbb
		s[7] = 70;  //finalbb
		
		Calculate cls = new Calculate(s);
		
		System.out.println(cls.total());
		
		
		calculateExtends ll = new calculateExtends();
		
		System.out.println(ll.getFinalBB());
		System.out.println(ll.getBlablabla());
		System.out.println(cl.getFinalBB());
		
		
	}
		
	

}

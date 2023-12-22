package calculate;

public class Calculate {

	
	protected double pc; 
	protected double hw;
	protected double project1;
	protected double project2;
	protected double midBB;
	protected double midZybook;
	protected double finalBB;
	protected double finalZybook;
	
	
	public Calculate() {
		pc = 0.0; 
		hw = 0.0;
		project1 = 0.0;
		project2 = 0.0;
		midBB = 0.0;
		midZybook = 0.0;
		finalBB = 0.0;
		finalZybook = 0.0;
		
		
		
	}


	public Calculate(double pc, double hw, double project1, double project2, double midBB, double midZybook,
			double finalBB, double finalZybook) {
		
		this.pc = pc;
		this.hw = hw;
		this.project1 = project1;
		this.project2 = project2;
		this.midBB = midBB;
		this.midZybook = midZybook;
		this.finalBB = finalBB;
		this.finalZybook = finalZybook;
	}
	//i added this constructor read from an array of double
	public Calculate(double[] s) {
		
		this.pc = (s[0]/1011)*10;
		this.hw = (s[1]/810)*25;
		this.project1 = (s[2]/100)*7.5;
		this.project2 = (s[3]/100)*7.5;
		this.midBB = (s[4]/50)*12.5;
		this.midZybook = (s[5]/50)*12.5;
		this.finalBB = (s[6]/50)*12.5;
		this.finalZybook = (s[7]/70)*12.5;
	}
	
	
	
	public double getPc() {
		return pc;
	}


	public void setPc(double yourGrade, double possibleHighestGrade) {
		
		this.pc = (yourGrade/possibleHighestGrade)*10;
	}


	public double getHw() {
		return hw;
	}


	public void setHw(double yourGrade, double possibleHighestGrade) {
		this.hw = (yourGrade /possibleHighestGrade)*25;
	}


	public double getProject1() {
		return project1;
	}


	public void setProject1(double yourGrade, double possibleHighestGrade) {
		this.project1 = (yourGrade /possibleHighestGrade)* 7.5;
	}


	public double getProject2() {
		return project2;
	}


	public void setProject2(double yourGrade, double possibleHighestGrade) {
		this.project2 =  (yourGrade /possibleHighestGrade) * 7.5;
	}


	public double getMidBB() {
		return midBB;
	}


	public void setMidBB(double yourGrade, double possibleHighestGrade) {
		this.midBB = (yourGrade /possibleHighestGrade)* 12.5;
	}


	public double getMidZybook() {
		return midZybook;
	}


	public void setMidZybook(double yourGrade, double possibleHighestGrade) {
		this.midZybook = (yourGrade /possibleHighestGrade)* 12.5;
	}


	public double getFinalBB() {
		return finalBB;
	}


	public void setFinalBB(double yourGrade, double possibleHighestGrade) {
		this.finalBB = (yourGrade /possibleHighestGrade) * 12.5;
	}


	public double getFinalZybook() {
		return finalZybook;
	}


	public void setFinalZybook(double yourGrade, double possibleHighestGrade) {
		this.finalZybook = (yourGrade /possibleHighestGrade) * 12.5;
	}
	
	public double total () {
		
		return (getPc() + getHw() + getProject1() + getProject2() + getMidBB() + getMidZybook() + getFinalBB() + getFinalZybook());
	
		
	}
	

	
	
	
	

}
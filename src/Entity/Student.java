package Entity;

public class Student {

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	private String fname;

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFname() {
		return fname;
	}

	private String lname;

	public void setLname(String lname) {
		this.lname = lname;

	}

	public String getLname() {
		return lname;
	}

	private int Englishobt;

	public int getEnglishobt() {
		return Englishobt;
	}

	public void setEnglishobt(int englishobt) {
		this.Englishobt = englishobt;
	}

	private int Mathsobt;

	public int getMathsobt() {
		return Mathsobt;
	}

	public void setMathsobt(int mathsobt) {
		this.Mathsobt = mathsobt;
	}

	private int Scienceobt;

	public int getScienceobt() {
		return Scienceobt;
	}

	public void setScienceobt(int scienceobt) {
		this.Scienceobt = scienceobt;
	}

}

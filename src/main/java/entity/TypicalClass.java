package entity;

public class TypicalClass {
	
	public Long size;
	public String color;
	public Boolean valid;
	public int weigth;
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
	
	
	public void printSomething( int result) {
		System.out.println("The result is:" + result);
	} 	
	public int doTheMaths(int numberA, int numberB) {
		return numberA + numberB;
	}


}

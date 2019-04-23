/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package avocado;

/***
 * An avocado at Kroger
 * @author nicomp
 *
 */
public class Avocado {
	private String color;
	enum enumCondition {fresh, ok, squishy, useless};
	private enumCondition condition;
	private int weightInGrams;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public enumCondition getCondition() {
		return condition;
	}
	public void setCondition(enumCondition condition) {
		this.condition = condition;
	}
	public Avocado(String color, enumCondition condition, int weightInGrams) {
		setColor(color);
		setCondition(condition);
		setWeightInGrams(weightInGrams);
	}
	public int getWeightInGrams() {
		return weightInGrams;
	}
	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}
	
}

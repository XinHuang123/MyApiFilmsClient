package edu.neu.cs5200.rest.client;

public class InfoDto {
private int attack;
private int defense;
private int difficulity;
private int magic;
public InfoDto(int attack, int defense, int difficulity, int magic) {
	super();
	this.attack = attack;
	this.defense = defense;
	this.difficulity = difficulity;
	this.magic = magic;
}
public InfoDto() {
	super();
}
public int getAttack() {
	return attack;
}
public void setAttack(int attack) {
	this.attack = attack;
}
public int getDefense() {
	return defense;
}
public void setDefense(int defense) {
	this.defense = defense;
}
public int getDifficulity() {
	return difficulity;
}
public void setDifficulity(int difficulity) {
	this.difficulity = difficulity;
}
public int getMagic() {
	return magic;
}
public void setMagic(int magic) {
	this.magic = magic;
}
}

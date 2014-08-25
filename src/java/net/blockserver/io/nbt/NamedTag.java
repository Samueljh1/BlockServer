package net.blockserver.io.nbt;

public abstract class NamedTag extends Tag{
	private String name = null;
	public abstract void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}

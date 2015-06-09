package graph;

public class PrimVertex implements VertexInterface
{
	private String stringName;
	private char charName;
	private int intName; 
	private Object type; 
	
	//Getters and Setters
	public void setType(Object type) 
	{
		
		this.type = type; 
	}
	public Object getType() 
	{
		return type;
	}
	public void setStringName(String name)
	{
		this.stringName = name;
	}	
	public String getStringName()
	{
		return this.stringName;
	}
	public void setCharName(char name)
	{
		this.charName = name;
	}
	public char getCharName()
	{
		return this.charName;
	}
	public void setIntName(int name)
	{
		this.intName = name;
	}
	public int getIntName()
	{
		return this.intName;
	}
	
	
	//Methods
	//Only works with PrimVertices labeled by int. If current vertex is greater than compared one, will return positive int. Returns negative int, if less than. Returns 0 if equal.
	public int comparePrimVertex(PrimVertex anotherVertex)
	{
		return this.getIntName() - anotherVertex.getIntName();
	}
	
}

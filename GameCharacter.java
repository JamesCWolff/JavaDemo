package JavaDemo;

public class GameCharacter{
	String name;
	//hp is the health variable
	int hp;
	//def is the defense variable
	int def;
	//str is the strength variable
	int str;
	
	public void Attack(GameCharacter target){
		//Attack code goes here
		target.Attacked(str);
		
	}
	public void Attack(GameCharacter target, int damage){
		//Attack code goes here
		target.Attacked(damage);
		
	}
	
	public void SetCharecter(String n, int h, int d, int s)
	{
		name = n;
		hp = h;
		def = d;
		str = s;
		
	}
	
	public void Attacked(int damage)
	{
		//Attacked code goes here
		if(def <= damage)
			hp = hp - (damage - def);
		
		if (hp <= 0)
		{
			Dead();
		}
	}
	void Dead()
	{
		System.out.println(name + " has been defeated!");
	}
}
public class Jb28_AbstractTest
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}

abstract class Staff
{
	private String name;
	private String id;
	private double pay;
	Staff(String name,String id,double pay)
	{
		this.name = name;	//��ʼ��
		this.id = id;
		this.pay = pay;
	}
	public abstract void work();
}

class Programmer extends Staff
{
	Programmer(String name,String id,double pay)
	{
		super(name,id,pay);
	}
	public void work()
	{
		System.out.println("�����");
	}
}

class Manager extends Staff
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	public void work()
	{
		System.out.println("������Ա");
	}
}

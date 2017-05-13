public class Jb38_ObjClass
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog("daHei");
		Dog d2 = new Dog("daHei");
		Dog d3 = d1;
		Demo d = new Demo();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		//System.out.println(d1.equals(d));
		System.out.println(d1);
		System.out.println(d1.hashCode());

		Class c1 = d1.getClass();
		Class c2 = d2.getClass();
		System.out.println(c1==c2);

		System.out.println(d1.getClass().getName());
	}
}

class Dog extends Object
{
	private String name;
	Dog(String name)
	{
		this.name = name;
	}
	/*
	һ�㶼�Ḳ�Ǵ˷��������ݶ�����������ݣ������ж϶����Ƿ�����ͬ������
	*/
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Dog))
		{
			throw new ClassCastException("�����붨�岻ͬ������");
		}
		Dog d = (Dog)obj;
		return this.name == d.name;
	}
	public String toString()
	{
		return "Dog:"+name;
	}
}

class Demo
{
}
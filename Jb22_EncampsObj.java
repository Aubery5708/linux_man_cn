public class Jb22_EncampsObj
{
	//�������ķ�װ
	public static void main(String[] args) 
	{
		Person xiaoMing = new Person();
		xiaoMing.getAge(21);
		xiaoMing.speak();
	}
}

class Person
{
	private int age;
	public void getAge(int num)
	{
		if(num>=0 && num<=150)
		{
			age = num;
		}
		else
			System.out.println("����������䷶Χ��0~150");
	}
	void speak()
	{
		System.out.println("������"+age);
	}
}

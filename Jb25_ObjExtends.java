public class Jb25_ObjExtends
{
	public static void main(String[] args) 
	{
		Student a = new Student();
		a.name = "xiaoming";
		a.age = 17;
		a.study();
	}
}
/*
�̳е��ŵ�:
��ߴ��븴����
������֮������˹�ϵ����������������̬�ṩ��ǰ��
*/

class Person
{
	String name;
	int age;
}

class Student extends Person
{
	void study()
	{
		System.out.println(age+"���"+name+"����ѧϰ");
	}
}
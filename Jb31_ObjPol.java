public class Jb31_ObjPol
{
	//����Ķ�̬��;�����е����־��Ǹ����ӿڵ�����ָ��������Ķ���
	public static void main(String[] args) 
	{
		/*�Զ���������(����ת��)��è��������Ϊ��������.�����й����޷�����
		���������ƶ����й��ܵķ���*/
		Animal a = new Cat();	
		a.eat();
		//�����Ҫʹ��è�����ù��ܣ��ɽ���������ת��
		//��ʼ���ն����������������͵ı任
		Cat c = (Cat)a;	//����ת��Ŀ����Ϊ��ʹ����������÷���
		c.eat();
		c.catch();
		/*
		Cat c = new Cat();
		//Dog d = new Dog();
		//c.eat();
		method(c);
		method(new Dog());
		*/
		method(new Cat());
	}
	/*��̬�ô�����ߴ������չ�ԣ�ǰ�涨��Ĵ����ʹ�ú��ڵ�����
	�׶ˣ�ǰ�ڶ�������ݲ���ʹ�ã����ã������������������
	ʹ�ö�̬ǰ�᣺�����й�ϵ���̳С�ʵ��
	Ҫ�з�������
	
	*/
	public static void method(Animal a)
	{
		a.eat();
		if (a instanceof Cat)
		//instanceof �����ж϶���ľ������ͣ�ֻ�������������������ж�
		//ͨ��������ת��ǰ���ڽ�׳�Ե��ж�
		{
			Cat c2 = (Cat)a;
			c2.catch();
		}
		else if (a instanceof Dog)
		{
			Dog d2 = (Dog)a;
			d2.watchHome();
		}
		
	}
}

abstract class Animal
{
	abstract void eat();
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("��ʺ");
	}
	public void watchHome()
	{
		System.out.println("����");
	}
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catch()
	{
		System.out.println("׽����");
	}
}

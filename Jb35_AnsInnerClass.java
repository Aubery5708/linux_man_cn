public class Jb35_AnsInnerClass
{
	/*�����ڲ���ʹ��ǰ�᣺�ڲ������̳л���ʵ��һ���ⲿ����߽ӿ�
	�����ڲ��࣬��ʵ���������������
	*/
	public static void main(String[] args) 
	{
		new Outer().method();
	}
}

class Outer
{
	/*
	class Inner extends Demo
	{
		void show()
		{
			System.out.println("�Ǻ�"+num);
		}
	}
	*/
	public void method()
	{
		//new Inner().show();
		new Demo()
		{
			void show()
			{
				System.out.println("�ǺǺǺ�"+num);
			}
		}.show();
	}
}

abstract class Demo
{
	abstract void show();
}

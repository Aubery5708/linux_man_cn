public class Jb33_InnerClass
{
	public static void main(String[] args) 
	{
		//Outer out = new Outer();
		//out.method();

		//ֱ�ӷ����ⲿ���е��ڲ����еĳ�Ա,�ڲ��๲��ʱ
		//Outer.Inner in = new Outer().new Inner();
		//in.show();
		
		//����ڲ����Ǿ�̬�ģ��൱��һ���ⲿ��
		//Ouer.Inner in = new Outer.Inner();
		//in.show();

		//����ڲ����Ǿ�̬�ģ���Ա�Ǿ�̬��
		Ouer.Inner.fun();
	}
}

/*
�ڲ�������ص㣺
�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�г�Ա
���ⲿ��Ҫ�����ڲ����еĳ�Ա����Ҫ�����ڲ���Ķ���
*/
class Outer
{
	private static int num = 1;

	class Inner	//�ڲ���
	{
		void show()
		{
			System.out.println("�ٺ�"+num);
		}
		/*
		static void fun()	//����ڲ����ж����˾�̬���������ڲ�������Ǿ�̬��
		{
			System.out.println("fun �ٺ�"+num);
		}
		*/
	}
	public void method()	//�ⲿ������ڲ��෽��
	{
		Inner in = new Inner();
		in.show();
	}
}
/*
�ڲ���һ������������
��������ʱ�����ָ����������ﻹ�������������Է��ʱ��������������
��ʱ�ͽ����е����ﶨ��Ϊ�ڲ�������

*/
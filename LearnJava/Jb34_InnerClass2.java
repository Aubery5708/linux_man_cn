public class Jb34_InnerClass2
{
	public static void main(String[] args) 
	{
		new Outer().method();
		new Outer2().method();
	}
}

/*
Ϊʲô�ڲ������ֱ�ӷ����ⲿ���еĳ�Ա
�ڲ�������ⲿ������á�	�ⲿ����.this
*/
class Outer
{
	int num = 1;
	class Inner
	{
		int num = 2;
		void show()
		{
			int num = 3;
			System.out.println(num);	//��ӡshow�����ڵĳ�Ա
			System.out.println(this.num);	//��ӡ�ڲ��еĳ�Ա
			System.out.println(Outer.this.num);	//��ӡ�ⲿ���еĳ�Ա
		}
	}
	void method()
	{
		new Inner().show();
	}
}

//JDK1.7֮ǰ���ڲ����ھֲ�λ����ֻ�ܷ��ʾֲ��б�final���εľֲ�����
//JDK1.8ʱ���ڲ����ھֲ�λ���Ͽ���ֱ�ӷ��ʾֲ�����
class Outer2
{
	int num = 1;
	void method()
	{
		int x = 2;	//�ֲ�����x
		class Inner2
		{
			void show()
			{
				System.out.println("show"+x);
			}
		}
		Inner2 in = new Inner2();
		in.show();
	}
	
}
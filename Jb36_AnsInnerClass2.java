public class Jb36_AnsInnerClass2
{
	/*
	�����ڲ���ʹ�ó���֮һ�������������ǽӿ����ͣ����ҽӿ��еķ�������������
	������Ϊ�����ڲ�����Ϊʵ�ʲ�������
	*/
	public static void main(String[] args) 
	{
		show(new Inf()
		{
			public void show1()
			{}
			public void show2()
			{}
		});
	}

	public static void show(Inf in)
	{
		in.show1();
		in.show2();
	}
}

interface Inf
{
	void show1();
	void show2();
}

//�����ڲ����ʹ��
class Outer
{
	public void method()
	{
		Inf in = new Inf()
		{
			public void show1()
			{}
			public void show2()
			{}
		};
		in.show1();
		in.show2();
	}
}
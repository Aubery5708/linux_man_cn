public class Jb21_DataTransmit
{
	//�����������Ͳ�������
	public static void main(String[] args) 
	{
		int x = 1;
		show(x);
		System.out.println(x);	//���1
	}
	public static void show(int x)
	{
		x = 2;
	}
}
//�����������Ͳ�������
class Demo
{
	int x = 1;
	public static void main(String[] args) 
	{
		Demo data = new Demo();
		data.x = 3;
		show(data);
		System.out.println(data.x);	//���Ϊ2
	}
	public static void show(Demo data)
	{
		data.x = 2;
	}
}
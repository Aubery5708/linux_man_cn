public class Jb20_Object
{
	public static void main(String[] args) 
	{
		Car benz = new Car();	//ͨ��new�ؼ��ִ���һ��Car��ʵ��
		benz.wheel = 4;
		benz.color = "green";
		benz.run();	//���ö����е�run����

		Car gtr1 = new Car();
		Car gtr2 = new Car();
		show(gtr1);
		show(gtr2);
	}
	/*
	��������
	Car benz = new Car();
	benz.run();
	��������д����
	new Car().run();

	����Է���ֻ��һ�ε��õ�ʱ�򣬿ɼ�Ϊ��������
	�������������Ϊʵ�ʲ������д���
	Car gtr1 = new Car();
	show(gtr1);
	show(new new Car());
	*/

	public static void show(Car car)	//�����͵ı���һ��ָ����󣬷����Ϊnull
	{
		car.wheel = 6;
		car.color = "red";
		System.out.println(car.wheel+"\t"+car.color);
	}
}

class Car
{
	int wheel;	//int wheel = 4;��ʾ��ʼ��ֵΪ4
	String color;
	void run()
	{
		//int num = 6;	�ֲ���������ӡnumΪ6
		System.out.println(wheel+"\t"+color);
	}
}
/*
���Ƕ����ʵ��������
�����ࣺ�������еĳ�Ա
��Ա����Ա����>>:���ԣ���Ա����>>:��Ϊ

��Ա������ֲ�����������
��Ա�������������У��������ж����Է���
�ֲ����������ں��������;ֲ�������У�ֻ������������Ч

��Ա�������ڶ��ڴ�Ķ�����
�ֲ���������ջ�ڴ�ķ�����

��Ա���������󴴽������ڣ�������ʧ����ʧ
�ֲ���������������ִ�ж����ڣ����������������ʧ

��Ա��������Ĭ�ϳ�ʼ��ֵ
�ֲ�����û��Ĭ�ϳ�ʼ��ֵ

*/

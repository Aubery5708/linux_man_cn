/*
��һ�����еķ������ǳ���ʱ�����Խ��ó������ýӿڵ���ʽ����ͱ�ʾ��
abstract class Demo
{
	abstract void show1();
	abstract void show2();
}

����ӿڵĹؼ���interface
�ӿڳ����ĳ�Ա����Ա���й̶������η�
ȫ�ֳ�����public static final
���󷽷���public abstract
�̽ӿ��еĳ�Ա����public��������Ȩ��
*/
interface Demo
{
	public static final int NUM = 4;
	public abstract void show1();
	public abstract void show2();
}

/*������֮��̳й�ϵ������ӿ�֮��ʵ�ֹ�ϵ���ӿ���ӿ�֮��̳й�ϵ���ҽӿڿ��Զ�̳�
�ӿڲ���ʵ������ֻ����ʵ�ֽӿڵ����ಢ�����˽ӿ����г��󷽷��󣬸��������ʵ����
���򣬸�������һ��������
*/
class DemoImpl implements Demo
{
	public void show1()
	{}
	public void show2()
	{}
}

/*
Java�в�֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ����
�ö�ʵ���������һ�������ʵ�ֶ���ӿ�

*/

interface A
{
	public void show1();
}

interface B
{
	public void show2();
}

class Test implements A,B	//��ʵ��
{
	public void show()
	{
		System.out.println("OK");
	}
}

//һ����̳���һ�����ͬʱ������ʵ�ֶ���ӿ�
class C
{
	public void method()
	{}
}

abstract class Test2 extends C implements A,B
{
	
}

public class Jb29_Interface
{
	public static void main(String[] args) 
	{
		/*DemoImpl inf = new DemoImpl();
		System.out.println(inf.NUM);
		System.out.println(DemoImpl.NUM);
		System.out.println(Demo.NUM);*/

	}
}
/*
�ӿںͳ��������ͬ�㣺���ǲ������ϳ�ȡ����
��ͬ�㣺��������Ҫ���̳У�����ֻ�ܵ��̳С��ӿ���Ҫ��ʵ�֣����Զ�̳�
�������п��Զ�����󷽷��ͷǳ��󷽷�������̳к󣬿���ֱ��ʹ�÷ǳ��󷽷�
�ӿ�ֻ�ܶ�����󷽷�������������ʵ��
������ļ̳У��������ϵ�Ļ�����������
�ӿڵ�ʵ�֣��������ϵ�Ķ��⹦��
*/
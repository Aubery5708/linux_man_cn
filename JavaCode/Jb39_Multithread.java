public class Jb39_Multithread
{
	/*
	���̣��������еĳ�����ϵͳ������Դ����͵��ȵĻ�����λ
	�̣߳�������һ���������ִ�еĿ��Ƶ�Ԫ��һ�������пɶ�ִ��·��
	һ����������һ���̡߳�
	�����̷߳�ʽ֮һ���̳�Thread��
	���裺
	1������һ����̳�Thread��
	2������Thread���е�run����
	3��ֱ�Ӵ���Thread��������󴴽��߳�
	4������start���������̲߳�����run������ʼִ��
	*/
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		Demo d1 = new Demo("�߳�1");
		Demo d2 = new Demo("�߳�......��");
		d1.start();	//�����߳�1,����run����
		d2.start();
		System.out.println("Hello World!");	//�߳���
	}
}

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for (int x=0;x<9 ;x++)
		{
			for (int y=0; y<27; y++)
			{
			}
			System.out.println(name+Thread.currentThread().getName()+"..."+x);	//ͨ��Thread��getName������ȡ���������
		}
	}

/*	public void show()
	{
		for (int x=0;x<10 ;x++ )
		{
			for (int y=0;y<100 ;y++ )
			{
				System.out.println(name+"x="+x);
			}
		}		
	}*/
}
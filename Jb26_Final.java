public class Jb26_Final
{
	public static void main(String[] args) 
	{
		
		System.out.println("Hello World!");
	}
}
//�̳еı׶�:�����˷�װ�ԣ��Ḳ�Ǹ��෽��
		/*
		final�ؼ��ֿ��������ࡢ�����ͱ���
		���ε��಻�ܱ��̳м̳�
		���εķ��������Ա�����
		���εı����Ǹ�������ֻ�ܱ���ֵһ��
		�ڲ���ֻ�ܷ��ʱ�final���εľֲ�����
		����������ĸ��Ҫ��д�����������_����
		*/
class Fu
{
	void method()
	{
		//���õײ�ϵͳ��Դ	
	}
}

class Zi extends Fu
{
	void method()
	{
		//	final int x = 1;
		//	x = 2;	�˻���ʾ��������xΪ���ձ������޷���ֵ
		System.out.println("OK");
	}
}

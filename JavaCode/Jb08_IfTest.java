public class Jb08_IfTest
{
	public static void main(String[] args) 
	{
	//	�����û����������ֵ���жϳ���Ӧ������
		int week = 3;
		if (week==1)
		{
			System.out.println(week+"������һ");
		}
		else if (week==2)
		{
			System.out.println(week+"�����ڶ�");
		}
		else if (week==3)
		{
			System.out.println(week+"��������");
		}else
		{
			System.out.println("�������������1-3������");
		}
	
	//	���󣺸����û�������ֵ�������Ӧ�ļ��ȡ�
		int month = 3;
		if (month<1 || month>12)
		{
			System.out.println("û�д˼���");
		}
		else if (month>=3 && month<=5)
		{
			System.out.println(month+"���Ǵ���");
		}
		else if (month>=6 && month<=8)
		{
			System.out.println(month+"�����ļ�");
		}
		else
		{
			System.out.println(month+"���Ƕ���");
		}
	}
}

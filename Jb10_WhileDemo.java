public class Jb10_WhileDemo
{
	public static void main(String[] args) 
	{
	//	ѭ���ṹ
	/*
	while����ʽ��
	while (�������ʽ)
	{
		ִ�����;
	}
	do
	{
		ִ�����;
	}
	while (�������ʽ);
	do while�ص㣺
		���������Ƿ����㣬ѭ��������ִ��һ��
	*/
	/*
		int x = 1;
		do
		{	
			System.out.println("x="+x);
			x++;
		}
		while (x<2);

		int y = 1;
		while (y<2)
		{
			System.out.println("y="+y);
		}
		*/
		//��ȡ1��100���ֵĺ�:���������ۼ�˼��
		int x = 1;
		int sum = 0;
		while (x<=100)
		{
			sum+=x;
			x++;
		}
		System.out.println("sum="+sum);
	}
}

public class Jb11_WhileTest
{
	public static void main(String[] args) 
	{
		//���1��100֮���2�ı����м�����������˼��
		int x = 1;
		int count = 0;
		while (x<=100)
		{
			if (x%2==0)
			{
				count++;
			}
			x++;
		}
		System.out.println("1~100֮��2�ı��������ܹ���"+count);
	}
}

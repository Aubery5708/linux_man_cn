public class Jb15_Function2
{
	public static void main(String[] args) 
	{
		//draw(7,8);
		getLevel(99);
	}
	/*����������κ�������
	public static void draw(int row,int col)
	{
		for (int x=1;x<=row ;x++ )
		{
			for (int y=1;y<=col ;y++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		return;	//�˴�return��ʡ�ԣ�������ֵ�������Ͳ�ȷ����ʹ��voidʱ����ʡ��return
	}
	*/
	//���ݷ��������Ӧ�ȼ�
	public static void getLevel(int grade)
	{
		if (grade<0 || grade>100)
		{
			System.out.println("����");
		}
		else if (grade>=90 && grade<=100)
		{
			System.out.println("A");
		}
		else if (grade>=60 && grade<=89)
		{
			System.out.println("B");
		}
		else
			System.out.println("C");
		return;
	}
}

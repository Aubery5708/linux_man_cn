public class Jb17_ArrDemo
{
	public static void main(String[] args) 
	{
		/*���鶨���ʽ1��
		Ԫ������[] ������ = new Ԫ������[Ԫ�ظ��������鳤��];
		��ʽ2��
		Ԫ������[] ������ = new Ԫ������[] {Ԫ��,Ԫ��,........};
		����Ĳ������ԽǱ���в�������0�Ǳ꿪ʼ��
		*/
		//int [] arr = new int[]{2,54,4,5,4,4,5,79};
		int [] arr = {-2,-5,-79,-9};
		for (int x=0;x<arr.length ; x++)
		{
			System.out.println("arr["+x+"] = "+arr[x]);
		}

		int max = getMax(arr);
		System.out.println("���ֵ��"+max);
	}
	//���幦�����������ֵ
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int x=1 ;x<arr.length ;x++ )
		{
			if (arr[x]>max)
			{
				max = arr[x];
			}
		}
		return max;
	}
}

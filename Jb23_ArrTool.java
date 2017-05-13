/**
�ĵ�ע��
����һ����������Ĺ����࣬��������������ĺ���
@author XiaoMing
@version V1.0
*/

public class Jb23_ArrTool
{
	/*����ķ������Ǿ�̬�ģ��̸��಻��Ҫ�������󣬽�ʡ�ڴ�
	Ϊ��ȷ�������������򴴽�������󣬽�����Ĺ��캯�����г�ʼ����*/
    private Jb23_ArrTool(){}

	/**��ȡ������������ֵ
	@param arr ����һ��Ԫ��Ϊint���͵�����
	@return �������е����Ԫ��ֵ*/
    public static int getMax(int[] arr)
    {
        int maxIndex = 0;
        for (int x=1;x<arr.length ;x++ )
        {
            if (arr[x]>arr[maxIndex])
            {
                arr[maxIndex] = arr[x];
            }
        }
        return arr[maxIndex];
    }
	//����ѡ������
	public static void selectSort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=x+1; y<arr.length; y++)
			{
				if (arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	//����Ԫ�ص�λ�û�λ
	public static void swap (int[] arr,int x,int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	//��ȡָ��Ԫ����ָ������ĽǱ꣬�����ڷ���-1
	public static int getIndex(int[] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if (arr[x]==key)
			{
				return x;
			}
		}
		return -1;
	}
	//��int����ת�����ַ���
	public static String arrayToString(int[] arr)
	{
		String s = "";
		for (int x=0; x<arr.length;x++ )
		{
			if (x!=arr.length-1)
				s = s + arr[x]+",";
			else
				s = s + arr[x];
		}
		return s;
	}
}


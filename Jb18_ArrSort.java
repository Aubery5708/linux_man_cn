import java.util.*;

public class Jb18_ArrSort
{
    public static void main(String[] args)
    {
        int[] arr = {71,15,4,50,54,55,5,45,454,496,78,};
        ergodic(arr);
        //selectSort(arr);	//����ѡ������
        //bubbleSort(arr);	//����ð������
        Arrays.sort(arr);	//����Java����õ�������
        ergodic(arr);
    }
    //��������
    public static void ergodic(int[] arr)
    {
        for (int x=0; x<arr.length; x++)
        {
            if (x!=arr.length-1)
                System.out.print(arr[x]+",");
            else
                System.out.println(arr[x]);
        }
    }
    /*ѡ������
    public static void selectSort(int[] arr)
    {
    	for (int x=0;x<arr.length-1 ;x++ )
    	{
    		for (int y=x+1;y<arr.length ; y++)
    		{
    			if (arr[x]>arr[y])
    			{
    				int temp = arr[x];
    				arr[x] = arr[y];
    				arr[y] = temp;
    			}
    		}
    	}
    }
    */
    //ð������
    public static void bubbleSort(int[] arr)
    {
        for (int x=0; x<arr.length-1; x++)
        {
            for (int y=0;y<arr.length-x-1 ;y++ )	//-x����
            {
                if (arr[y]>arr[y+1])
                {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }
}

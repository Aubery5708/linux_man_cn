public class Jb37_ObjExcep
{
	/*�쳣������ʱ�����Ĳ��������
	���ࣺ
		Throwable:Error��Exception

		�쳣����:��׽��ʽ
	��ʽ��
	try
	{
		��Ҫ������쳣�Ĵ���
	}
	catch (�쳣�� ����) �������ڽ��շ����쳣�Ķ���
	{
		�����쳣�Ĵ���
	}
	finally
	{
		һ����ִ�еĴ���
	}
	*/
	
	public static void main(String[] args)	//������throws MinusIndexException
	{
		int [] arr = new int[3];
		Demo d = new Demo();
		try
		{
			int num = d.method(arr,-27);
			System.out.println("Hello World!"+num);
		}
		catch (MinusIndexException m)	//���catch��Ҫ�Ѹ���exception�������
		{
			m.printStackTrace();//JVMĬ�ϵ��쳣�������
			System.out.println("�Ǳ겻Ϊ��");
			//System.exit(0);//�˳�JVM
		}
		finally	//ͨ�������ͷ���Դ
		{
			System.out.println("finally");
		}
	}
}

class Demo
{
	public int method (int[] arr,int index)throws MinusIndexException	//����:
	{
		if (arr==null)
		{
			throw new NullPointerException("�������ò���Ϊ��");
		}
		if (index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("�Ǳ�Խ��"+index);
		}
		if (index<0)
		{
			throw new MinusIndexException();
		}
		return arr[index];
	}
}

/*�Զ����쳣��
��Ҫһ�����Ϊ�쳣�࣬����̳��쳣��ϵ��
ֻ���쳣��ϵ��������п����ԣ����ܱ��ؼ���throws��throw������
*/
class MinusIndexException extends Exception
{
	MinusIndexException()
	{
	}
	MinusIndexException(String msg)
	{
		super(msg);
	}
}
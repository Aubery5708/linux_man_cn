public class Jb30_Interface2
{
	//ʵ�ֵ���USB�ӿڹ���
	public static void main(String[] args) 
	{
		useUSB(new Upan());
	}
	public static void useUSB(USB u)	//�ӿ����͵����ã����ڽ��գ�ָ�򣩽ӿڵ��������
	{
		u.open();
		u.close();
	}
}

interface USB
{
	public void open();
	public void close();
}

class Upan implements USB
{
	public void open()
	{
		System.out.println("����");
	}
	public void close()
	{
		System.out.println("�ر�");
	}
}
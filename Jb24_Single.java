public class Jb24_Single
{
	//�������ģʽ
	//������⣺ȷ��һ�������ڴ��еĶ���Ψһ��
	public static void main(String[] args) 
	{
		//Single sDemo = Single.getInstance();
		Single sDemo = Single.s;	//��ͬ��Single sDemo = Single.getInstance();
	}
}

class Single
{
	static Single s = new single();
	private Single(){};
	public static Single getInstance()
	{
		return s;
	}
}

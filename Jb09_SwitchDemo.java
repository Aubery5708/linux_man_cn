public class Jb09_SwitchDemo
{
	public static void main(String[] args) 
	{
	//	ѡ��ṹ��Switch
	/*
		switch (���ʽ)
		{
		case ȡֵ1:
			ִ�����;
			break;
		case ȡֵ2:
			ִ�����2;
			break;
			......
		default:
			ִ�����;
			break;
		}
	*/
		//�����������֣������Ӧ����
		int month = 3;
		switch (month)
		{
		case 3:
		case 4:
		case 5:
			System.out.println("�Ǵ���");
			break;
		default:
			System.out.println("û�ж�Ӧ�ļ���");
			break;	//�˴�break��ʡ��
		}
		/*
	if��switch��Ӧ�ó�����
if:
	1���Ծ����ֵ�����ж�
	2���������ж�
	3������������boolean���͵ı��ʽ�����ж�
switch��
	1���Ծ����ֵ�����ж�
	2��ֵ�ĸ����ǹ̶��ģ�����ֻ�м����̶�����ֵ�����жϣ�������switch��Ч�ʸ��ߡ�
	*/
	}
}

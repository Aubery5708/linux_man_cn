public class Jb32_PolMember
{
    /*
    ��̬ʱ����Ա���ص�
    ��Ա������
    ����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա�������������ͨ�����������ʧ��
    ����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա�����������и��������͵ĳ�Ա����
    ͨ�׵Ľ�����������ж��ο��Ⱥ���ߣ�Fu f = new Zi();

    ��Ա����(�Ǿ�̬)��
    ����ʱ���ο������ͱ��������������Ƿ��е��õĺ������������ͨ�����������ʧ��
    ����ʱ���ο����Ƕ��������������Ƿ��е��õĺ���
    ͨ�׵Ľ�������ο��Ⱥ���ߣ����вο��Ⱥ��ұ�

    ��̬������
	����ʱ���ο������ͱ��������������Ƿ��е��õľ�̬����
	����ʱ���ο������ͱ��������������Ƿ��е��õľ�̬����
	ͨ�׵Ľ�����������ж��ο��Ⱥ����
	��̬����������Ҫ����Ҳ�У�ֱ������������
    */
    public static void main(String[] args)
    {
        Fu f = new Zi();
        f.method();	//���Բ���Ҫ���������ã���ͬ��ֱ������������Fu.method();,
        //f.show();
        //System.out.println(f.num);
    }
}

class Fu
{
    int num = 1;
    void show()
    {
        System.out.println("FU");
    }
    static void method()
    {
        System.out.println("FU static");
    }
}

class Zi extends Fu
{
    int num = 2;
    void show()
    {
        System.out.println("ZI");
    }
    static void method()
    {
        System.out.println("ZI static");
    }
}
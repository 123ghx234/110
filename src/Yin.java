public class Yin
{
    public static void main(String[] args)
    {
        int a[]={1,2,3};
        YinYong(a);

    }
    public static void YinYong(int a[])
    {
        a[2]=90;
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);//a[2]的值改变；
        }
    }
}

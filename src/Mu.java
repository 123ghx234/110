import java.io.File;

public class Mu
{

    public static void main(String[] args)
    {
        File file=new File("F:/xiaohuahua");//转义字符：\本身有作用
        MuLu(file);
    }
    public static void MuLu(File file)
    {
        if (file.isDirectory())
        {
            File file1[]=file.listFiles();//出口
            for (File file2:file1)
            {
                //开始递归
                MuLu(file2);
            }
        }
        else
        {
            System.out.println(file.getName());
        }
    }
}

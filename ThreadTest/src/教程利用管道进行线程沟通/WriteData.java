package 教程利用管道进行线程沟通;

import java.io.PipedOutputStream;

public class WriteData
{
	public void writeMethod(PipedOutputStream out)
	{
		try
		{
			System.out.println("write :");
			for(int i=0;i<300;i++)
			{
				String outData=""+(i+1);
				out.write(outData.getBytes());
				System.out.println(outData);
			}
			System.out.println();
			out.close();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}

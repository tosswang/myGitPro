package 教程利用管道进行线程沟通;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run
{

	public static void main(String[] args)
	{
		try
		{
			WriteData writeData=new WriteData();
			ReadData  readData=new ReadData();
			
			PipedInputStream inputStream=new PipedInputStream();
			PipedOutputStream outputStream=new PipedOutputStream();
			
			//inputStream.connect(outputStream);
			outputStream.connect(inputStream);
			
			ThreadRead threadRead=new ThreadRead(readData,inputStream);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite=new ThreadWrite(writeData,outputStream);
			threadWrite.start();
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}

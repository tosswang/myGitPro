package 教程数据库交叉备份;

public class BackupA extends Thread
{
	private DBTools dbTools;
	
	public BackupA(DBTools dbTools)
	{
		this.dbTools=dbTools;
	}
	
	@Override
	public void run()
	{
		this.dbTools.backupA();
	}
}

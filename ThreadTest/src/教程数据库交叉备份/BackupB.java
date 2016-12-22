package 教程数据库交叉备份;

public class BackupB extends Thread
{
private DBTools dbTools;
	
	public BackupB(DBTools dbTools)
	{
		this.dbTools=dbTools;
	}
	
	@Override
	public void run()
	{
		this.dbTools.backupB();
	}
}

package �̳����ݿ⽻�汸��;

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

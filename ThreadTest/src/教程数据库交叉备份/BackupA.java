package �̳����ݿ⽻�汸��;

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

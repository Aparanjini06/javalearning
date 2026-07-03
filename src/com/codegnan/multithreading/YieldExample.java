package com.codegnan.multithreading;

public class YieldExample {
	public static void main(String[] args) {
		BackupWorker backupTask1=new BackupWorker("Backup-Worker-A");
		
		Thread workerA=new Thread(backupTask1);
		workerA.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Starting backup worker");
		
	}
}

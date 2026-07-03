package com.codegnan.multithreading;

public class BackupWorker implements Runnable {
	private final String workerName;

	public BackupWorker(String workerName) {
		super();
		this.workerName = workerName;
	}

	@Override
	public void run() {
		System.out.println(workerName+" starting work ");
		for(int i=1;i<=5;i++)
		{
			System.out.println(workerName+" processing file back");
			//Thread.
		}
		System.out.println(workerName+" finished its cycle");
	}

}

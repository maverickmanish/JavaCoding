package cron.job;

import java.util.Timer;

public class Main{
	   public static void main(String[] args){
	     Timer t = new Timer();
	     MyTask task = new MyTask();
	     // This task is scheduled to run every 10 seconds

	 t.scheduleAtFixedRate(task, 0, 10000);
	   }

	}
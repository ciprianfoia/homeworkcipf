package ro.tm.siit.homework.w3d2.timer;

import java.util.Scanner;

public class Time {
	private double startTime, stopTime, resumeTime, exitTime;
	private double allBreakTime = 0;
	private double workingTime = 0;
	Person person = new Person("ciprian_foia");
	Scanner input = new Scanner(System.in);

	public void startWork() {
		startTime = System.currentTimeMillis();
		System.out.println(person.getName() + " started work");
		System.out.println("\ntype stop to stop work, or type exit to leave office");
		String choice = input.next();
		if (choice.equals("stop")) {
			this.stopWork();
		} else if (choice.equals("exit")) {
			this.exitWork();
		}
	}

	public void stopWork() {
		stopTime = System.currentTimeMillis();
		System.out.println(person.getName() + " stoped work");
		System.out.println("\ntype resume, to get back to work");
		String choice = input.next();
		if (choice.equals("resume")) {
			this.resumeWork();
		}
	}

	public void resumeWork() {
		resumeTime = System.currentTimeMillis();
		double breakTimeSession = resumeTime - stopTime;
		allBreakTime += breakTimeSession;
		System.out.println(person.getName() + " resumed work after break");
		System.out.println("\ntype stop for another break, or type exit to leave office");
		String choice = input.next();
		if (choice.equals("stop")) {
			this.stopWork();
		} else if (choice.equals("exit")) {
			this.exitWork();
		}

	}

	public void exitWork() {
		exitTime = System.currentTimeMillis();
		System.out.println(person.getName() + " exit work for today");
		this.countTimeWorking();
		System.out.println("time worked today= "+this.transformTime());
	}

	public double countTimeWorking() {
		double totalTimeAtOffice = exitTime - startTime;
		workingTime = totalTimeAtOffice - allBreakTime;
		return workingTime;
	}

	public String transformTime() {
		int h = (int) ((workingTime / 1000) / 3600);
		int m = (int) (((workingTime / 1000) / 60) % 60);
		int s = (int) ((workingTime / 1000) % 60);
		return h+":"+m+":"+s;
	}
}

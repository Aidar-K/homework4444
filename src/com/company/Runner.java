package com.company;

public class Runner extends Thread {

    private Runner runner1;
    private Runner runner2;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner runnerBefore, Runner runnerAfter) {
        this.runner1 = runnerBefore;
        this.runner2 = runnerAfter;
    }

    @Override
    public synchronized void run() {
        try {
            System.out.println(getName() + " берет палочку");
            if (getName().equals("runner5")) {
                System.out.println(getName() + " бежит к финишу");
                System.out.println(getName() + " бежит к " + runner1.getName());
                sleep(5000);
            } else {
                System.out.println(getName() + " бежит к " + runner2.getName());
                sleep(5000);
                runner2.start();
                runner2.join();
            }
            System.out.println(getName() + " берет палочку");
            if (!getName().equals("runner1")) {
                System.out.println(getName() + " бежит к " + runner1.getName());
                sleep(5000);
            } else
                System.out.println("забег окончен");

        } catch (Exception ignore) {
        }
    }
}
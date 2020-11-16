package com.company;

public class Main {
    public static void main(String[] args) {

        Runner runner1 = new Runner("Runner1");
        Runner runner2 = new Runner("Runner2");
        Runner runner3 = new Runner("Runner3");
        Runner runner4 = new Runner("Runner4");
        Runner runner5 = new Runner("Runner5");


        runner1.setRunners(runner5, runner2);
        runner2.setRunners(runner1, runner3);
        runner3.setRunners(runner2, runner4);
        runner4.setRunners(runner3, runner5);
        runner5.setRunners(runner4, runner1);

        runner1.start();
    }
}
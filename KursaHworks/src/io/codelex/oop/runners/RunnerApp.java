package io.codelex.oop.runners;

public class RunnerApp {
    public static void main(String[] args) {
        int interRunner = 285;
        int runnerBegins = 420;
        int expertRuns = 212;

        Runner interLevel = Runner.getFitnessLevel(interRunner);
        Runner beginsLevel = Runner.getFitnessLevel(runnerBegins);
        Runner expertLevel = Runner.getFitnessLevel(expertRuns);


        System.out.println(interLevel);
        System.out.println(beginsLevel);
        System.out.println(expertLevel);
    }
}

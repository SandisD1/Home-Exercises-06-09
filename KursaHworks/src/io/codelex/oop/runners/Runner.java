package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(315, 500),
    INTERMEDIATE(225, 325),
    ADVANCED(0, 225);

    private int minimumMinutes;
    private int maximumMinutes;

    Runner(int minimumMinutes, int maximumMinutes) {
        this.minimumMinutes = minimumMinutes;
        this.maximumMinutes = maximumMinutes;
    }

    public static Runner getFitnessLevel(int minutesRun) {
        for ( Runner level : values()) {
            if (minutesRun >= level.minimumMinutes && minutesRun <=level.maximumMinutes) {
                return level;
            }
        }
        return null;}

}
//        return Arrays.stream(values())
//                .filter(r -> minutesRun >= r.minimumMinutes && minutesRun <= r.maximumMinutes)
//                .findFirst()
//                .orElse(null);
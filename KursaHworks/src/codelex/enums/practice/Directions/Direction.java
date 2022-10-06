package codelex.enums.practice.Directions;

public enum Direction {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("west");
    private final String direct;

    Direction(String direct) {
        this.direct = direct;

    }

    public String getDirect() {
        return direct;
    }

    public static void printValues() {
        for (int i = 0; i < Direction.values().length; i++) {
            System.out.println(Direction.values()[i] + ":" + Direction.values()[i].getDirect() + ":" + i);
        }
    }

}





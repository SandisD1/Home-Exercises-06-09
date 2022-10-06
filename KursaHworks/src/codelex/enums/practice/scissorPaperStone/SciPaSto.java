package codelex.enums.practice.scissorPaperStone;

public enum SciPaSto {
    SCISSOR("s"),
    PAPER("p"),
    STONE("t");

    private final String letter;

    SciPaSto(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public static SciPaSto getTurnByLetter(String letter) {
        for (SciPaSto option : values()) {
            if (option.letter.equals(letter)) {
                return option;
            }
        }
        return null;
    }

    public static SciPaSto getTurnByInt(int choice) {
        return SciPaSto.values()[choice];
    }
}

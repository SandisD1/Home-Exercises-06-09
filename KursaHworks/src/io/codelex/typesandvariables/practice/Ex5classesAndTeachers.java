package io.codelex.typesandvariables.practice;

public class Ex5classesAndTeachers {

    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";

        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett ";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";


        System.out.println("+" + "-".repeat(60) + "+");

        System.out.println("| 1 |" + " ".repeat(37 - course1.length()) + course1 + " |"
                + " ".repeat(16 - teacher1.length()) + teacher1 + " |");

        System.out.println("| 2 |" + " ".repeat(37 - course2.length()) + course2 + " |"
                + " ".repeat(16 - teacher2.length()) + teacher2 + " |");

        System.out.println("| 3 |" + " ".repeat(37 - course3.length()) + course3 + " |"
                + " ".repeat(16 - teacher3.length()) + teacher3 + " |");

        System.out.println("| 4 |" + " ".repeat(37 - course4.length()) + course4 + " |"
                + " ".repeat(16 - teacher4.length()) + teacher4 + " |");

        System.out.println("| 5 |" + " ".repeat(37 - course5.length()) + course5 + " |"
                + " ".repeat(16 - teacher5.length()) + teacher5 + " |");

        System.out.println("| 6 |" + " ".repeat(37 - course6.length()) + course6 + " |"
                + " ".repeat(16 - teacher6.length()) + teacher6 + " |");

        System.out.println("| 7 |" + " ".repeat(37 - course7.length()) + course7 + " |"
                + " ".repeat(16 - teacher7.length()) + teacher7 + " |");

        System.out.println("| 8 |" + " ".repeat(37 - course8.length()) + course8 + " |"
                + " ".repeat(16 - teacher8.length()) + teacher8 + " |");

        System.out.println("+" + "-".repeat(60) + "+");

    }
}

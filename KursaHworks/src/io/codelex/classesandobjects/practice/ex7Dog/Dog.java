package io.codelex.classesandobjects.practice.ex7Dog;

import java.util.Objects;

public class Dog {
    private final String name;
    private final String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", sex='" + sex;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this == otherDog) return true;
        if (otherDog == null || getClass() != otherDog.getClass()) return false;
        Dog dog = otherDog;
        return Objects.equals(mother, dog.mother);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, sex, mother, father);
    }
}

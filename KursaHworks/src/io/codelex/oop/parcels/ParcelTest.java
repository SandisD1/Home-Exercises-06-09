package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(80, 90, 60, 22.2f, false);
        System.out.println("Parcel 1 isValid= " + parcel1.validate());

        Parcel parcel2 = new Parcel(80, 90, 60, 22.2f, true);
        System.out.println("Parcel 2 isValid= " + parcel2.validate());

        Parcel parcel3 = new Parcel(80, 20, 60, 22.2f, false);
        System.out.println("Parcel 3 isValid= " + parcel3.validate());

        Parcel parcel4 = new Parcel(120, 110, 94, 22.2f, false);
        System.out.println("Parcel 4 isValid= " + parcel4.validate());


    }


}

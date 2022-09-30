package io.codelex.oop.computers;

public class ComputersTest {
    public static void main(String[] args) {
        Computer dellOptiplex = new Computer("Intel® Core™ i7-4770", "16GB DDRIII", "Intel® HD Graphics 4600", "Dell", "Optiplex ");
        Computer hp600 = new Computer("Intel Core i3-4150 3.50GHz", "4 GB", "Nvidia GeForce GT1030", "HP", "600");
        Computer nextGen = new Computer("","","","","");

        System.out.println(dellOptiplex);
        String hpProc = hp600.getProcessor();
        String hpRAM = hp600.getRAM();
        String hpGraphCard = hp600.getGraphicsCard();
        String hpCompany = hp600.getCompany();
        String hpModel = hp600.getModel();
        System.out.println(hpProc + "; " + hpRAM +"; " + hpGraphCard +"; "+ hpCompany +"; "+ hpModel);

        nextGen.setProcessor(hpProc);
        nextGen.setRAM(hpRAM);
        nextGen.setGraphicsCard(hpGraphCard);
        nextGen.setCompany(hpCompany);
        nextGen.setModel(hpModel);

        System.out.println(nextGen);

        System.out.println(nextGen.equals(dellOptiplex));
        System.out.println(nextGen.equals(hp600));

    }
}

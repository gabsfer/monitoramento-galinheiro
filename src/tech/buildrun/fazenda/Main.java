package tech.buildrun.fazenda;

public class Main {

    public static void main(String[] args) {

        Galinheiro granjaGal = new Galinheiro(
                "Granja Gal",
                50,
                3
        );

        Galinheiro granjaBel = new Galinheiro(
                "Granja Bel",
                10,
                2
        );

        granjaGal.mostrarInfo();

        System.out.println();

        granjaBel.mostrarInfo();
    }
}

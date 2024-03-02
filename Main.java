public class Main {
    public static void main(String[] args) {
       
        Sertar sertar1 = new Sertar(40, 25, 15);
        Sertar sertar2 = new Sertar(35, 20, 20);

        Birou birou = new Birou(sertar1, sertar2, 80, 40, 30);

        birou.printComponenteleBiroului();
    }
}
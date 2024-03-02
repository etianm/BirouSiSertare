class Sertar {
    private int l;
    private int L;
    private int H;

    public Sertar(int l, int L, int H) {
        this.l = l;
        this.L = L;
        this.H = H;
    }

    public void printSertarInfo() {
        System.out.println("Sertar " + l + "x" + L + "x" + H);
    }
}

class Birou {
    private Sertar sertar1;
    private Sertar sertar2;
    private int l;
    private int L;
    private int H;

    public Birou(Sertar sertar1, Sertar sertar2, int l, int L, int H) { 
        this.sertar1 = sertar1;
        this.sertar2 = sertar2;
        this.l = l;
        this.L = L;
        this.H = H;
    }

    public void printComponenteleBiroului() {
        System.out.println("Componentele Biroului:");
        sertar1.printSertarInfo();
        sertar2.printSertarInfo();
        System.out.println("Birou " + l + "x" + L + "x" + H);
    }
}


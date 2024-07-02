package basics.OOPconcept.Polymorphism;

class overloading {
    public void Transaction(double balance, double payment) {
        if (balance >= payment) {
            System.out.println("You can send money");
        } else {
            System.out.println("You cannot send money because you don't have balance");
        }
    }

    public void Transaction(float AB, float BA) {
        double ABC = AB + BA;
        System.out.println("My double value is ABC = " + ABC);
    }

    public int Transaction(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        overloading over = new overloading();
        over.Transaction(5000.23, 1000);
        over.Transaction(56, 78);
        over.Transaction(938, 750);
    }
}



public class Task {

    public static void main(String[] args) {
        new Innerapp(null);
    }
}

interface IInterface {
    void print();
}

class Innerapp {
    IInterface v;

    public Innerapp(IInterface v) {
        this.v = v;
    }

    void write() {
        v.print();
    }

}
class x2 {
    int x = 10;

    void p() {
        int x = 20;
        System.out.println(x);
        System.out.println(this.x);
    }
}

class x1 {
    public static void main(String[] args) {
        x2 obj = new x2();
        obj.p();
    }
}
package test;
class Pack extends A {
    public static void main(String[] args) {
        Pack pack = new Pack();
        System.out.println(pack.data);
        pack.abc();

    }
}
class A{
    protected int data = 4;
     protected void abc(){
    }
}

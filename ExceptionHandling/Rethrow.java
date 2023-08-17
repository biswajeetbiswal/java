class A {
    void method1() {
        try {
            String s = "hello";
            char ch = s.charAt(5);
        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println("please see the index is within the image");
            throw sie;
        }
    }
}

class Rethrow {
    public static void main(String args[]) {
        A a = new A();
        try {
            a.method1();
        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println(sie);
        }
    }
}
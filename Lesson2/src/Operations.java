public class Operations {
    public static void main(String[] args) {
        int X;
        int $x;
        int _X;
        System.out.println(_X = 7);

        String firstName = "Lilith";
        System.out.println(firstName);

        //ARITHMETIC OPERATIONS

        int A = 7, B = 5;
        int C;
        System.out.println(A + B);
        System.out.println(C = A - B);

        System.out.println(A * B);

        //Division for the irrational number
        System.out.println(A / B);
        System.out.println(A % B);

        //Division for the rational number

        double D = 7.0, E = 5.0;
        System.out.println(D / E);
        System.out.println(D % E);

        int y, c;
        int x = 5;
        x++;
        x = x + 1;
        ++x;
        System.out.println(x++);
        System.out.println(x);

        x = 3;
        y = 4;
        c = x++ - --y; // c = 3 - 3 = 0;
        //x = 4 , y = 3
        System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("c =" + c);

        //Relational Operations

        boolean BB = x == 4;
        System.out.println(BB);
        System.out.println(x != 4);
        System.out.println(x <= 4);
        System.out.println(x % 2 == 0);

        //Logical Operations

        x = 10;
        System.out.println(x >= 1 || x <= 9);

        boolean VV = x > 100 || x < 9;

        System.out.println(VV);
        x = 6;
        System.out.println(x > 5 || x < 7);

        System.out.println(5 & 5);
        System.out.println(17 & 24);

        x = 10;
        x += 4;
        System.out.println(x);
        x &= 9;
        System.out.println(x);
        System.out.println(85&25);

    }
}

public class ArraysLoops {
    public static void main(String[] args) {
        int a [] = new int[6];
        System.out.println(a[2]);

        a[0] = 7;
        a[1] = -7;
        a[3] = 98;
        a[4] = -97;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0]+a[a.length-1]);

        int[] array = {4,6,-7,-77,5};
        System.out.println(array[2]);
        System.out.println(array[array.length-1]);

        int[] x;
        x=new int[]{4,8,6,-1};
        System.out.println(x[x.length-1]);

        String [] XXA;
        XXA = new String[]{"Lilith","Gayane"};

        System.out.println(XXA[1]);

        String [] Jappy ={"Love","Peace","Money"};

        System.out.println(Jappy[2]+ Jappy[0]);

        int z =12;

        if(z > 14){
            System.out.println("Positive");
            System.out.println("Java");

        }else {
            System.out.println("Negative");
            System.out.println("Java");
        }

        int b;
//        if (z>0) {
//            b = 1;
//        } else {
//            z= 0;
//        }

        b = z > 0 ? 1 : 0;

        System.out.println(b);

        System.out.println(z > 0 ? "Positive"  : "non positive");

        z= 0;
        if (z > 0){

            System.out.println("yeeee it's POSITIVE");
        }else {
            if (z < 0)
                System.out.println("noooo it's Negative");
            else {
                System.out.println("it's ZERO)");
            }
        }
    }
}

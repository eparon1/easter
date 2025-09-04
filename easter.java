// amir maman
// calculating the easter date in a specified year
public class easter {
    public static void main(String [] args){
        //code
        int y = 2003;
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b+8) / 25;
        int g = (b - f + 1)/ 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * r) / 451;
        int n = (h + r - 7 * m + 114) / 31;
        int p = (h + r - 7 * m + 114) % 31;
        system.out.println("a = " + a);
        system.out.println("b = " + b);
        system.out.println("c = " + c);
        system.out.println("d = " + d);
        system.out.println("e = " + e);
        system.out.println("f = " + f);
        system.out.println("g = " + g);
        system.out.println("h = " + h);
        system.out.println("i = " + i);
        system.out.println("j = " + j);
        system.out.println("k = " + k);
        system.out.println("l = " + l);
        system.out.println("m = " + m);
        system.out.println("n = " + n);
        system.out.println("p = " + p);
    }
}

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
        system.out.println("b = " + cb);
        system.out.println("c = " + );
        system.out.println("d = " + );
        system.out.println("e = " + );
        system.out.println("f = " + );
        system.out.println("g = " + );
        system.out.println("h = " + );
        system.out.println("i = " + );
        system.out.println("j = " + );
        system.out.println("k = " + );
        system.out.println("l = " + );
        system.out.println("m = " + );
        system.out.println("n = " + );
        system.out.println("p = " + );
    }
}

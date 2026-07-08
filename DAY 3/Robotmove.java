import java.util.*;
public class Robotmove {
    public static int move(int cr, int cc, int r, int c)
    {
        if(cr==r && cc==c)
            return 1;
        else if(cc>c || cr>r)
            return 0;
        return move(cr+1,cc,r,c)+move(cr,cc+1,r,c);
    }
    public static void main(String[] args)
    {
        int m=5, n= 5;
        System.out.println(move(0,0,m-1,n-1));
    }
}

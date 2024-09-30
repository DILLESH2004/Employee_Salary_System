public class AdvCal extends Cal{
    private int Mul(int a,int b){ return a*b;}
    public int[] Div(int a,int b){ int res = Mul(a,b);  return new int[]{res,a/b};}
}
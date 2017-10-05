class OuterStatic
{
    private int mem = 20;
    private static int smem = 50;
 
    static class InnerStatic
    {
        public void accessMembers ()
        {
            
            System.out.println(smem);
        }
    }
    private class InnerNonStatic
    {
        private void accessMembers()
        {
            System.out.println(mem);
        }
    }
}
 
public class p5
{
    public static void main(String[] args)
    {
        OuterStatic.InnerStatic obj = new OuterStatic.InnerStatic();
        obj.accessMembers();
        
    }
}
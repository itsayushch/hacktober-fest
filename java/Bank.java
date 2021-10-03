class Bank
    {
    private int acno,cbal=1000,cid;
    private static int tbbal=10000;
    private static int count=100;
    
    Bank()
    {
    }
    
    Bank(int acno, int cbal)
    {
        this.acno=acno;
        this.cbal=cbal;
        this.cid=++count;
    }
    
    public void withdraw(int x)
    {
        if(tbbal>=x)
        {
            if(cbal>=x)
            {
                cbal=cbal-x;
                tbbal=tbbal-x;
            }
        }
    }
    
    public void schowbalance()
    {
        System.out.println("Customer Bank Balance="+cbal);
        System.out.println("Total Bank Balance="+tbbal);
    }
    public static void show()
    {
        System.out.println("total bank balance ="+tbbal);
    }


    public static void main(String arg[])
    {
        Bank b1 =new Bank(101,5000);
        Bank b2 =new Bank(102,3000);
        Bank b3 =new Bank(103,7000);
        b1.withdraw(3000);
        b2.withdraw(3000);
        b1.show();
    }
}
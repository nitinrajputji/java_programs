class nitin60
{
    public static void main(String args[])
    {
        String a="i love java , the coffee";
        String b[]=a.split(" ");
        for(int i=b.length-1;i>0;i--)
        {
            System.out.print(b[i]+" ");
        }
    }
}
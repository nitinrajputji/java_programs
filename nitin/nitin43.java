class nitin43
{
    public static void main(String args[])
    {
        int a[]={2,6,-1,3,5,6,3};
        int n=a.length;

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int e: a)
        {
            System.out.print(e+" ");
        }
    }
}
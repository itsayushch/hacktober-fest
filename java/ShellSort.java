public class ShellSort
{
	public static void main(String[] args) 
	{
		int a[]={25,-17,8,92,-21,0};

		for(int gap=a.length/2;gap>0;gap/=2)
		{

			for(int i=gap;i<a.length;i++)
			{
				int tmp=a[i];
				int j=i;

				while(j>=gap &&a[j-gap]>tmp)
				{
					a[j]=a[j-gap];
					j-=gap;
				}
				a[j]=tmp;

			}
		}

        System.out.println("Sorted Array : ");
        System.out.print("[");
		for(int i=0;i<a.length;i++)
		{
            if(i == a.length-1)
			    System.out.print(a[i]);
            else
                System.out.print(a[i] + ", ");
		}
        System.out.println("]");
	}	
	
}
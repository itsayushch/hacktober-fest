public class MergeSort
{
	public static void main(String[]args)
	{
		int a[]={5,-35,-15,0,58,1,22};
		int b[] = new int[7];

		mergesort(a,0,a.length-1);
		
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

	public static void mergesort(int[] a,int l,int h)
	{
		if(l < h)
		{
			int mid = (l+h)/2;
			
			mergesort(a,l,mid);			
			mergesort(a,mid+1,h);			
			merger(a, l, mid, h);
		}
	}

	public static void merger(int[] a, int l,int mid,int h)
	{
		int i=l;
		int j=mid+1;
		int k=l;
		int b[] = new int[h+1];
		

		while(i<=mid && j<=h)
		{
			if(a[i]<=a[j])
			{
				  b[k]=a[i];
				 i++;
				 k++;
			}
			else if(a[j]<a[i])
			{
				 b[k]=a[j];
				 j++;
				 k++;
			}
		}
		if(i>mid)
		{
			while(j<=h)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else if(j>h)
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(int t = l;t <=	 h ; t++)
		{
			a[t] =b[t];
		}
	}
}

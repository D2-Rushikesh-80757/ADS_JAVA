package question7;

public class NonRepeatingElement {


	public static int LinearSearch(int arr[])
	{	
		int count=0;
		for(int i=0;i<arr.length;i++)
		{	
		count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		if(count==1)
			return arr[i];
		}
		return -1;
	}


	public static void main(String[] args) {
		int arr[]= {1,2,3,-1,2,1,0,4,-1,7,8};
		int result = LinearSearch(arr);
		System.out.println(result);
	}

}

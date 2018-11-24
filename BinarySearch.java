public class BinarySearch
{
	static int[] input = {1,2,3,4,5,6,7,8,9};
	static int search = 10;
	public static void main(String[] args)
	{
		int position = searchIndex();
		if(position != -1)
		{
			position++;
			System.out.println("Search number is at position : "+position);
		}
		else
		{
			System.out.println("Search number is not present in given array");  
		}
	}
	static int searchIndex()
	{
		int mid = -1;
		
		int start = 0;
		int end = input.length-1;
		while(start <= end)
		{
			mid = (start+end) / 2;
			if(input[mid] < search)
			{
				start = mid + 1; 
			}
			else if(input[mid] > search)
			{
				end = mid - 1;
			}
			else if(input[mid] == search)
			{
				return mid;
			}
		}
		return -1;
	}
}

package git;

public class GitExample {

	public static void main(String[] args) {
		
		
		int[] a=new int[] {5,3,2,1};
		int count=a.length;
		int temp;
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		
		for(int i=0;i<count;i++)
		{
			System.out.println(a[i]);
		}

	}

}

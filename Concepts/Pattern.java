// Input:
// 1
// 2 6 
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

public class Pattern
{
	public static void main(String[] args) {
		int k=5;
		int fin=1;
		for(int i=0;i<k;i++){
		    int rep=(i*1)+fin;
		    int count=1;
		    for(int j=0;j<=i;j++){
		        System.out.print(rep+" ");
		        rep=rep+(k-count);
		        count++;
		    }
		    System.out.println();
		}
	}
}

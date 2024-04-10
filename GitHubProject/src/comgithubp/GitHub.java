package comgithubp;
import java.util.*;
public class GitHub {

	public static void main(String[] args) {
		int i,j,n;
		Scanner cr=new Scanner(System.in);
		
		System.out.println("Enter The Value...!");
		n=cr.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
			System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}

import java.util.*;
public class J02012 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a;
        a=new int [n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int c=0,buoc=0;
        for(int i=0;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            c++;
            System.out.print("Buoc "+(buoc++)+": ");
            for(int x=0;x<c;x++){
                System.out.print(a[x]+" ");
            }System.out.println("");
        }
    }
}

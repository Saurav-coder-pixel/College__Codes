import java.util.*;
import java.lang.*;

class Sum {
    int arr[];
    int i,sum;
    Sum(int size) {
        arr = new int[size];
        sum=0;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    void display() {
        for(i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    void sumCal() {
        for(i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.print("SUM IS "+sum);
    }
    public static void main(String a[]) {
        Sum obj=new Sum(5);
        obj.input();
        obj.display();
        obj.sumCal();
    }
}
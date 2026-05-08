import java.util.*;

class PrimeNumber{
    int value, num, i, flag;

    public void inputData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        value= sc.nextInt();
    }

    public void Display(){
        for(num=2; num<=value; num++){
            flag=0;
            for(i=2; i<num; i++){
                if(num%i== 0){
                    flag= 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args){
        PrimeNumber obj= new PrimeNumber();
        obj.inputData();
        obj.Display();
    }
}
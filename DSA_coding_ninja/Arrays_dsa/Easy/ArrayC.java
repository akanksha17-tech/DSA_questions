package DSA_coding_ninja.Arrays_dsa.Easy;
import java.util.*;
public class ArrayC{
    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int Array1[]={2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter Key: ");
        int key=sc. nextInt();
        int index=linearSearch(Array1, key);
        if(index!=-1){
            System.out.println("Key is found at: "+ index);
        }
        else{
            System.out.println("Not found");
        }
    }
}


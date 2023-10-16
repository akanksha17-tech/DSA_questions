package DSA_coding_ninja.Arrays_dsa.Easy;
public class Binary_search {
    public static int Binarry_Search(int num[], int key){
        int start=0;
        int end=num.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
                if(num[mid]==key){
                    return mid;
                }
                if(num[mid]>key){//left
                    end=mid-1;
                }
                else{//right
                    start=mid+1;
                }
            }
            return -1;
                
        }
        public static void main(String args[]){
            int numbers[]={2,4,6,8,10,12,14};
            int key=92;
            int index=Binarry_Search(numbers, key);
            if(index!=-1){
                System.out.println(key+" is found at: "+index);
            }
            else{
                System.out.println("Element is not present in array");
            }
        
        }
        
    }
        
    


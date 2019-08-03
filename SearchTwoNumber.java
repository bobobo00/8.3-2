package day12;

/**
 * @ClassName SearchTwoNumber
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/3 22:25]
 * @Version 1.0
 **/

public class SearchTwoNumber {
    public static void main(String[] args) {
        int temp=0;
        int count=0;
        int one=0;
        int two=0;
        int[] arr={1,3,5,7,1,3,5,9};
        for (int i = 0; i <arr.length ; i++) {
            temp^=arr[i];
        }
        for(int j=0;j<32;j++){
            if((temp&(1<<j))!=0){
                count=j;
                break;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if((arr[i]&(1<<count))!=0){
                one^=arr[i];
            }else{
                two^=arr[i];
            }
        }
        System.out.println("两个只出现一次的数字是："+one+","+two);

    }
}

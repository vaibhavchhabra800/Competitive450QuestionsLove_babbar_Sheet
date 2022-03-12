package Median_2_sorted_arrasyDewletePractice;
import org.omg.Messaging.SyncScopeHelper;

import java.lang.*;
import java.util.*;
public class shitDelete5Dec21 {

    public static void main(String[] args)
    {
        int[] arr= new int[]{2,2,2,2,3,3,4,5};
        int sum=7;
        int ans=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:arr)
        {
            int find= sum-i;
            ans+=hm.getOrDefault(find,0);
        }
        ans/=2;
        //System.out.println(ans);
        //System.out.println(Arrays.binarySearch(arr,4));
        char[] ch = new char[]{'x','a','c','w','z','f','g','b','b'};
        Arrays.sort(ch);
        for(char ch1:ch)
            System.out.print(ch1+" ");
        System.out.println();
        System.out.println(binSearch(arr,2));
        char a='f';
        int b= a -'a';
        System.out.println("Yo b = "+b);

        double ca=5.9;
        int cb =(int)ca/2;
        System.out.println("Hello, World!"+cb);

        int[] arbin = new int[]{1,3,5,7,9,11};
        int pos=Arrays.binarySearch(arbin,13);
        System.out.println(pos);
        ArrayList<Integer> arrlistBin = new ArrayList<Integer>();
        arrlistBin.add(1);arrlistBin.add(3);arrlistBin.add(5);arrlistBin.add(7);arrlistBin.add(9);arrlistBin.add(11);
        int pos2=Collections.binarySearch(arrlistBin,13);
        System.out.println(pos2);


    }
    public static int binSearch(int[] arr,int ele)
    {
        int size=arr.length;
        int low =0;
        int pos=-1;
        int high = size - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid]==ele)
            {
                pos=mid;
                break;
            }
            else if(ele <arr[mid])
            {
                high =mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return pos;
    }
}


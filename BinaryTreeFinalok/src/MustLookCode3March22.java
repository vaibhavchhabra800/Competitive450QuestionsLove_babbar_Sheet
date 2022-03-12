import com.sun.nio.sctp.SctpSocketOption;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import jdk.nashorn.internal.objects.annotations.Function;

import java.util.*;
import java.lang.Math.*;
import java.lang.*;
import java.io.*;
//Must look Code 3 March 22

@FunctionalInterface
interface intfceFxn{
    void show(int a,int b);
}
public class MustLookCode3March22  {
    public static void main(String[] args) {
        HashMap<Character,Integer> ch = new HashMap<Character,Integer>();
        ch.put('a',23);
        ch.put('b',13);
        ch.put('c',1);
        ch.put('d',6);
        ch.put('e',11);
        ch.put('f',4);
        ch.put('g',100);
        Comparator<Character> com1 = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return ch.get(o2)-ch.get(o1);
            }
        };
        PriorityQueue<Character> pq = new PriorityQueue<Character>(com1);
        for (char ch1:ch.keySet()){
            pq.add(ch1);

        }
//        intfceFxn intfceFxn1= (a,b)->
//        {
//            System.out.println("a="+a+"b= "+b);
//            System.out.println("a="+a+"b= "+b);
//        };
        intfceFxn intfceFxn1= (a,b)->  System.out.println("intfceFxn a="+a+"b= "+b);
        intfceFxn1.show(2,3);


        System.out.println(pq.remove());
        System.out.println(pq.remove());

        System.out.println(pq.remove());
        System.out.println(pq.remove());


    }

}

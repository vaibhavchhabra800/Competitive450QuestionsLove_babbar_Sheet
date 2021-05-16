
import java.io.*;
import java.util.*;
import java.lang.*;


public class java1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        int T = Integer.parseInt(br.readLine().trim());

        String myString = "This text will be copied into clipboard";
       
            for(int t_i = 0; t_i < T; t_i++)
            {
                int N = Integer.parseInt(br.readLine().trim());
                int K = Integer.parseInt(br.readLine().trim());
                String[] arr_A = br.readLine().split(" ");
                long[] A = new long[N];
                for(int i_A = 0; i_A < arr_A.length; i_A++)
                {
                 
                	A[i_A] = Long.parseLong(arr_A[i_A]);
                }

                int out_ = solve(N, K, A);
                System.out.println(out_);
                
             }

             wr.close();
             br.close();
        }
    
    
    static int solve(int n, int k, long[] arr){


        int count = 0;

        long temp=0;
        for (int ik = 0; ik < 10000; ik++) {
            int lala=0;lala++;
        }       
        for (int i = 0; i < n; i++) {
            long sum = 0;
                for (int j = i; j < n; j++) {
                temp =arr[j]%1000000007;
                if (((sum + temp)%1000000007) >= k) {
                    count++;
                    count+=(n-j-1);
                    break;
                }
            		            
            sum = (temp + sum)%1000000007;


            }
            }
            return count;
            }
}

    
    
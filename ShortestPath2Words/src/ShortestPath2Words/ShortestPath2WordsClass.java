package ShortestPath2Words;

public class ShortestPath2WordsClass {
	public static int distanceShivam(String s, String w1, String w2) {
		if (w1.equals(w2)) {
			return 0;
		}
		if (w1 == null || w2 == null || w1.length() == 0 || w2.length() == 0) {
			return -1;
		}
		int w1Loc = -1;
		int w2Loc = -1;
		int minDis = Integer.MAX_VALUE;
		int temDis = 0;
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase(w1)) {
				w1Loc = i;
			}
			else if (words[i].equalsIgnoreCase(w2)) {
				w2Loc = i;
			}
			if(w1Loc != -1 && w2Loc != -1) {
				temDis = Math.abs(w1Loc-w2Loc);
				if(minDis > temDis) {
					minDis = temDis;
				}
			}
		}

		return minDis-1;
	}
	
	
	public static int distance(String s,String w1,String w2)
	{
	      
	    if (w1 .equals( w2) )
	        return 0 ;
	  
	    // get individual words in a list
	    String words[] = s.split(" ");
	  
	    // assume total length of the string
	    // as minimum distance
	    int min_dist = (words.length) + 1;
	  
	    // traverse through the entire string
	    for (int index = 0; index < words.length ; index ++)
	    {
	  
	        if (words[index] .equals( w1))
	        {
	            for (int search = 0; search < words.length; search ++)
	            {
	                if (words[search] .equals(w2))
	                {
	                    // the distance between the words is
	                    // the index of the first word - the
	                    // current word index
	                    int curr = Math.abs(index - search) - 1;
	  
	                    // comparing current distance with
	                    // the previously assumed distance
	                    if (curr < min_dist)
	                    {
	                        min_dist = curr ;
	                    }
	                }
	            }
	        }
	    }
	      
	    // w1 and w2 are same and adjacent
	    return min_dist;
	}
	public static double distanceSivam2(String s, String w1, String w2) {
		String[] words = s.split("[,. ]");
        int index = 0;
        double shortest = s.length();
        double word1Loc = 0;
        double word2Loc = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(w1)) {
                word1Loc = index + (word.length() / 2d);
            } else if (word.equalsIgnoreCase(w2)) {
                word2Loc = index + (word.length() / 2d);
            }
            if (word1Loc > 0 && word2Loc > 0) {
                double current = Math.abs(word1Loc - word2Loc);
                if (current < shortest) {
                    shortest = current;
                }
            }
            index += word.length() + 1;
        }
        if (word1Loc == 0 || word2Loc == 0) {
            return -1;
        }
        return shortest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		public static double distanceFinalShivam(String s, String w1, String w2) {
			String[] words = s.split("[,. ]");
	        int index = 0;
	        double shortest = s.length();
	        double word1Loc = 0;
	        double word2Loc = 0;

	        for (String word : words) {
	            if (word.equalsIgnoreCase(w1)) {
	                word1Loc = index + (word.length() / 2d);
	            } else if (word.equalsIgnoreCase(w2)) {
	                word2Loc = index + (word.length() / 2d);
	            }
	            if (word1Loc > 0 && word2Loc > 0) {
	                double current = Math.abs(word1Loc - word2Loc);
	                if (current < shortest) {
	                    shortest = current;
	                }
	            }
	            if(word.equals(""))
	            {
	            	index += 2;
	            }
	            else
	            {
	            	index += word.length() + 1;
	            }
	        }
	        if (word1Loc == 0 || word2Loc == 0) {
	            return -1;
	        }
	        return shortest;
		}
		
		
		

	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static double shortestDistanceVaibhav15June21(String document, String word1, String word2)
		 {
			double minDistance = document.length() * 1.0;
			int index = 0;
			double word1Loc=0.0;
			double word2Loc=0.0;
			
			String[] words = document.split("[,. ]");
			for(String word: words)
			{
				if(word.equals(word1))
				{
					word1Loc = index + word.length()/2.0;
					if(word2Loc >0.0)
					{
						if(Math.abs(word1Loc - word2Loc)<minDistance)
						{
							minDistance =Math.abs( word1Loc - word2Loc);
						}
					}
				}
				else if (word.equals(word2))
				{
					
					word2Loc = index + word.length()/2.0;
					if(word1Loc >0.0)
					{
						if(Math.abs(word1Loc - word2Loc)<minDistance)
						{
							minDistance = Math.abs(word1Loc - word2Loc);
						}
					}
					
				}
				if(word.length() ==0)
				{
					index+=2;
				}
				else
				{
					index+=word.length()+1;
				}
			}
			if(word1Loc ==0.0 || word2Loc == 0.0)
				return -1;
			return minDistance;
		}
	
	
	
	
	
		public static double shortDistanceAnand(String document, String word1, String word2) {
		    String[] documentWords = document.split("[. ,]");  //splitting the string regex
		    //In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements
		    int index = 0;
		    int distanceToWord1 = 0;
		    int distanceToWord2 = 0;
		    double word1Midvalue = 0;
		    double word2Midvalue = 0;
		    double minResultValue = Integer.MAX_VALUE;
		    for (String word : documentWords) {
		        if (word.equalsIgnoreCase(word1)) {
		            distanceToWord1 = index;
		            word1Midvalue = word1.length() / 2.0;
		            distanceToWord1 += word1Midvalue;
		        }
		        if (word.equalsIgnoreCase(word2)) {
		            distanceToWord2 = index;
		            word2Midvalue = word2.length() / 2.0;
		            distanceToWord2 += word2Midvalue;
		        }
		        index += word.length() + 1;
		        double res = 0;
		        if (distanceToWord1 > 0 && distanceToWord2 > 0) {
		            res = Math.abs(distanceToWord1 - distanceToWord2);
		            if (res < minResultValue) {
		                minResultValue = res;
		            }
		        }
		    }
		    if (minResultValue == Integer.MAX_VALUE) {
		        return -1;
		    }
		    return minResultValue;
		}
	
		
		
		
		public static double shortestDistanceVaibhav27June21(String document, String word1, String word2)
		{
			String[] st2 = document.split("[,. ]");
			double Mindist =document.length()*1.0;
			double loc1=0;
			double loc2=0;
			int index=0;
			for(String wordCurr : st2)
			{
				if(wordCurr.equals(word1))
				{
					loc1=index+word1.length()/2.0;
				}
				else if(wordCurr.equals(word2))
				{
					loc2=index+word2.length()/2.0;
				}
				
				if(loc1!=0.0 && loc2!=0.0)
				{
					double temp=Math.abs((loc1)-(loc2));
					if(temp<Mindist)
					{
						Mindist = temp;
					}
				}
				if(wordCurr.equals(""))
				{
					index+=2;
				}
				else
				{
					index+=wordCurr.length()+1;
				}
			}
			if(loc1 ==0.0 || loc2 == 0.0)
				return -1;
			return Mindist;
	
		}
	public static void main(String[] args) {


		String document = "in publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements";

		//double ans =distanceFinalShivam( document, "in", "a" ) ;
		//double ans =shortestDistanceVaibhav15June21( document, "in", "a" ) ;
		double ans =shortestDistanceVaibhav27June21( document, "is", "a" ) ;
		
		System.out.println(ans);

	}

}

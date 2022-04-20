package com.comcast.strings;

public class splitFreq {

	public static void main(String[] args) {
		String str = "He is the only man who is to be the king of the box";
		String words[] = str.split(" ");
		String word = "";
		
		int count = 0, maxCount = -1;
		/*for(String i : words) {
			System.out.println(i);
		}*/
		
		for(int i = 0; i < words.length; i++){    
            count = 1;    
            for(int j = i+1; j < words.length; j++){    
                if(words[i].compareTo(words[j]) == 0){    
                    count++;    
                }     
            }       
            if(count > maxCount){    
                maxCount = count;    
                word = words[i];    
            }    
        }    
            
        System.out.println("Most repeated word: " + word);    

	}

}

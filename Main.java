package HelloWorld;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
		boolean[] chptList = new boolean[17]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
		  int includeChpt;
		  int i, j;
		  boolean selected = false;
		  
		  // Get the chapter selections
		  for (i = 1; i <= 15; ++i) {
		     includeChpt = scnr.nextInt(); 
		     if (includeChpt==1) {
		        chptList[i] = true;
		        selected = true;
		     }
		     else {
		        chptList[i] = false;
		     }
		  }
		  if (selected) {
		     for (i = 1; i <= 15; ++i) {
		        if (chptList[i] && chptList[i+1]) {
		           j = i + 1;
		           while (j < 15 && chptList[j+1]) {
		              ++j;
		           }
		           if (j-i >= 2) {
		              System.out.print(i + "-" + j + " ");
		              i = j;
		           }
		           else {
		              System.out.print(i + " ");
		           }
		        }
		        else if (chptList[i]) {
		           System.out.print(i + " ");
		        }
		     }
		     System.out.println();
		  }
		  else {
		     System.out.println("None ");
		  }
      }
   }
}

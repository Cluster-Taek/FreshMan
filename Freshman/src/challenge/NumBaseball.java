package challenge;

import java.util.Scanner;

public class NumBaseball {
	static Scanner sc = new Scanner(System.in);
   static int[] question() {
      int temp[] = new int[4];
      
      for (int i = 0; i < temp.length; i++) {
         temp[i] = (int)(Math.random() * 10);
         if(temp[0] == 0) {
            i--;   
         }
         for (int j = 0; j < i; j++) {
            if(temp[i] == temp[j]) {
               i--;
            }
         }
      }   
     return temp;
   }   
   
   static int[] insert() {
      int temp[] = new int[4];
      
      while(true) {
         System.out.println("4자리 정수를 입력하세요(첫번째 자리는 0이 될 수 없음)");
         int temp4 = sc.nextInt();
         while(temp4 < 1000){
        	 System.out.println("다시 입력해주세요");
        	 temp4 = sc.nextInt();
         }
         for(int i = 0; i < temp.length; i++) {
            temp[i] = (int)((temp4 % Math.pow(10, temp.length - i)) / Math.pow(10, (temp.length - 1) - i));            
         }
         return temp;
      }   
   }
   
   static int strike(int[] comNum, int[] userNum) {
	   int num = 0;
	   for (int i = 0; i < userNum.length; i++) {
	         if(comNum[i] == userNum[i]) {
	            num++;
	         }
	      }
	   return num;
   }
   
   static int ball(int[] comNum, int[] userNum) {
	   int num = 0;
	   for (int i = 0; i < userNum.length; i++) {
	         for (int j = 0; j < userNum.length; j++) {
	            if(comNum[i] == userNum[j]) {
	               num++;
	            }
	         }
	      }
	   return num - strike(comNum, userNum);
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method
      //문제내기
      int comNum[] = question();

      System.out.println("[Computer Number]");
      System.out.print("{ ");
      for (int i = 0; i < comNum.length; i++) {
         System.out.print(comNum[i] + " ");
      }
      System.out.println("}");
      
      //입력하기
      while(true) {
	      int userNum[] = insert();
	      System.out.println("[User Number]");
	      System.out.print("{ ");
	      for (int i = 0; i < userNum.length; i++) {
	         System.out.print(userNum[i] + " ");
	      }
	      System.out.println("}");
	      
	      
	      
	      if(strike(comNum, userNum) == 0 && ball(comNum, userNum) == 0) {
	         System.out.println("out!!!!");
	      } else if(strike(comNum, userNum) == 4) {
	    	 System.out.println("Homerun!");
	         break;
	      } else {
	    	  System.out.println("strike : " + strike(comNum, userNum));
	    	  System.out.println("ball : " + ball(comNum, userNum));
	      }
      }
   }   
}
      

package test;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Demo {
	 static int n1,n2,n3,n4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n,i,t1,t2;
		int[] num=new int[5];
		int[] num1=new int[5];
		int[] num2=new int[5];
		int[] num3=new int[5];
		int[] num4=new int[5];
		int[] num5=new int[5];
		System.out.println("请输入要产生多少道四则运算练习题：\n");
		n=input.nextInt();
		String s1,s2,s3,s4,s5;
		String[] str=new String[n];
		int[] sum=new int[n];
       // String[] ip=new String[5];
		
		for(int j=0;j<5;j++)
		{
			Random rand=new Random();
			i=rand.nextInt(100)+1;
			t1=rand.nextInt(20)+1;
			t2=rand.nextInt(5)+1;
			num1[j]=i;
			num2[j]=i;
			num3[j]=i;
			num4[j]=t1;
			num5[j]=t2*num4[j];
		}
		System.out.println("201571030323");
		System.out.println("----------------");
	    int a,b,c,d,e,f;
		for(int k=0;k<n;k++){
			 a=(int)(Math.random()*5);
		     b=(int)(Math.random()*5);
		     c=(int)(Math.random()*5);
		     d=(int)(Math.random()*5);
		     f=(int)(Math.random()*5);
		     if(f==0){
		    	 s1="+";
		    	 s2="-";
		    	 s3="*";
		     }
		     else if(f==1){
		    	 s1="-";
		    	 s2="*";
		    	 s3="/";
		     }
		     else if(f==2){
		    	 s1="*";
		    	 s2="/";
		    	 s3="+";
		     }
		     else {
		    	 s1="/";
		    	 s2="+";
		    	 s3="-";
		     }
		     
		     if(s1=="+"||s2=="-"||s3=="/"){
		    	sum[k]=num1[a]+num2[b]-num5[c]/num4[d];
		    	if(num1[a]+num2[b]-num5[c]/num4[d]>=0){
		    		str[k]=num1[a]+"+"+num2[b]+"-"+num5[c]+"/"+num4[d]+"="+sum[k];
		    		System.out.println(str[k]);
		    		System.out.println();
		    	}
		    	else{
		    		sum[k]=num5[c]/num4[d]-num1[a]+num2[b];
		    		str[k]=num5[c]+"/"+num4[d]+"-"+num1[a]+"+"+num2[b]+"="+sum[k];
		    		System.out.println(str[k]);
		    		System.out.println();
		    	}
		    	
		     }
		     else if(s1=="-"||s2=="*"||s3=="+"){
		    	 sum[k]=num1[c]-num2[b]*num3[a]+num4[d];
		    	 if(num1[c]-num2[b]*num3[a]>=0){
		    		 str[k]=num1[c]+"-"+num2[b]+"*"+num3[a]+"+"+num4[d]+"="+sum[k];
		    		 System.out.println(str[k]);
		    		 System.out.println();
		    	 }
		    	 else {
		    		 sum[k]=num2[b]*num3[a]-num1[d]+num4[d];
		    		 str[k]=num2[b]+"*"+num3[a]+"-"+num1[d]+"+"+num4[d]+"="+sum[k];
		    		 System.out.println(str[k]);
		    		 System.out.println();
		    	 }
		    	
		     }
		     else if(s1=="*"&&s2=="+"||s3=="/"){
		    	 sum[k]=num1[b]*num2[a]+num5[d]/num4[c];
		    	 str[k]=num1[b]+"*"+num2[a]+"+"+num5[d]+"/"+num4[c]+"="+sum[k];
		    	 System.out.println(str[k]);
		    	 System.out.println();
		     }
		     else if(s1=="/"&&s2=="-"||s3=="*"){
		    	 sum[k]=num5[a]/num4[b]-num1[c]*num2[d];
		    	 if(num5[a]/num4[b]-num1[c]*num2[d]>=0){
		    		 str[k]=num5[a]+"/"+num4[b]+"-"+num1[c]+"*"+num2[d]+"="+sum[k];
		    		 System.out.println(str[k]);
		    		 System.out.println();
		    	 }
		    	 else {
		    		 sum[k]=num1[c]*num2[d]-num5[a]/num4[b];
		    		 str[k]=num1[c]+"*"+num2[d]+"-"+num5[a]+"/"+num4[b]+"="+sum[k];
		    		 System.out.println(str[k]);
		    		 System.out.println();
		    	 }
		    	 
		     }
		     else {
		    	 sum[k]=num1[a]+num2[c]+num3[d]*num4[b];
		    	 str[k]=num1[a]+"+"+num2[c]+"+"+num3[d]+"*"+num4[b]+"="+sum[k];
		    	 System.out.println(str[k]);
		    	 System.out.println();
		     }
		}
			 
		System.out.println("----------------");

	}

}
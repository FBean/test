/*�ҳ�һ������������������֮�͵����ֵ�����磺����[1,-2,3,5,1]������ 8 ����Ϊ  ����Ҫ�����������[3,5]��
*/

import java.util.Scanner;
import java.io.*;

public class Maxarr{
    public static void main(String[] args){
	int[]a = null;
	Scanner input = new Scanner(System.in);
	int len=0;
	System.out.print("����������ĳ��ȣ�");
	try{
	    len = Integer.parseInt(input.nextLine());
	}catch(Exception e){
	
	}
	
	a = new int[len];
	System.out.println("a.length ="+a.length);
	
	for(int i=0;i<a.length;i++){
	    System.out.print("��������ֵ��");
	    a[i] = input.nextInt();
	}
	
	System.out.println();
	System.out.print("������Ϊ��");
	for(int i=0;i<a.length;i++){
	    
	    System.out.print(a[i] + " ");
	}
	
	
	int sum = 0,max = 0;
	for(int i=0;i<a.length;i++){
	    sum = 0;
	    for(int j=i;j<a.length;++j){
		sum += a[j];
		if(sum>max)
		    max = sum;
	    }
	}
	
	System.out.println();
	System.out.println("������֮�͵����ֵΪ "+max);

    }
    
    
}
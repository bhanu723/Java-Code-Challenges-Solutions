package interviewcodechallenges;

import java.io.*;
import java.util.*;

import interviewcodechallenges.*; 

/*
@Author : BhanuSurendra Deepala
*/

class FarthestNo
{ 
    static int[] farNumber(int N, int Arr[])
	{    
	   	    int l = Arr.length;
	    int index,flag;
        int[] output = new int[l];
        if(l>0)
        {
        for(int i=0;i<l;i++){
            flag=0;
            for(int j=l-1;j>i;j--)
            {
                if(Arr[i]>Arr[j]){
                    output[i]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                output[i]=-1;
            }
        }
        
        return output;
	}
} 
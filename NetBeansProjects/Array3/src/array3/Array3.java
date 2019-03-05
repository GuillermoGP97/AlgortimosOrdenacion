/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author xp
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
public int maxSpan(int[] nums) {
  int mayor = 0;
	int cont;
	int j;
	for(int i = 0; i < nums.length; i++){
		for(j = nums.length - 1; nums[i] != nums[j]; j--);
		cont = 1 + j - i;
		if(cont > mayor)
			mayor = cont;
	}
	return mayor;
}
public boolean canBalance(int[] nums) {

  int total=0;
  int suma=0;
  for(int i=0;i<nums.length;i++){
    total=total+nums[i];
  }
  for(int i=0;suma<total/2;i++){
    suma=suma+nums[i];
  }
  if(suma*2==total)
  return true;
  return false;
}
public int[] seriesUp(int n) {
  int [] listaUp = new int[n*(n+1)/2];
  int t=n;
  if(n!=0)
  listaUp[0]=1;
  for(int i=(n*(n+1)/2)-1;i>0;i--){
      listaUp[i]=n;
      n--;
      if(n==0){
        n=t-1;
        t=t-1;
      }
  }
  return listaUp;
}
public int[] fix34(int[] nums) {
  for(int i=0; i<nums.length-1;i++){
    if(nums[i]==3 && nums[i+1]!=4){
      int j=i;
      while(nums[j]!=4 && j<nums.length-1){
        j++;
      }
      if(nums[j]!=4){
        j=i;
        while(nums[j]!=4 && j>=0){
        j--;
      }
      }
      nums[j]=nums[i+1];
      nums[i+1]=4;
    }
  }
  return nums;
}
public boolean linearIn(int[] outer, int[] inner) {
  int cont=0;
  int j=0;
  for(int i=0;i<inner.length;i++){
    while(inner[i]!=outer[j] && j<outer.length-1){
      j++;
      }
     if(inner[i]==outer[j]){
        cont++;
      }
  }
  if(cont==inner.length){
  return true;
  }
  return false;
}
public int[] fix45(int[] nums) {
  if(nums.length!=0){
  for(int i=0; i<nums.length-1;i++){
    if(nums[i]==4 && nums[i+1]!=5){
      int j=i;
      while(nums[j]!=5 && j<nums.length-1){
        j++;
      }
      if(nums[j]!=5){
        j=i;
        while(nums[j]!=5 && j>=0){
        j--;
      }
      }
      nums[j]=nums[i+1];
      nums[i+1]=5;
    }
    
  }
  if(nums[0]==5){
    int i=0;
    while(nums[i]!=4 && i<nums.length){
      i++;
    }
    if(nums[i]==4){
      nums[0]=nums[i+1];
      nums[i+1]=5;
    }
  }
  }
  return nums;
}
public int countClumps(int[] nums) {
  int serie=0;
  for(int i=0; i<nums.length-1;i++){
    if(nums[i]==nums[i+1]){
      serie++;
      i++;
    while( i<nums.length-1 && nums[i]==nums[i+1]){
      i++;
    }
    }
  }
  return serie;
}

}

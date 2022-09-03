package ShortingPackage;

public class QuickShort {
    public void partition(int array1[],int Low,int High)
    {
        int mid=(Low+High)/2;
        int pivot=array1[mid];
        int i=Low;
        int j=High;
        while(i<=j)
        {
            while(pivot>array1[i])
                i++;
            while(pivot<array1[j])
                j--;
            if(i<=j)
            {
                int temp=array1[i];
                array1[i]=array1[j];
                array1[j]=temp;
                i++;
                j--;
            }
        }
        if(Low<j)
            partition(array1,Low,j);
        if(High>i)
            partition(array1,i,High);
    }
    public static void main(String args[]) {
         int array[]={7,6,10,5,9,2,1,15,7};
         QuickShort obj=new QuickShort();
         System.out.println("Array Before shorting:");
        for(int i:array)
        {
            System.out.print(i+" ");
        }
        System.out.println();
         obj.partition(array,0, array.length-1);
         System.out.println("After shorting array:");
         for(int i:array)
         {
             System.out.print(i+" ");
         }
    }
}

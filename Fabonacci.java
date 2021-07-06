// 1 1 2 3 5 8 13 21 34 55......

class Fabonacci
{
    public static void main(String[] args) 
    {
        int a=1,b=1;
        int k=0;
        System.out.print("1  1 ");
        while(k<=50)
        {
            k=a+b;
            System.out.print(k + "  ");
            a=b;
            b=k;
        }
        
    }
}
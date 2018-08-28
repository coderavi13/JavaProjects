class ContinueDemo
{

public static void main(String args[]){
	outer:
for(int j=0;j<10;j++)
{
	inner:
for(int i=0;i<=10;i++)
{
if(i==5)
{continue outer;
}
else{System.out.println(j+ "  " +i);}
}
}
}

}
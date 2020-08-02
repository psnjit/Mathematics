public class ExtendedEuclideanAlgo
{
public static void main(String args[])
{
//extended Euclidean Algo to find x, y such that x.a+y.b=gcd(a,b)
int arr[]= {0,0};
System.out.println("GCD= "+gcd(8,4, arr)+", x= "+arr[0]+", y= "+arr[1]);	
}
static int gcd(int a, int b, int arr[])// euclidean gcd + extended euclidean
{
	if(b==0)
		return a;
	int tmp[]= {1,1};//must be 1,1, because at base step b=0, a=anything, 1.0+ 1.a=a
	int result=gcd(b, a%b, tmp);
	arr[0]=tmp[1];//x=y1
	arr[1]=(tmp[0]-(a/b)*tmp[1]);//y=(x1-(a/b)*y1)
	return result;
}
}

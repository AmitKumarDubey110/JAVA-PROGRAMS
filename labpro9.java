package java_programs;

class Number 

{
 private double db1;
 private long lg;
 public Number ( )
 {
 db1 = 108.0d;
 lg = 249;
 }
public Number(double d, long l)
 {
 db1 = d;
 lg = 1;
 }
 public boolean isZero ( )
 {
 if (db1 == 0.0)
 return true;
 else
 return false;
 }
public boolean isPositive ( )
 {
 if(db1 > 0.0)
 return true;
 else
 return false;
 }
public boolean isNegative ( )
 {
 if (db1 < 0.0)
 return true ;
 else
 return false;
 }
public boolean isodd( )
 {
 if (db1 % 2 != 0.0)
 return true;
 else return false;
 }
public boolean isEven ( )
 {
 if (db1 % 2 == 0.0)
 return true ;
 else return false;
 }
public boolean isPrime ( )
 {
 int i, lastn;
 double a;
 boolean flag;
 a = Math.sqrt(lg);
 lastn = (int)a;
 flag = true;
 for (i=2; i<lastn; i++)
 {
 if (lg != i)
 {
 if( lg % i ==0)
 {
 flag = false;
 break;
 }
 }
 }
 if (flag)
 return true;
 else return false;
 }
public boolean isAmstrong ( )
 {
 if (db1 == 0.0)
 return true;
 else return false;
 } 
 
  public void dispBinary ( )
 {
System.out.println("ByteValue of lg :" + Long.toBinaryString(lg));
 }
public static void main (String args [ ])
 {
 Number mynum = new Number( );
 double d = 199;
 System.out.println(" The given numbers are 108.0d and 249");
 System.out.println ("isZero " + mynum.isZero() );
 System.out.println ("isPositive " + mynum. isPositive());
 System.out.println ("isNegative " + mynum.isNegative() );
 System.out.println ("isOdd " + mynum.isodd());
 System.out.println ("isEven " + mynum.isEven());
 System.out.println (" isPrime " +mynum.isPrime());
 System.out.println ("isAmstrong " + mynum.isAmstrong());
 
 }
}

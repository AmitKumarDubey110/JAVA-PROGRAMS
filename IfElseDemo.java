//To illustrate the nested if statement.


class IfElseDemo
{
 public static void main(String args[])
 {
  int testscore=76;
  char grade;
   if(testscore>=70)
   {
    grade='A';
   }
    else if(testscore>=60)
   {
    grade='B';
   }
    else
   {
    grade='C';
   }
    System.out.println("Grade="+grade);
 }
}
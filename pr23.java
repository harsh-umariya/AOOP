class myexception extends exception
{
public String testing()
{
return "Cannot divided by zero";
}
}
class pr23
{
public static void main(String args[])
{
myexception a=new myexception();
try
{
throw new myexception();
}
catch(myexception e)
{
System.out.println(e);
}
}
}
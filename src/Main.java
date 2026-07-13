import recursion.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   String name = "malayalam";
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter number:");
//   int n=sc.nextInt();

   //print names N times
//   PrintNames printNames = new PrintNames();
//   printNames.print_names(2);

   //print from 1 to N or N to 1
//   PrintNumbers printNumbers = new PrintNumbers();
//   printNumbers.print_numbers(n);

   //sum of N natural numbers
//   SumOfNumbers  s=new SumOfNumbers();
//   System.out.println(s.sum_of_numbers(n));

   //Factorial N
//   Factorial fact = new Factorial();
//   System.out.println(fact.factorial(n));
//   ReverseArray reverseArray=new ReverseArray();
//   reverseArray.reverse(arr,0);
   ReverseString reverseString = new ReverseString();
   boolean value = reverseString.reverse(name,0,name.length()-1);
   if(value)
      System.out.println("True");
   else
      System.out.println("false");
}
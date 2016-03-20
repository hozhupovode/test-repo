class chin
{
public static void main(String[] args)
throws java.io.IOException 
	{
char input;
int counter = 0;

//System.out.println("Enter symbols, end yor input with dot:\n");
	do
		{
		input = (char) System.in.read();
		if ((input>=65) && (input<=90))
			{
			input += 32;
			counter++;
			}
		else 
			if ((input>=97) && (input<=122))
				{
				input -= 32;
				counter++;
				}
		System.out.println("Your shifted symbol" + input + '\n');
		}
	while (input != '.');
System.out.println("Number of shifted symbols:" + counter);
	}
}
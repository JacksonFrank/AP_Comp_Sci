/*
On the first day of Christmas
my true love sent to me:
A Partridge in a Pear Tree

On the second day of Christmas
my true love sent to me:
2 Turtle Doves
and a Partridge in a Pear Tree

On the third day of Christmas
my true love sent to me:
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the fourth day of Christmas
my true love sent to me:
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the fifth day of Christmas
my true love sent to me:
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the sixth day of Christmas
my true love sent to me:
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the seventh day of Christmas
my true love sent to me:
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the eighth day of Christmas
my true love sent to me:
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the ninth day of Christmas
my true love sent to me:
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the tenth day of Christmas
my true love sent to me:
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the eleventh day of Christmas
my true love sent to me:
11 Pipers Piping
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree

On the twelfth day of Christmas
my true love sent to me:
12 Drummers Drumming
11 Pipers Piping
10 Lords a Leaping
9 Ladies Dancing
8 Maids a Milking
7 Swans a Swimming
6 Geese a Laying
5 Golden Rings
4 Calling Birds
3 French Hens
2 Turtle Doves
and a Partridge in a Pear Tree
*/

/*
Name: Jackson Frank
Class: SongClass
Purpose: To output "The Twelve Days of Christmas"
Pseudocode: A loop that goes through all 12 days, is given the day and the loop,
	and outputs all the appropriate lines that go with each day using another
	loop.
 */
public class SongClass {

	public static void main(String[] args) {
		twelveDays();

	}
	
	public static void twelveDays() {
		int Day;
		for(Day = 1;Day <= 12;Day++)
		{
			startingLines(Day);
			if(Day != 1){
				int tempDay;
				for(tempDay = Day; tempDay > 0;tempDay--){
					presents(tempDay);
				}
			}
			else{
				System.out.println("A Patridge in a Pear Tree");
				/*usually there's an "and" in the pear tree line so
				  this exception is needed*/	 
			}
			System.out.println("");
				
			
		}
	}
	
	
	public static void startingLines(int day){
		System.out.print("On the " + day);
		switch(day)
		{
		case 1:
			System.out.print("st ");
			break;
		case 2:
			System.out.print("nd ");
			break;
		case 3:
			System.out.print("rd ");
			break;
		default:
			System.out.print("th ");
			break;
		}
		System.out.println("day of christmas");
		
		System.out.println("My true love gave to me");
	}
	
	public static void presents(int amount){
		switch(amount)
		{
		case 1:
			System.out.println("and a Partridge in a Pear Tree");
			break;
		case 2:
			System.out.println("2 Turtle Doves");
			break;
		case 3:
			System.out.println("3 French Hens");
			break;
		case 4:
			System.out.println("4 Calling Birds");
			break;
		case 5:
			System.out.println("5 Golden Rings");
			break;
		case 6:
			System.out.println("6 Geese a Laying");
			break;
		case 7:
			System.out.println("7 Swans a Swimming");
			break;
		case 8:
			System.out.println("8 Maids a Milking");
			break;
		case 9:
			System.out.println("9 Ladies Dancing");
			break;
		case 10:
			System.out.println("10 Lords a Leaping");
			break;
		case 11:
			System.out.println("11 Pipers Piping");
			break;
		case 12:
			System.out.println("12 Drummers Drumming");
			break;
		}
		
	}

}

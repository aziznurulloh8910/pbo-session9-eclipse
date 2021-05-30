import java.util.Scanner; 
public class leapYearCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month;
		int year;
		int day;
		
		System.out.println("input bulan (1-12): ");
		month = in.nextInt();
		System.out.println("input tahun : ");
		year = in.nextInt();
		
		// menentukan bulan ganjil atau genap
		System.out.println("bulan "+ ((month % 2 == 0) ? "genap" : "ganjil"));
		
		// menentukan jumlah hari
		switch(month) {
			case 1:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 2:
				if(year % 4 == 0){
					day = 29;
				}
				else {
					day = 28;
				}
				System.out.println("jumlah hari = "+ day);
				break;
			case 3:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 4:
				day = 30;
				System.out.println("jumlah hari = "+ day);
				break;
			case 5:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 6:
				day = 30;
				System.out.println("jumlah hari = "+ day);
				break;
			case 7:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 8:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 9:
				day = 30;
				System.out.println("jumlah hari = "+ day);
				break;
			case 10:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			case 11:
				day = 30;
				System.out.println("jumlah hari = "+ day);
				break;
			case 12:
				day = 31;
				System.out.println("jumlah hari = "+ day);
				break;
			default:
				System.out.println("invalid command");
		}
		
		// menentukan tahun kabisat
		if (year % 4 == 0) {
			System.out.println(year +" adalah tahun kabisat");
		}
		else {
			System.out.println("tahun "+year +" bukan tahun kabisat");
		}
		
		
	}

}

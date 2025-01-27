package kamalesh;

import java.util.Scanner;
interface busroute{
	public void busway();
}
class man implements busroute{
	public void busway() {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE DATE");
		int date=s.nextInt();
		System.out.println("ENTER THE TIME");
		int time=s.nextInt();
		int velam=20;
		int ranipet=10;
		int ammoor=13;
		String busnum="TN23N2386";
		String busnum2="T3B";
		String sno="T No-         023174";
		String cash="CASH";
		System.out.println("1.velam\n2.ammoor\n3.ranipet");
		int number=s.nextInt();
	
	switch(number){
	case 1:
		System.out.println("\t\tGOVERNMENT BUS");
		System.out.println("\t\tSholingar DEPOT");
		System.out.print(date+"-12-2024");
		System.out.println("\t\t"+time);
		System.out.print(busnum);
		System.out.println("\t"+busnum2);
		System.out.println(sno);
		System.out.print(cash);
		System.out.println("\t\tGENERAL\t\tTOWN ORDIN");
        System.out.println("\tVELAM    to    ARCOT");
		System.out.println("\t\tRS:"+velam);
		System.out.println("\t**HAVE A GREAT RIDE**");
		break;
	case 2:
		System.out.println("\t\tGOVERNMENT BUS");
		System.out.println("\t\tSholingar DEPOT");
		System.out.print(date+"-12-2024");
		System.out.println("\t\t"+time);
		System.out.print(busnum);
		System.out.println("\t"+busnum2);
		System.out.println(sno);
		System.out.print(cash);
		System.out.println("\t\tGENERAL\t\tTOWN ORDIN");
		 System.out.println("\tAMMOOR   to   ARCOT");
		System.out.println("\t\tRS:"+ammoor);
		System.out.println("\t**HAVE A GREAT RIDE**");
		
		break;
	case 3:
		System.out.println("\t\tGOVERNMENT BUS");
		System.out.println("\t\tSholingar DEPOT");
		System.out.print(date+"-12-2024");
		System.out.println("\t\t"+time);
		System.out.print(busnum);
		System.out.println("\t"+busnum2);
		System.out.println(sno);
		System.out.print(cash);
		System.out.println("\t\tGENERAL\t\tTOWN ORDIN");
		System.out.println("\tRANIPET    to    ARCOT");
		System.out.println("\t\tRS:"+ranipet);
		System.out.println("\t**HAVE A GREAT RIDE**");
		break;
		default:
			System.out.println("PLEASE TYPE VALID PLACE ");}
}}
public class bus {
	public static void main(String[] args) {
		man myman=new man();
		myman.busway();
		}}

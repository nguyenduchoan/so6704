package ex31;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1,9,10};
		for(int i : arr) {
			System.out.println("Đây là vòng lặp thứ: " + i);
		}
	}
	
	public static void nhapMaSV() {
		String msv;
		String tenSV;
		float averageScore;
		int age;
		String lop;
		String rank;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập mã sinh viên: ");
		msv = sc.nextLine();
		System.out.println("Mời nhập tên sinh viên: ");
		tenSV = sc.nextLine();
		System.out.println("Mời nhập điểm trung bình: ");
		averageScore = sc.nextFloat();
		System.out.println("Mời bạn nhập tuổi: ");
		age = sc.nextInt();
		
		if(averageScore >= 0 && averageScore <5) {
			rank = "Fail";
		} else if(averageScore >= 5 && averageScore <7) {
			rank = "Pass";
		}else if(averageScore >= 7 && averageScore <8) {
			rank = "Good";
		} else {
			rank = "Exellent";
		}
		
		switch(age) {
			case 6:	
				lop = "Học lớp 1";
				break;
			case 7:	
				lop = "Học lớp 2";
				break;
			case 8:	
				lop = "Học lớp 3";
				break;
			case 9:	
				lop = "Học lớp 4";
				break;
			case 10:	
				lop = "Học lớp 5";
				break;
			default:
				lop = "Không phải cấp 1";
					
		}
		
		System.out.println("Mã của sinh viên là: " + msv + ". Tên sv: " + tenSV);
		System.out.println("Điểm trung bình của sv: " + averageScore + ". Xếp loại sv: " + rank);
		System.out.println("Lớp hiện tại: " + lop);
	}
}

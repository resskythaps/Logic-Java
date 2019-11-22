package logic_1.hari5.siang;

import java.util.Scanner;

public class ArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCollection ac = new ArrayCollection();
		Scanner in = new Scanner(System.in);
		System.out.println("Menu: (1.belajar input arr/2.Geser Array");
		int menu = in.nextInt();
		if (menu == 1) {
			System.out.println("Masukkan berapa panjang array: ");
			int[] arr = new int[in.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Array index ke " + i + ": ");
				arr[i] = in.nextInt();
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Nilai Array index ke " + i + ": " + arr[i]);
			}

		} else if (menu == 2) {
			System.out.println("Masukkan berapa panjang array: ");
			int sc = in.nextInt();
			int[] arr2 = new int[sc];
			for (int i = 0; i < arr2.length; i++) {
				System.out.print("Array index ke " + i + ": ");
				arr2[i] = in.nextInt();
			}

			System.out.println("Array original: ");
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
			int temp = arr2[0];

			for (int i = 1; i < arr2.length; i++) {
				int a = i - 1;
				arr2[a] = arr2[i];
				// System.out.println(arr2[i]);
			}
			arr2[arr2.length - 1] = temp;

			System.out.println("Array moved: ");
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j] + " ");
			}
		} else if (menu == 3) {
			System.out.println("punya pandu");
			int[] nilai = new int[in.nextInt()];
			int nilaipinjam = 0;
			// tampil berdasarkan index

			for (int i = 0; i < nilai.length; i++) {
				System.out.println("array ke" + i);
				nilai[i] = in.nextInt();
			}
			for (int j = 0; j < nilai.length; j++) {
				for (int i = 0; i < nilai.length; i++) {
					if (i == 0) {
						nilaipinjam = nilai[i];
						nilai[i] = nilai[i + 1];
					} else if (i == nilai.length - 1) {
						nilai[i] = nilaipinjam;

					} else
						nilai[i] = nilai[i + 1];

				}
				for (int i = 0; i < nilai.length; i++) {
					System.out.print(nilai[i] + ",");
				}
				System.out.println();
			}
		} else if (menu == 4) {
			System.out.println("Segitiga setengah 1");
			System.out.println("Masukkan berapa panjang array: ");
			int sc = in.nextInt();
			int[] arr2 = new int[sc];
			for (int i = 0; i < arr2.length; i++) {
				System.out.print("Array index ke " + i + ": ");
				arr2[i] = in.nextInt();
			}

			System.out.println("Array original: ");
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.println();
			int i = 0;
			int temp = arr2[0];

			for (int z = 0; z < arr2.length; z++) {
				for (i = 0; i < arr2.length - 1; i++) {
					arr2[i] = arr2[i + 1];
				}
				arr2[i] = temp;

				System.out.println();
				for (int j = 0; j < arr2.length; j++) {
					System.out.print(arr2[j] + " ");
				}
			}
		} else if (menu == 5) {
			System.out.println("Masukkan berapa panjang array: ");
			int sc = in.nextInt();
			int[] arr3 = new int[sc];
			for (int i = 0; i < arr3.length; i++) {
				System.out.print("Array index ke " + i + ": ");
				arr3[i] = in.nextInt();
			}

			System.out.println("Array original: ");
			for (int i = 0; i < arr3.length; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println("");
			int min = arr3[0];
			int index = 0;
			for (int m = 0; m < arr3.length; m++) {
				index = m;
				min = arr3[m];
			}
			System.out.println(min);
		} else if (menu == 6) {
			System.out.println("elemen ganda");
			System.out.println("Masukkan berapa panjang array: ");
			int sc = in.nextInt();
			int[] arr3 = new int[sc];
			for (int i = 0; i < arr3.length; i++) {
				System.out.print("Array index ke " + i + ": ");
				arr3[i] = in.nextInt();
			}

			System.out.println("Array original: ");
			for (int i = 0; i < arr3.length; i++) {
				System.out.print(arr3[i] + " ");
			}
			System.out.println();
			System.out.print("Element ganda: ");
			int p = 0;
			for (int i = 0; i < arr3.length; i++) {
				for (int j = i + 1; j < arr3.length; j++) {
					// buat cek array yg ganda.
					if (arr3[i] == arr3[j]) {
						if (p == arr3[j]) {
							// do nothing
						} else {
							p = arr3[j];
							System.out.print(p+" ");
						}
					}

				}
				// System.out.println(arr3[i]);

			}
		}

	}

}

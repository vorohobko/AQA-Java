
public class Main {

	
	//1
	public static void printThreeWords() {
		//String name;
		System.out.println(" Orange \n Banana \n Apple");
	}
	
	//2
	public static void checkSumSign() {
		int a = 14, b = 2, sum = a + b;
		
		if (sum >= 0) {
			System.out.println("Сумма чисел положительная");
		} else
			System.out.println("Сумма чисел отрицательная");
	}
	
	//3
	public static void printColor() {
		int value = 2;
		
		if (value <= 0) {
			System.out.println("Красный");
		} else if (value <= 100) {
			System.out.println("Жёлтый");
	} else {
		System.out.println("Зелёный");
	}}
	
	//4
	public static void compareNumbers() {
		int a = 1, b = 4;
		
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
	}
	
	//5
	public static boolean twoNum(int a, int b) {
		int sum = a + b;
        return sum >= 10 && sum <= 20;
	}
	
	//6
	public static void posNum(int a) {
		
		if (a >= 0 ) {
			System.out.println("Число положительное");
		} else {
			System.out.println("Число отрицательное");
		}
	}
	
	//7
	public static boolean negNum(int a) {
		return a < 0;
	}
	
	//8
	public static void printStr(String str, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}
	}
	
	//9
	public static boolean checkYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}
		} else {
		return false;
		}
	}
	
	//10
	public static void convArr(int [] myArr) {
		for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myArr[i] ^ 1;
        }
		
		for (int num : myArr) {
            System.out.print(num + " ");
        }
		System.out.println("");
	}
	
	//11
	public static void emptyArr() {
		int [] myArr = new int [100];
		
		for (int i = 0; i < myArr.length; i++) {
			myArr [i] = i + 1;
			System.out.print(myArr[i] + " ");
		}
		System.out.println("");
	}
	
	//12
	public static void uderSix() {
		int [] myArr =  { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		
		for (int i = 0; i < myArr.length; i++) {
			if (myArr[i] < 6) {
				myArr[i] = myArr[i] * 2;
			} 
			System.out.print(myArr[i] + " ");
		}
		System.out.println("");
	}
	
	//13
	public static void squareArr(int len) {
		int [][] squareArr = new int [len][len];
		
		for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
            	if (i == j || i == len - j - 1) {
            		squareArr [i][j] = 1;
            	}
            	else {
                squareArr[i][j] = 0; 
            }
            }
        }

        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(squareArr[i][j] + " ");
            }
            System.out.println();
        	}
        }
	
	//14
	public static void initArr(int len, int initialValue) {
		int [] arr = new int[len];
		
		for(int i = 0; i < len; i++) {
			arr[i] = initialValue;
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
				
		System.out.println("\n № 1 :");
		printThreeWords();
		System.out.println("\n № 2 :");
		checkSumSign();
		System.out.println("\n № 3 :");
		printColor();
		System.out.println("\n № 4 :");
		compareNumbers();
		System.out.println("\n № 5 :");
		System.out.println(twoNum(2, 2));
		System.out.println("\n № 6 :");
		posNum(5);
		System.out.println("\n № 7 :");
		System.out.println(negNum(7));
		System.out.println("\n № 8 :");
		printStr("JAVA", 4);
		System.out.println("\n № 9 :");
		System.out.println(checkYear(2025));
		System.out.println("\n № 10 :");
		int[] myArr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        convArr(myArr);
        //printArray(myArr);
		System.out.println("\n № 11 :");
		emptyArr();
		System.out.println("\n № 12 :");
		uderSix();
		System.out.println("\n № 13 :");
		squareArr(5);
		System.out.println("\n № 14 :");
		initArr(20, 2);
		
	}
}

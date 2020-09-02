package Recursion;

import java.util.Scanner;
import java.util.Random;

public class RecursionDemo {

	public void function(int n) {
		if (n > 0) {
			System.out.println(n);
			n = n - 1;
			function(n);
			System.out.println(n);
		}
	}

	public void function1(int n) {
		if (n > 0) {
			System.out.println(n);
			n = n - 1;
			function1(n);
			System.out.println(n);
			n = n - 1;
			function1(n);
			System.out.println(n);
		}
	}

	public int function2(int n) {
		if (n > 0) {
			int r = function2(n - 1);
			return r + n;
		}
		return 0;
	}

	public int SumDigit(int n) {
		if (n > 0) {
			// int r=n%10;
			// n=n/10;
			// int result=SumDigit(n);
			// return r+result;

			// other logic
			return n % 10 + SumDigit(n / 10);
		}
		return 0;
	}

	public int fib(int n) {
		if (n < 0) {
			return 0;
		} else if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public int reverse(int n, int result) {
		if (n > 0) {
			result = result * 10 + n % 10;
			int m = reverse(n / 10, result);
			return m;

		}
		return result;
	}

	public int multiplication(int m, int n) {
		if (n == 0) {
			return 0;
		}
		if (m < n) {
			return multiplication(n, m);
		} else {
			return multiplication(m, n - 1);
		}
	}

	public int fact(int n) {
		if (n > 0) {

			if (n == 0) {
				return 1;
			} else {
				return n * fact(n - 1);
			}
		}
		return 1;
	}

	public int cube(int base, int exponent) {
		if (exponent > 0) {
			if (exponent == 0) {
				return 1;
			} else {
				return base * cube(base, exponent - 1);
			}
		}
		return 1;
	}

	public void NaturalNum(int strtpoint, int endpoint) {
		if (strtpoint > endpoint) {
			return;
		} else {
			System.out.println(strtpoint);
			NaturalNum(strtpoint + 1, endpoint);
		}
	}

	public int SumNaturalNum(int lowerlimit, int upperlimit) {

		if (lowerlimit == upperlimit) {
			return lowerlimit;
		} else {
			return lowerlimit + SumNaturalNum(lowerlimit + 1, upperlimit);
		}
	}

	public void EvenOdd(int start, int end) {
		if (start >= end) {
			return;
		} else {
			System.out.println(start);
			EvenOdd(start + 2, end);
		}
	}

	public int SumEvenOdd(int start, int end) {

		if (start > end) {
			return 0;
		} else {
			return start + SumEvenOdd(start + 2, end);
		}
	}

	public int ncr(int n, int r) {
		{
			if (n == r || r == 0)
				return 1;
			else {
				int n1 = ncr(n - 1, r - 1);
				int n2 = ncr(n - 1, r);
				return n1 + n2;
			}
		}
	}

	public int powerfun(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * powerfun(base, exponent - 1);
		}
	}

	public void array(int arr[], int start, int length) {

		if (start >= length) {
			return;
		} else {
			System.out.println(arr[start]);
			array(arr, start + 1, length);
		}
	}

	public int Sumarray(int arr[], int start, int length) {
		if (start >= length) {
			return 0;
		} else {
			return arr[start] + Sumarray(arr, start + 1, length);
		}
	}

	public void readarray(int arr[], int index, int length) {

		if (arr.length == 0) {
			return;
		}
		System.out.println(arr[index]);
		readarray(arr, index + 1, length - 1);

	}

	public void writearray(int arr[], int index, int length) {

		Scanner sc = new Scanner(System.in);
		if (arr.length == 0) {
			return;
		}

		arr[index] = sc.nextInt();
		System.out.println(arr[index]);
		writearray(arr, index + 1, length - 1);
	}

	public int SumArray(int arr[], int index, int length) {

		if (length == 0) {
			return 0;
		}
		return arr[index] + SumArray(arr, index + 1, length - 1);
	}

	public int MaximumNumber(int[] arr, int index, int length, int max) {

		max = arr[index];
		if (length == 0) {
			return max;
		}

		if (arr[index] > max) {
			return max;
		}
		return MaximumNumber(arr, index + 1, length - 1, max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a Number");
		int x = sc.nextInt();
		RecursionDemo obj = new RecursionDemo();
		obj.function(x);

		// obj.function1(x);

		// int r=obj.function2(x);
		//
		// System.out.println(r);

		// int y=obj.SumDigit(x);
		// System.out.println(y);

		// int fibse=obj.fib(x);
		// System.out.println(fibse);

		// int r=0;
		// int reverse = obj.reverse(x, r);
		// System.out.println(reverse);
		//
		// int multiplication = obj.multiplication(10, 5);
		// System.out.println(multiplication);

		// int n = obj.fact(x);
		// System.out.println("Factorial of a number " + n);

		// int expo=3;
		// int cube = obj.cube(x, expo);
		// System.out.println(cube);

		// int startpoint = 1;
		// obj.NaturalNum(startpoint,x);
		// int sumNaturalNum = obj.SumNaturalNum(startpoint, x);
		// System.out.println(sumNaturalNum);

		// obj.EvenOdd(startpoint, x);

		// int sumEvenOdd = obj.SumEvenOdd(startpoint, x);
		// System.out.println(sumEvenOdd);

		// int ncr = obj.ncr(4, 2);
		// System.out.println(ncr);

		// int powerfun = obj.powerfun(0, 3);
		// System.out.println(powerfun);

		// int arr[]=new int[5];
		// Random sc1=new Random();
		//
		// for(int i=0; i<arr.length; i++){
		// arr[i]=sc1.nextInt(1000);
		// }
		// int sumarray = obj.Sumarray(arr, 0, arr.length);
		// System.out.println(sumarray);

		// obj.array(arr, 0, arr.length);

		// int arr1[]=new int[5];
		//
		// obj.writearray(arr1, 0, arr1.length);
		//
		// int arr[] = new int[] { 9, 5, 12, 77, 5 };
		// int sumArray = obj.SumArray(arr, 0, arr.length);
		// System.out.println(sumArray);
		//
		// int maximumNumber = obj.MaximumNumber(arr, 0, arr.length, 0);
		// System.out.println(maximumNumber);
	}

}

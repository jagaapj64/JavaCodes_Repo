package features_java;

public class RemoveElements {

	public static void main(String[] args) {

		int arr[] = {20, 80, 20, 90, 30, 20, 100, 50,30};
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

}

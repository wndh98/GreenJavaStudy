//package class03_method;
//
//import java.util.Arrays;
//
//public class Parameter {
//
//   // �Ű������� 2���� Ȯ���Ǿ� �ִ� �޼ҵ�
//   int sum1(int x, int y) {
//      int sum = 0;
//      for (int i = x; i <= y; i++) {
//         sum += i;
//      }
//      return sum;
//   }
//
//   // �迭�� �Ű������� �޴� �޼ҵ� - �迭�� ���̴� ��� ����
//   int sum1(int[] values) {
//      int sum = 0;
//      for (int i = 0; i < values.length; i++) {
//         sum += values[i];
//      }
//      return sum;
//   }
//
//   // �������� ���� ������ �Ű����� �޴� �޼ҵ�, �迭�� ���� �� ����
//   int sum2(int... values) {
//      int sum = 0;
//      for (int i = 0; i < values.length; i++) {
//         sum += values[i];
//      }
//      return sum;
//   }
//
//   boolean containAll(int[] arr, int... values) {
//      for (int i = 0; i < values.length; i++) {
//         for (int j = 0; j < arr.length; j++) {
//            if (arr[j] == values[i]) {
//               break;
//            }
//            if (j == arr.length - 1) {
//               return false;
//            }
//         }
//      }
//
//      return true;
//   }
//
//   void prize(String[] cls) {
//      for (String student : cls) {
//         if (student.charAt(0) == '��') {
//            System.out.println(student + " ����!!!");
//         }
//      }
//   }
//
//}
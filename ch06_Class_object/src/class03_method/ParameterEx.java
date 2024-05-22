//package class03_method;
//
//public class ParameterEx {
//   public static void main(String[] args) {
//      //�⺻�����ڷ� ��ü ����
//      Parameter pr = new Parameter();
//      
//      //int result = pr.sum1(3);
//      int result = pr.sum1(3, 33);
//      System.out.println(result);
//      
//      
//      int[] scores = {23, 77, 98, 84, 36, 59, 68};
//      result = pr.sum1(scores);
//      System.out.println(result);
//      
//      result = pr.sum2(23, 77, 98, 84, 36, 59, 68);
//      System.out.println(result);
//      
//      result = pr.sum2(23, 77, 98);
//      System.out.println(result);
//      
//      result = pr.sum2(scores);
//      System.out.println(result);
//      
//      boolean ans = pr.containAll(scores, 23, 77, 98);
//      System.out.println(ans);
//      
//      ans = pr.containAll(scores, 23, 77, 98, 33);
//      System.out.println(ans);
//      
//      String[] myClass= {
//            "�𺸶�",
//            "������", "��ǿ�", "õ���", "�����",
//            "���ֿ�", "�̺���", "��ö��"
//      };
//      
//      pr.prize(myClass);
//   }
//}
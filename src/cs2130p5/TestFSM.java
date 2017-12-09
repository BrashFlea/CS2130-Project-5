// Project #5 test program
package cs2130p5;

public class TestFSM {
  
  public static void main(String[] args)
  {

    // Language: strings that contain an odd number of a's and exactly one b. 
    String A1 = "ab";
    int[][] ST1 =  {{3,2},
                    {2,4},
                    {1,4},
                    {0,1},
                    {4,4}};

    int[] AS1 = {0,1,0,0,0};

    FSM L1 = new FSM (A1, ST1, AS1);

    String inString1a = "aabaaaa";
    String inString1b = "aaabaaaa";
    String inString1c = "aabaaaab";
    String inString1d = "baaaaaa";
    String inString1e = "aaaaabaa";

    boolean accept1a = L1.validString(inString1a);
    boolean accept1b = L1.validString(inString1b);
    boolean accept1c = L1.validString(inString1c);
    boolean accept1d = L1.validString(inString1d);
    boolean accept1e = L1.validString(inString1e);

    System.out.println("L1:");
    System.out.println("String: " + inString1a + "   Accept?  " + accept1a);
    System.out.println("String: " + inString1b + "   Accept?  " + accept1b);
    System.out.println("String: " + inString1c + "   Accept?  " + accept1c);
    System.out.println("String: " + inString1d + "   Accept?  " + accept1d);
    System.out.println("String: " + inString1e + "   Accept?  " + accept1e);
    addLine();


  } // end main

  public static void addLine() {
    System.out.println("--------------------------------");
  }

} // end class

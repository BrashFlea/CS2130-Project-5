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
    
    // Language: strings of length 3 or less that have more 0's than 1's.
    String A2 = "01";
    int[][] ST2 =  {{4,3},
                    {6,6},
                    {1,6},
                    {2,6},
                    {5,2},
                    {1,1},
                    {6,6}};

    int[]AS2 = {0, 1, 0, 0, 1, 1, 0};
    
    // Language: strings that contain xyx or zyz.
    String A3 = "xyz";
    int[][] ST3 =  {{4,0,1},
                    {4,2,1},
                    {4,0,3},
                    {3,3,3},
                    {4,5,1},
                    {3,0,1}};

    int[]AS3 = {0, 0, 0, 1, 0, 0};

    FSM L1 = new FSM (A1, ST1, AS1);
    FSM L2 = new FSM (A2, ST2, AS2);
    FSM L3 = new FSM (A3, ST3, AS3);

    String inString1a = "aabaaaa";
    String inString1b = "aaabaaaa";
    String inString1c = "aabaaaab";
    String inString1d = "baaaaaa";
    String inString1e = "aaaaabaa";
    
    String inString2a = "10";
    String inString2b = "00";
    String inString2c = "010";
    String inString2d = "101";
    String inString2e = "0100";
    
    String inString3a = "xyzyzyzy";
    String inString3b = "xzzxzxyy";
    String inString3c = "yzxyzyyz";
    String inString3d = "zzyzxyxx";
    String inString3e = "yxzxxyzy";

    boolean accept1a = L1.validString(inString1a);
    boolean accept1b = L1.validString(inString1b);
    boolean accept1c = L1.validString(inString1c);
    boolean accept1d = L1.validString(inString1d);
    boolean accept1e = L1.validString(inString1e);
    
    boolean accept2a = L2.validString(inString2a);
    boolean accept2b = L2.validString(inString2b);
    boolean accept2c = L2.validString(inString2c);
    boolean accept2d = L2.validString(inString2d);
    boolean accept2e = L2.validString(inString2e);
    
    boolean accept3a = L3.validString(inString3a);
    boolean accept3b = L3.validString(inString3b);
    boolean accept3c = L3.validString(inString3c);
    boolean accept3d = L3.validString(inString3d);
    boolean accept3e = L3.validString(inString3e);

    System.out.println("L1:");
    System.out.println("String: " + inString1a + "   Accept?  " + accept1a);
    System.out.println("String: " + inString1b + "   Accept?  " + accept1b);
    System.out.println("String: " + inString1c + "   Accept?  " + accept1c);
    System.out.println("String: " + inString1d + "   Accept?  " + accept1d);
    System.out.println("String: " + inString1e + "   Accept?  " + accept1e);
    addLine();
    
    System.out.println("L2:");
    System.out.println("String: " + inString2a + "   Accept?  " + accept2a);
    System.out.println("String: " + inString2b + "   Accept?  " + accept2b);
    System.out.println("String: " + inString2c + "   Accept?  " + accept2c);
    System.out.println("String: " + inString2d + "   Accept?  " + accept2d);
    System.out.println("String: " + inString2e + "   Accept?  " + accept2e);
    addLine();
    
    System.out.println("L3:");
    System.out.println("String: " + inString3a + "   Accept?  " + accept3a);
    System.out.println("String: " + inString3b + "   Accept?  " + accept3b);
    System.out.println("String: " + inString3c + "   Accept?  " + accept3c);
    System.out.println("String: " + inString3d + "   Accept?  " + accept3d);
    System.out.println("String: " + inString3e + "   Accept?  " + accept3e);
    addLine();


  } // end main

  public static void addLine() {
    System.out.println("--------------------------------");
  }

} // end class

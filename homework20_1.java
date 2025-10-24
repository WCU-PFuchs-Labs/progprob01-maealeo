/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
public class homework20_1
{
   public static void main(String[] args)
   {
      LinkedList llist = new LinkedList(); 

      //create a scanner to read input from console 
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Please enter five integers");

      //loop through to read five integers 
      for(int i = 0; i < 5; i++){
         System.out.println("Enter integer " + (i + 1) + ": ");
         //read the integer and add it to the linked list 
         int number = scanner.nextInt(); 

         ListNode newNode = new ListNode(number); 
         if(llist.head == null){
            llist.head = newNode; 
         } else{
            ListNode current = llist.head; 
            while(current.next != null){
               current = current.next;
            }
            current.next = newNode; 
         }
         }
      scanner.close(); 
      System.out.println(llist.toString()); 
   
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      //add your code here
   }

}

class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}

class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}

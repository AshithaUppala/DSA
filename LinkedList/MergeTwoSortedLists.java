

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/


/* if the two lists are

  {5,10,15,40}
  {1,2,20}

  output is
     2 3 5 10 15 20 40

     */
class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" 
     // You only need to complete this method
     Node dummy=new Node(0);
     Node current=dummy;
     while(head1 !=null && head2!=null){
         if(head1.data<=head2.data){
             current.next=head1;
             head1=head1.next;
         }
         else{
             current.next=head2;
             head2=head2.next;
         }
         current=current.next;
     }
     if(head1 !=null){
         current.next=head1;
     }
     else{
         current.next=head2;
     }
     return dummy.next;
   } 
}
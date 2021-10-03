public class LinkedlistImplemenataion
{
  class Node{
      int data;
      Node next;
      Node(int data){
          this.data=data;
      }
  }
      Node head=null;
      Node tail=null;
  public void add(int data){
      Node newnode=new Node(data);
      if(head==null){
          head=newnode;
          tail=newnode;
          newnode.next=null;
      }
      else{
          tail.next=newnode;
          tail=tail.next;
          tail.next=null;
      }
  }
  public void addfirst(int data){
     Node newnode=new Node(data);
      if(head==null){
          head=newnode;
          tail=newnode;
          newnode.next=null;
      }
      
      else{
          newnode.next=head;
          head=newnode;
      }
  }
  public void addlast(int data){
        Node newnode=new Node(data);
      if(head==null){
          head=newnode;
          tail=newnode;
          newnode.next=null;
      }
      
      else{
          tail.next=newnode;
          tail=tail.next;
          tail.next=null;
      }
  }
  public void addAtCertainPos(int data,int pos){
    Node newnode=new Node(data);
      if(head==null){
          head=newnode;
          tail=newnode;
          newnode.next=null;
      }
    else{
        Node temp=head;
        int i=0;
        while(temp!=null && i>pos){
            temp=temp.next;
        }
        Node help=temp.next;
        temp.next=newnode;
        newnode.next=help;
    }  
      
  }
  public void deletefirst(){
    
      if(head==null){
          System.out.println("empty");
      }
      else{
          head=head.next;
      }
  }
   public void deletelast(){
    
      if(head==null){
       System.out.println("empty");
      }
      else{
          Node temp=head;
          while(temp.next.next!=null){
              temp=temp.next;
          }
          temp.next=null;
      }
  }
   public void deleteCertainData(int data){
      if(head==null){
       System.out.println("empty");
      }
      else{
          Node temp=head;
          while(temp!=null && temp.next.data!=data){
              temp=temp.next;
          }
        temp.next=temp.next.next;
      }
  }
  public void display(){
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.data+"->");
          temp=temp.next;
      }
  }
	public static void main(String[] args) {
		LinkedlistImplemenataion a=new LinkedlistImplemenataion();
		a.add(1);
		a.add(2);
		a.display();
		a.addfirst(3);
		System.out.println();
	    a.display();
	    a.addlast(9);
	    System.out.println();
	    a.display();
	    a.addAtCertainPos(8,2);
	    System.out.println();
	    a.display();
	    a.deletefirst();
	    System.out.println();
	     a.display();
	    a.deletelast();
	    System.out.println();
	     a.display();
	    a.deleteCertainData(1);
	    a.display();
	}
}

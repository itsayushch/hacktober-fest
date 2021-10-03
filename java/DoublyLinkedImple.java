public class DoublyLinkedImple. {  
    //Represents the node of list.  
        public class Node{  
            int data;  
            Node next;  
            Node prev;
            public Node(int data) {  
                this.data = data;  
            }  
        }  
  
        //Declaring head and tail pointer as null.  
        public Node head = null;  
        public Node tail = null;  

     public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
        
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {     
            tail.next = newNode;  
            newNode.prev=tail;
            tail = newNode;  
        }  
    }
        //This function will add the new node at the end of the list.  
        public void addAtStart(int data){  
          
            Node newNode = new Node(data);  
           
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                //Store data into temporary node  
                Node temp = head;  
                newNode.next=temp;
                temp.prev=newNode;
                head=newNode;
            }  
        }  
                public void addAtEnd(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            //Checks if the list is empty.  
            if(head == null) {  
                 //If list is empty, both head and tail would point to new node.  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
              tail.next=newNode;
              newNode.prev=tail;
              tail=newNode;
            }  
        }  
        
        
        public void addNodeAtCertainIndex(int val, int index){
        Node newNode  = new Node(val);
         if(head==null){
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
         }
            Node temp = head;
			int count = 0;
			while(temp!=null && ++count!=index){
			temp = temp.next;
			}
		   Node helpnext=temp.next;
		   temp.next=newNode;
		   newNode.prev=temp;
		   newNode.next=helpnext;
		   temp.next.prev=newNode;
		    
        }
   
        
    //Deletes node from the beginning of the list  
        public void deleteStart() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
          head=head.next;
        }  
    }  
  
        
         //Deletes node from end of the list  
        public void deleteEnd() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {
            Node temp=head;
          while(temp.next.next!=null){
              temp=temp.next;
          }
          temp.next=null;
        }  
    }  
    
     public void deleteAtCertainData(int data){
           if(head == null) {  
            return;  
        } 
        
        else{
          
                Node current=head;
                 while(current!=null  && current.next.data!=data) {  
                    current = current.next;  
                }  
                current.next=current.next.next;
                current.next.prev=current.next;
            }
     }
  
  public void deleteAtCertainIndex(int idx){
         if(head == null) {  
           return;
        } 
        else{
            int i=0;
           
                Node current=head;
                while(current.next!=tail && i>idx){
                    current=current.next;
                    i++;
                }
                  current.next=current.next.next;
                  current.next.prev=current.next;
            
        }
  }
  
    public void search(int element){
         Node current = head;  
        int i = 1;  
        boolean flag = false;  
        
         if(head == null) {  
            System.out.println("List is empty");  
        }  
     
      while(current!=null){
          if(current.data==element){
              flag=true;
              break;
          }
          current=current.next;
      } 
      
             if(flag)  
                 System.out.println("Element is present in the list at the position : " + i);  
            else  
                 System.out.println("Element is not present in the list");  
	}
            
        public void display() {  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
             while(current!=null){
                 System.out.print(current.data+" ");
                 current=current.next;
             }
            }  
        }  
        
        
        public static void main(String[] args) {  
            DoublyLinkedImple. cl = new DoublyLinkedImple.();  
  
         
            cl.add(1);  
            cl.add(2);  
            cl.add(3);  
            cl.display();  
            System.out.println();
            System.out.println("insert at first");
            cl.addAtStart(4);  
    
            cl.display();  
            System.out.println();
            System.out.println("insert at last");
            cl.addAtEnd(10);  
            cl.display();  
            
          
            cl.addNodeAtCertainIndex(21,2);  
            cl.display(); 
            
            System.out.println();
            cl.deleteStart();
            cl.display(); 
            
            System.out.println();
            cl.deleteEnd();
            cl.display();
            
            System.out.println();
            cl.deleteAtCertainData(2);
            cl.display();
            System.out.println();
            cl.deleteAtCertainIndex(2);
            cl.display();
            
            cl.search(3);
            
            
            
        }  
}  

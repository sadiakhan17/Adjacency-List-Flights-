//myNode class
public class MyNode<E>{
	
	//instance variables
	public E name;
	public MyNode <E> next;
	
	//constructor
	public MyNode(E myName){
		name=myName;
		next=null;
	
	}//constructor
	
	//getValue method
	public E getValue(){
		return name;
	}///getvalue
	
}//MyNode
 
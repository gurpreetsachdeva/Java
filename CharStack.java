public class CharStack{  

 char[] stackArray;
 int topOfStack;
 public CharStack(int capacity){
 stackArray=new char[capacity];
 topOfStack=-1;
 }

 public void push(char A){
 if (topOfStack==stackArray.length-1)
 return;
 else {
 //System.out.println();
 stackArray[++topOfStack]=A;
 }
 }
 public char pop(){
 if (topOfStack==-1) return '\u0000';
 else return stackArray[topOfStack--];
 }
 public char peek(){
 if (topOfStack==-1) return '\u0000';
 else return stackArray[topOfStack];
 }
 public boolean isEmpty(){
 return topOfStack==-1;
 }
 public boolean isFull(){
 return topOfStack==stackArray.length-1;
 }
 public static void main(String [] args){
  CharStack obj= new CharStack(20);
  obj.push('A');
  
  System.out.println(obj.pop());
 // System.out.println(obj.pop());
 }
}
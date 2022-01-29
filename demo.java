
import java.util.*;

class demo{



public static void printpg(String a){
  System.out.println(a);
}

    public static void main (String[] args){


// Array

    //  int [] marks=new int[3];
    //  marks[0]=1;
    //  marks[2]=3;
    //  marks[1]=999;
    //  System.out.println(marks.length);
    //  Arrays.sort(marks);
    //  for(int i=0;i<marks.length;i++)System.out.println(marks[i]);
    
    

// 2d array




    // int [][] marks=new int[3][3];
    // for(int i=0;i<marks.length;i++){
    //   for(int j=0;j<marks.length;j++){
    //     marks[i][j]=i+j;
    //   }
    // }
    //    marks[0][0]=9999;
    // for(int i=0;i<marks.length;i++){
    //   Arrays.sort(marks[i]);
    // }
   
    // for(int i=0;i<marks.length;i++){
    //   for(int j=0;j<marks.length;j++){
    //     System.out.print(marks[i][j]+" ");

    //   }
    //   System.out.println();
    // }
   



  //  casting


  // double a=100.0;
  // float a1=199.0f;
  // a1+=a;
  // System.out.println(a);
  // a1=(int)a1+10;
  // System.out.println(a1);
  // int c=(int)a1;
  // System.out.println(c); 



  // constansts

  // final int  a=11;
  // final float v=111.111f;
  // System.out.print(a+"  "+v);






  //  MAx and Min using math class

  // System.out.println(Math.max(4,5));
  // System.out.println(Math.min(4,5));




  // Taking inputs
  // Scanner sc= new Scanner(System.in);
  // int a=sc.nextInt();
  // System.out.println(a);
  // float b=sc.nextFloat();
  // System.out.println(b);
  //   String s=sc.next();
  //   String s1=sc.nextLine();
  // System.out.println(s);
  // System.out.println(s1);
  // System.out.println(s+s1);
// int n;
// n=sc.nextInt();


// int[] arr=new int[n];
// for(int i=0;i<n;i++)arr[i]=sc.nextInt();
// for(int i=0;i<n;i++)System.out.println(arr[i]);





// int a=10;


// try{
//   System.out.println(a);
//   int [] arr={1,2,3,4};
//  int i=0;
//  while(true){

//   System.out.println(arr[i]);
// i++;n--;
//   if(n==0)break;
  


//  }

// }catch(Exception e){
// System.out.println(e);
// }
// System.out.println(a);



// printpg("yooo");


// array list


// List<Integer> v=new ArrayList<>();
// v.add(1);
// v.add(2);v.add(3);v.add(9999);v.add(-111);

//  System.out.println(v);
// // System.out.println(v.size());
//    for(int i=0;i<v.size();i++)v.set(i,v.get(i)*10);
//    System.out.println(v);
//  v.remove(v.size()-1);
  
//  System.out.println(v);





// stack

// Stack<Integer> s=new Stack<>();
// Stack<String> s1=new Stack<>();
// Stack<Double> s2=new Stack<>();

// s.push(1);s.push(2);s.push(3);
//  System.out.println( s.peek());
// s.pop();
// System.out.println( s.peek());

// System.out.println( s.size() );



// queue


// Queue<Integer> q=new LinkedList<>();

// q.offer(1);q.offer(3);q.offer(4);
// // System.out.println(q);
// // System.out.println(q.peek());
// //  System.out.println("out"+q.poll());
// //  System.out.println(q.size());

//   while(!q.isEmpty()){
//     System.out.println(q.poll());
//   }



// Priority Queue

// Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
// pq.offer(4);
// pq.offer(1);
// pq.offer(1234555666);
// pq.offer(-1);
// System.out.println(pq);
// System.out.println(pq.size());
// while(pq.size()>0){
//   System.out.println(pq.poll());
// }
// System.out.println(pq.peek());


// HAshSet

// Set<Integer> s=new HashSet<>();
// s.add(1);
// s.add(1);
// s.add(1);
// s.add(1);
// s.add(3);
// s.add(4);
// System.out.println(s);
// Iterator<Integer> it=s.iterator();
// while(it.hasNext()){
//   System.out.println(it.next());
// }



// Set<Integer> s=new TreeSet<>();
// s.add(1);
// s.add(7);
// s.add(-111);
// s.add(1);
// s.add(7);
// s.add(-111);
// // System.out.println(s );
// Iterator<Integer> it=s.iterator();
// while(it.hasNext()){
//   System.out.println(it.next());
// }



// Map<Integer,Integer> m=new HashMap<>();
// m.put(1,2);
// m.put(2,4);
// m.put(3,9);
//  m.remove(3);
//  m.remove(3000);

//  System.out.println(m);
//  for(Map.Entry<Integer,Integer> el:m.entrySet()){
//     System.out.println(el.getKey()+" "+el.getValue());
//  }

 



// Map<Integer,Integer> m=new TreeMap<>(Comparator.reverseOrder());
// m.put(1,2);
// m.put(3,9);
// m.put(2,4);

// //  m.remove(3);
// //  m.remove(3000);

//  System.out.println(m);
//  for(Map.Entry<Integer,Integer> el:m.entrySet()){
//     System.out.println(el.getKey()+" "+el.getValue());
//  }

  

// List<Integer> l=new ArrayList<>();
// l.add(4);
// l.add(1);
// l.add(-33);
// l.sort(Comparator.reverseOrder());
// for(int i=0;i<l.size();i++)System.out.println(l.get(i));




// counting frequency
// Map<Character,Integer> m=new HashMap<>();
// Scanner sc=new Scanner(System.in);

// String s=sc.nextLine();
// for(int i=0;i<s.length();i++){
//   if(s.charAt(i)!=' '){
//   if(m.containsKey(s.charAt(i)))  m.put(s.charAt(i),m.get(s.charAt(i))+1);
//   else m.put(s.charAt(i),1);
//   }
// }



// sc.close();

// for(Map.Entry<Character,Integer> el:m.entrySet()){
//   System.out.println(el.getKey()+" --->"+el.getValue());
// }





Map<Integer,List<Integer>> m=new HashMap<>();

// m.put(1,);






    }
}

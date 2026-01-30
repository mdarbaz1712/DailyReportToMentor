//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//        HashMap<String,Integer> mp=new HashMap<String,Integer> ();
//        mp.put("Hello",5);
//        mp.put("World",9);
////        Iterator<String,Integer> iter=mp.Iterator();
//        for(var iter:mp.entrySet()){
//            System.out.println(iter.getKey()+" = "+iter.getValue());
//        }
//    ArrayList<Integer> arr=new ArrayList<>();
//    var arr1=new ArrayList<Integer> ();
//    List<Integer> arr2=new ArrayList<Integer> ();
//    ArrayList<Integer> arr3=new ArrayList<Integer> ();
//    arr.add(1);
//    arr.add(4);
//    arr.add(2);
//    arr.add(3,9);
//    arr.addFirst(10);
//    System.out.println(arr);
//    System.out.println(arr.get(2));
//    arr.set(2,8);
//    System.out.println(arr.get(2));
//    arr.remove(1);
//    var arr=new LinkedList<Integer> ();
//    arr.addFirst(0);
//    arr.addLast(1);
//    arr.addLast(2);
//    arr.addFirst(10);
//    System.out.println(arr.getFirst());
//    System.out.println(arr.getLast());
//    Collections.sort(arr,Collections.reverseOrder());
//    System.out.println(arr);
//    var st=new LinkedHashSet<>();
//    st.add(111);
//    st.add(101);
//    st.add(9);
//    System.out.println(st.contains(101));
//    for(var v:st)
//    System.out.println(v);
//    String s1="feasf";
//    String s2="feasf1";
//    if(s1==s2){
//        System.out.println("Hello World1");
//    }
//    if(s1.equals(s2)){
//        System.out.println("Hello World2");
//    }
    var mp=new HashMap<>();
    mp.put(1,2);
    mp.put(1,3);
    mp.put(2,4);
    System.out.println(mp.get(1));
    System.out.println(mp.containsValue(3));
    System.out.println(mp.containsKey(3));
    System.out.println(mp.get(2));
    System.out.println(mp.remove(2));
    System.out.println(mp.keySet());
    for(var v:mp.entrySet()){
        System.out.println(v.getKey()+" = "+v.getValue());
    }



}

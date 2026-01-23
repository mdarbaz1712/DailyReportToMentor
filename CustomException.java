

class CustomException {
    static void checkAge(int age)throws Exception{
        if(age<18){
            throw new Exception();
        }
            // throw new Exception();
        else
            System.out.println("Give Vote Please");
    }

    public static void main(String[] args) {
        int age=12;
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        // try {
        //     int x=10/0;
        //     System.out.println(x);
        // } catch (Exception e) {
        //     System.out.println("Exception are: "+e);
        // }
    }
}

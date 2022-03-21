class Exceptionblocks {
    public static void main(String[] args){
        try{
            System.out.println("**Try block**");
            int i = 4/0;
            System.out.println(i);
        }
        catch(ArithmeticException e){
            System.out.println("**catch block**");
            System.out.println("ArithmeticException: Number Divided by Zero");
        }
        finally{
            System.out.println("** Thank You **");
        }
    }
}
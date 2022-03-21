import java.io.* ;

public class Ranks {
    public static  void main(String[] args)
    {
        String file ="C:\\Users\\suhasm\\Desktop\\core\\StudentData.csv";
        BufferedReader reader= null;
        String line ="";
        try{
            reader = new BufferedReader(new FileReader(file));
            while((line= reader.readLine())!= null){
                String[] row = line.split(",");
                System.out.println(row[4]);
                //String[] rank= row[4];
               // System.out.println();
                // row user = new row(row[4]);
                for(int i = 0;i<=row.length;i++){
                    if(row[4] == 1 || 2||3||4||5){
                        
                    }
                }
                for(String index:row){
                    System.out.printf(" %5s",index);
                }
                System.out.println();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }catch(IOException e){
                e.printStackTrace();
            }

        }
    }
}

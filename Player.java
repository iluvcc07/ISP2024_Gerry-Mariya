import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    private String name;
    private int highScore;
    private int rNum;
    Scanner n;
    Scanner s;
    Scanner s2;
    PrintWriter pN;
    PrintWriter pSA;
    PrintWriter pSA2;
    PrintWriter pSO;
    Player(String nam){
        name = nam;
        try {
            n = new Scanner(new File("playerList"));
            s = new Scanner(new File("scoreList"));
            s2 = new Scanner(new File("scoreList"));
           pN = new PrintWriter(new FileWriter("playerList",true));
           pSA = new PrintWriter(new FileWriter("scoreList",true));
           pSA2 = new PrintWriter(new FileWriter("scoreList",true));
        //   pSO = new PrintWriter(new FileWriter("scoreList",false));

        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }

    public int getRowNum(){
        int rowNum = 0;
        boolean found = false;
        while(n.hasNextLine()&& !found) {
            rowNum ++;
            if(n.nextLine().equals(name)) {
                found = true;
            }
        }
    if(!found) {
            pN.println(name);
            pSA.println(0);
            pN.close();
            pSA.close();
            rNum = rowNum+1;
            return rowNum+1;
        }
        else {
            rNum = rowNum;
            return rowNum;
        }
    }

    public int getHighScore(){
        this.getRowNum();
        for(int i = 1; i <rNum;i++){
            s.nextInt();
        }
        if(s.hasNextInt()) {
            highScore = s.nextInt();
            return highScore;
        }else{
            return 0;
        }
    }

    public void setHighScore(int hS){
        this.getHighScore();
        if(hS > highScore){
            ArrayList<Integer> tempSFile = new ArrayList<Integer>();
            while(s2.hasNextInt()){
                tempSFile.add(s2.nextInt());
            }
            tempSFile.remove(rNum-1);
            tempSFile.add(rNum-1,hS);
            try {
                pSO = new PrintWriter(new FileWriter("scoreList", false));
            }catch (Exception e){}
            pSO.close();
            for(int i = 0; i < tempSFile.size(); i++){
                pSA2.println(tempSFile.get(i));
            }
            pSA2.close();
        }
    }

}

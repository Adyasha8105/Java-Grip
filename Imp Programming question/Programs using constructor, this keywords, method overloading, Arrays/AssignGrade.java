import java.io.*;
import java.util.*;

public class AssignGrade {
    private int scores[];
    public int findBestScores(int scores[]) {
        int i=0, best=0;
        int len= scores.length;
        while(i<len) {
            if(scores[i]>best)
            best=scores[i];
            i++;
        }
        return best;
    }

    public void assignGrade(int score[], int best) {
        int len=score.length;
        int i=0;
        System.out.println("\nStudent No. \t       Grade \n-----------------------------\n ");
          while(i<len) {
            if(score[i]>=(best-10))
             System.out.println("Student "+(i+1)+ "\t -\t A");

            else if (score[i]>=(best-20))
             System.out.println("Student "+(i+1) + "\t -\t B");

            else if (score[i]>=(best-30))
             System.out.println("Student "+(i+1) + "\t -\t C");
            
            else if (score[i]>=(best-40))
             System.out.println("Student "+(i+1) + "\t -\t D");

            else
             System.out.println("Student "+(i+1) + "\t -\t F");
            
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("\nEnter the no. of students: ");
        int no= sc.nextInt();
        AssignGrade ag = new AssignGrade();
        ag.scores= new int[no];
        System.out.println("Enter the scores of the students: ");
        int i=0;
        for(i=0; i<no; i++) {
            System.out.print("Student "+(i+1)+": ");
            ag.scores[i]=sc.nextInt();
        }
        
        int bestscore = ag.findBestScores(ag.scores);
        System.out.println("\nThe Best Score among the student is "+ bestscore);
        ag.assignGrade(ag.scores,bestscore);
    }
}

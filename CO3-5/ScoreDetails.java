interface Student{
    void Academicdect(String StudentName,int Score,String Subject);
}
interface Sports{
    void SportsScore(int SportsScore);
}

class Result implements Student,Sports{

        public void Academicdect(String StudentName,int Score,String Subject){
            System.out.println("The academic detais:"+StudentName+" "+Score+" "+Subject);
        }
        public void SportsScore(int SportsScore){
            System.out.println("Sports score:"+SportsScore);
        }
    }

class ScoreDetails{
    public static void main(String args[]){
        Result r1=new Result();
        r1.Academicdect("RAHUL",80,"MATHS");
        r1.SportsScore(90);

    }
}

package learnings.oops.encapsulation;

class Marks {
    private int[] scores;

    public void setScores(int[] scores){
        this.scores = scores.clone();
    }

    public int[] getScores(){
        return scores.clone();
    }
}

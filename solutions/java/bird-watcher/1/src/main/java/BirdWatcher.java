class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] storelastWeek = new int[birdsPerDay.length];
        for (int i=0;i<birdsPerDay.length;i++){
            storelastWeek[i] = birdsPerDay[i];
        }
        return storelastWeek;
    }

    public int getToday() {
        int n = birdsPerDay.length;
        return birdsPerDay[n-1] ;
    }

    public void incrementTodaysCount() {
        int j = birdsPerDay.length;
        birdsPerDay[j-1] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i=0; i<birdsPerDay.length;i++){
            if (birdsPerDay[i]==0) {    
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays){
        int total_birds=0;
        int daysToCount;
        daysToCount = Math.min(numberOfDays, birdsPerDay.length);
        for (int i=0; i<daysToCount ;i++){
                total_birds += birdsPerDay[i];
            }  
        return total_birds;
    }

    public int getBusyDays() {
        int counter=0;
        for (int i=0; i<birdsPerDay.length;i++){
            if (birdsPerDay[i]>=5){
                counter++;
            }          
        }
        return counter;
    }
    
}
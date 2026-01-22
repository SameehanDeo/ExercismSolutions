public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minInOven){
        return expectedMinutesInOven() - minInOven;                
    }

    public int preparationTimeInMinutes(int noLayers){
        return noLayers*2;
    }

    public int totalTimeInMinutes(int noLayers,int min ){
        return min + preparationTimeInMinutes(noLayers);
    }
}

package HomeWorkLMS.Tapshyrma1.db;

public class Generator {
    private static Long actorID = 1L;
    private static Long movieID = 1L;
    private static Long producerID = 1L;

    public static Long setActorID(){
        return actorID++;
    }
    public static Long setMovieID(){
        return movieID++;
    }
    public static Long setProducerID(){
        return producerID++;
    }

}

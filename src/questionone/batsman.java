package questionone;

public interface batsman extends cricketer 
{
    int score = 0; // Initialized field
    int batsmanRanking = 0; // Initialized field

    void print();

    int getRanking();
}

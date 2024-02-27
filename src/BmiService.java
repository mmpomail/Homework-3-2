public class BmiService {
    public int calculate(float heightMeters, int massKG) {

        float index = (float) massKG / (heightMeters * heightMeters);
        return (int) index;

    }
}

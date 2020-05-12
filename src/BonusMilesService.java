public class BonusMilesService {
    public long calculate(int cost) {
        int spent=20;
        int bonus = cost / spent;
        return bonus;
    }
}

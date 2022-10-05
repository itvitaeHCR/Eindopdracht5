import java.security.spec.ECFieldF2m;

public class Main {
    public static void main(String[] args) {
        RiverRafting riverRafting = new RiverRafting();
        try {
            riverRafting.throughRapids(9);
            riverRafting.rowBoat("okay");
            riverRafting.sharkSighted(false);
        } catch (FallInRiverException e) {
            System.out.println("Get back in!");
        } catch (DropOarException e) {
            System.out.println("Don't panic");
        } catch (SharksException e) {
            System.out.println("da dum, da dum, dadum dadum dadum");
        } finally {
            System.out.println("Git");
        }
    }
}

class FallInRiverException extends Exception {}
class DropOarException extends Exception {}
class SharksException extends Exception {}

class RiverRafting {
    void throughRapids(int speed) throws FallInRiverException {
        System.out.println("Through the rapids!");
        if (speed > 10) throw new FallInRiverException();
    }
    void rowBoat (String state) throws DropOarException {
        System.out.println("Row row row your boat");
        if (state.equals("nervous")) throw new DropOarException();
    }
    void sharkSighted (boolean shark) throws SharksException {
        System.out.println("No sharks in sight!");
        if (shark == true) throw new SharksException();
    }
}
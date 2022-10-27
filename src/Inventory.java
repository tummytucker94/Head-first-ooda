import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood){
        Guitar guitar = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator();i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar){
        for(Iterator i = guitars.iterator();i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder()))){
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase()))){
                continue;
            }

            String type = searchGuitar.getType();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))){
                continue;
            }

            String backWood = searchGuitar.getBackWood();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel()))){
                continue;
            }

            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood()))){
                continue;
            }
        }
        return null;
    }
}

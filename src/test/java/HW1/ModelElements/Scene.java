package HW1;

import java.util.ArrayList;

public class Scene {
    int id;
    ArrayList<PoligonalModel> models = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();

    public Scene(int id, PoligonalModel sourceModel, Flash sourceFlash) throws IllegalArgumentException  {
        this.id = id;
        this.flashes.add(sourceFlash);
        if (sourceModel.equals(null)) {
            throw new RuntimeException();
        } else {
        this.models.add(sourceModel);
        }


    }

    public <T>T method1 (T type) {
        T result = null;

        return result;
    }

    public <T>T method2 (T type1, T type2) {
        T result = null;
  
        return result;
    }
}

package HW1;

import java.awt.*;
import java.util.ArrayList;

public class ModelStore implements IModelChanger, IModelChangedObserver {
    int id;
    ArrayList<PoligonalModel> models = new ArrayList<>();
    ArrayList<Scene> scenes = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();
    ArrayList<Camera> cameras = new ArrayList<>();
    private IModelChangedObserver changeObservers;
    private int sceneId;
    private Point3D location;
    private Angle3D angle;
    private Texture sourceTexture;
    private PoligonalModel sourceModel;
    private Flash sourceFlash;
    private Color color;
    private float power;


    public ModelStore(int id) {
        this.id = id;
        this.models.add(new PoligonalModel(sourceTexture));
        this.scenes.add(new Scene(sceneId, sourceModel, sourceFlash));
        this.flashes.add(new Flash(location, angle, color, power));
        this.cameras.add(new Camera(location, angle));

    }


    public Scene getScena(int id) {
        Scene result = null;

        return result;

    }

    public void notifyChange(IModelChanger changer) {

    }

}

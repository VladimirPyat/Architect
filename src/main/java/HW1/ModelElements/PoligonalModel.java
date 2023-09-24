package HW1.ModelElements;

import java.util.ArrayList;

public class PoligonalModel {

    ArrayList<Texture> textures = new ArrayList<>();
    ArrayList<Poligon> poligons = new ArrayList<>();

    public PoligonalModel(Texture sourceTexture) {

        this.textures.add(sourceTexture);
        this.poligons.add(new Poligon());

    }
}



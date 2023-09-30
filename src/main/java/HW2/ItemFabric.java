package HW2;

public abstract class ItemFabric {
    public void openReward(){
        iGameItem gameItem = this.createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}

package order;

import flowerstore.FlowerPack;
import flowerstore.FlowerType;

public enum FastOrderConstructor {
    ROSE_PACK_10, CHAMOMILE_PACK_10, TULIP_PACK_10;
    public static Order createOrder(FastOrderConstructor orderType) {
        Order stdOrder = new Order();
        FlowerPack pack;
        if (orderType == ROSE_PACK_10) {
            pack = new FlowerPack(FlowerType.ROSE);
        } else if (orderType == CHAMOMILE_PACK_10) {
            pack = new FlowerPack(FlowerType.CHAMOMILE);
        } else {
            pack = new FlowerPack(FlowerType.TULIP);
        }
        pack.setAmount(10);
        stdOrder.addItem(pack);
        return stdOrder;
    }
}

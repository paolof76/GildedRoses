package my.code.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItems() {
        for (int i = 0; i < items.length; i++) {
        	updateItemQuality(items[i]);
        }
        
        for (int i = 0; i < items.length; i++) {
    		changeItemSellIn(items[i]);
        }
    }

	private void updateItemQuality(Item item) {
		QualityChanger changer = new QualityChangerFactory().createChanger(item.name);
		item.quality = changer.change(item.quality, item.sellIn);
	}
	
	private void changeItemSellIn(Item item) {
		if (!item.name.equals(ItemNames.SULFURAS.getName())) {
		    item.sellIn = item.sellIn - 1;
		}
	}
}

